   #include <sys/wait.h>
   #include <stdio.h>
   #include <stdlib.h>
   #include <unistd.h>
   #include <string.h>

   int main(int argc, char * argv[])
   {
       int childToParentCommunicationPipe[2];
       int parentToChildCommunicationPipe[2];
       pid_t cpid;
       char buf;

       int read_ = pipe(childToParentCommunicationPipe); // create the pipe
       int write_ = pipe(parentToChildCommunicationPipe); // create the pipe
       if (read_ == -1) { perror("pipe"); exit(EXIT_FAILURE); }
       if (write_ == -1) { perror("pipe"); exit(EXIT_FAILURE); }
       cpid = fork(); // duplicate the current process
       if (cpid == 0) // if I am the child then
       {
           close(childToParentCommunicationPipe[1]);
           close(parentToChildCommunicationPipe[0]);
           printf("Child:I am child. I am reading message...\n");
           while (read(parentToChildCommunicationPipe[1], &buf, 1) > 0) // read while EOF
               write(1, &buf, 1);
           write(1, "\n", 1);
           printf("Child:I have completed reading message from parent.\n\n");
           char *clientMessage = "Response";
           write(childToParentCommunicationPipe[1], clientMessage, strlen(clientMessage));
           printf("Child:I have completed writing response.\n\n");
           exit(EXIT_SUCCESS);
       }
       else // if I am the parent then
       {
           char *parentMessage = "Message";
           close(childToParentCommunicationPipe[0]);
           close(parentToChildCommunicationPipe[1]);
           write(parentToChildCommunicationPipe[0], parentMessage, strlen(parentMessage));
           printf("Parent:I have completed writing message.\n\n");
           wait(NULL); // wait for the child process to exit before I do the same
           printf("Parent:I am Parent. I am reading response...\n");
           while (read(childToParentCommunicationPipe[0], &buf, 1) > 0) // read while EOF
              write(1, &buf, 1);
           write(1, "\n", 1);
           printf("Parent:I have completed reading response from child.\n\n");
           exit(EXIT_SUCCESS);
       }
       close(parentToChildCommunicationPipe[0]);
       close(parentToChildCommunicationPipe[1]);
       close(childToParentCommunicationPipe[0]);
       close(childToParentCommunicationPipe[1]);
       return 0;
   }