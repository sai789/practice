package negativePop;

import java.io.*;
import java.util.*;
public class Main {
    static String output = "";
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); //initializes Scanner to take input from user
        PrintWriter pw = new PrintWriter(new FileWriter("/Users/saikv/Desktop/saikumar/Practice projects/practice/src/negativePop/output.txt"));
        Stack<Integer> storedNumbers = new Stack<>();//initializes stack ADT to store inputs
        int input, numberOfInputsRead = 0;

        while (numberOfInputsRead < 50){ // Loop till we get 50 input numbers from user
            input = readData(scanner);// reads data from user
            numberOfInputsRead++;//tracks how many inputs we red from user
            if (input < 0){ // if user gives a negative number
                displayNumbersPriorToNegativeNumber(storedNumbers);// displays all prior non-negative numbers
            }
            else {
                storedNumbers.push(input);// if not a negative number push into stack
                output += "\n"+ input +" is pushed to stack!";
            }
        }
        System.out.println(output);
        pw.write(output);
        pw.flush();
    }

    private static void displayNumbersPriorToNegativeNumber(Stack<Integer> storedNumbers) {
        output += "\nIt's a negative number. You entered below non-negative numbers(in reverse order) till now!";
        while (!storedNumbers.isEmpty()){ // pop till stack is empty
            output += "\n"+storedNumbers.pop();
        }
    }

    private static int readData(Scanner scanner) {
        System.out.print("Enter a number:");

        int input = scanner.nextInt();
        output += "\nYou have entered "+ input;

        return input;
    }
}
