package postfix;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.*;

import java.util.Scanner;



public class Driver {



    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("/Users/saikv/Desktop/saikumar/Practice projects/practice/src/postfix/csis.txt"));

        Scanner fileScan = (new Scanner(new File("/Users/saikv/Desktop/saikumar/Practice projects/practice/src/postfix/infix.txt")));

        InfixToPostfix infix = new InfixToPostfix();

        EvalPostfix eval = new EvalPostfix();



        while (fileScan.hasNextLine()) {



            String reader = fileScan.nextLine();

            String converted = infix.infixToPostfix(reader);

            int finalValue = eval.evalPostFix(converted);

            System.out.println("Infix: " + reader + " Postfix: " + converted + " Final Value: " + finalValue);

            pw.println("Infix: " + reader + "Postfix: " + converted + "Final Value: " + finalValue);

            pw.flush();

        }



    }

}