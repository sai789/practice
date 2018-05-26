package scoregame;

import java.io.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Text file Game!!!");

        System.out.print("Please enter you name:");
        Scanner scanner = new Scanner(System.in);
        //Taking input user name
        String userName = scanner.nextLine();


        System.out.println("Please answer at least 5 multiple choice questions!");

        //settingUp everything to write to scores.txt
        String scoresFilePath = "//Users//saikv//Desktop//saikumar//Practice projects//practice//src/scoregame/scores.txt";
        File outputFile = new File(scoresFilePath);
        BufferedWriter psw = new BufferedWriter(new FileWriter(outputFile.getAbsoluteFile(), true));
        PrintWriter pw = new PrintWriter(psw);

        //settingUp everything to read from questions.txt
        String questionsFilePath = "/Users/saikv/Desktop/saikumar/Practice projects/practice/src/scoregame/questions.txt";
        Scanner fileScan = (new Scanner(new File(questionsFilePath)));

        int score = 0;//tracks score of user

        while (fileScan.hasNextLine()) {

            String question = fileScan.nextLine();//gets question from file
            String options = fileScan.nextLine();//gets options from file
            String answer = fileScan.nextLine().split(":")[1];//gets correct answer mentioned in file

            System.out.println(question);
            System.out.println(options);

            System.out.println("Enter your choice to answer:");
            String choiceOfUser = scanner.nextLine();//getting user answer to the question
            if (isAnswerCorrect(answer, choiceOfUser)) {
                //if user answers correctly, then increment score
                score++;
            }
        }
        pw.println(userName+"\t"+score);//write username and score to score.txt file
        pw.flush();

        printAllUsersScores(scoresFilePath);//Finally, show all previous users names and scores
    }

    private static boolean isAnswerCorrect(String answer, String choiceOfUser) {
        return answer.equals(choiceOfUser);
    }

    private static void printAllUsersScores(String questionsFilePath) throws FileNotFoundException {
        Scanner reader = new Scanner(new File(questionsFilePath));
        while (reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
    }

}