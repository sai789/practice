package countLines;

import java.io.*;
import java.util.Scanner;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        //Scanner to read a file
        Scanner in = null;
        try {
            in = new Scanner(new File("//Users//saikv//Desktop//saikumar//Practice projects//practice//src//countLines//fileToRead.txt"));
        } catch (FileNotFoundException e) {
            // if any problem to read file, prints error message and exits
            System.out.println("This file cannot be read :(");
            System.exit(0);
        }

        //returns number of lines and characters red from file
        String charAndLines[] = readFileContents(in);

        //Scanner to get user input to know output file name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter output file name to write result: ");
        String outputFileName = sc.nextLine();

        //to write the result to a new file
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("//Users//saikv//Desktop//saikumar//Practice projects//practice//src//countLines//"+outputFileName+".txt"));
            pw.write("Number of Lines: "+charAndLines[1]);
            pw.write("\nNumber of Characters: "+charAndLines[0]);

            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] readFileContents(Scanner in) {
        int noOfLines = 0;// initialize lines count to 0
        int noOfChars = 0;// initialize characters count to 0
        while (in.hasNextLine()) {
            String reader = in.nextLine();//read a line
            noOfLines++;//increase line count
            noOfChars += reader.toCharArray().length; // finds number of chars in that line and add to noOfCharacters
        }
        String result[] = new String[2];
        result[0] = noOfChars+"";
        result[1] = noOfLines+"";
        return result;
    }
}
