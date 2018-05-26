package postfix;

import java.io.*;

import java.util.Scanner;

import static java.lang.Math.*;



public class InfixToPostfix {

    private StringBuffer sb;

    public ObjectStack operators;



    public InfixToPostfix() {

        operators = new ObjectStack();

    }



    public String infixToPostfix(String reader) {

        sb = new StringBuffer("");

        for (char temp: reader.toCharArray()) {

            InfixToPostfix eval = new InfixToPostfix();

            int precedenceTemp = eval.priority(temp);

            if (Character.isDigit(temp)) {

                sb.append(temp);

            } else if (temp == '(') {

                operators.push(temp);

            } else if (temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '^') {



                if (operators.isEmpty() || precedenceTemp > eval.priority((Character) operators.top())) {

                    operators.push(temp);

                } else {



                    while (!operators.isEmpty() && precedenceTemp <= eval.priority((Character) operators.top())

                            && (Character) operators.top() != '(') {

                        sb.append((Character) operators.pop());

                    }



                    operators.push(temp);

                }

            } else if (temp == ')') {

                while ((Character) operators.top() != '(') {

                    sb.append((Character) operators.pop());

                }

                operators.pop();

            }
            else {
                System.out.println(sb);
            }

        }

        while (!operators.isEmpty()) {

            sb.append((Character) operators.pop());

        }

        return sb.toString();

    }



    public int priority(char op) {

        switch (op) {

            case '^':

                return 3;

            case '*':

            case '/':

                return 2;

            case '+':

            case '-':

                return 1;

            default:

                return 0;

        }

    }

}
