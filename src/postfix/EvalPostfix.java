package postfix;

import java.io.*;

import java.util.Scanner;

import static java.lang.Math.*;



public class EvalPostfix {

    private int infix;

    private ObjectStack valueStack;

    private ObjectStack operatorStack;



    public EvalPostfix() {

        valueStack = new ObjectStack();

        operatorStack = new ObjectStack();

    }



    public int evalPostFix(String converted) {

        for (char temp: converted.toCharArray()) {

            if (Character.isDigit(temp)) {

                int tempInt = Character.getNumericValue(temp);

                valueStack.push(tempInt);

            }

            else if (temp == '+') {

                int op1 = (Integer) (valueStack.pop());

                int op2 = (Integer) valueStack.pop();

                int newVal = op2 + op1;

                valueStack.push(newVal);

            }

            else if (temp == '*') {

                int op1 = (Integer) valueStack.pop();

                int op2 = (Integer) valueStack.pop();

                int newVal = op2 * op1;

                valueStack.push(newVal);

            }

            else if (temp == '/') {

                int op1 = (Integer) valueStack.pop();

                int op2 = (Integer) valueStack.pop();

                int newVal = op2 / op1;

                valueStack.push(newVal);

            }

            else if (temp == '-') {

                int op1 = (Integer) valueStack.pop();

                int op2 = (Integer) valueStack.pop();

                int newVal = op2 - op1;

                valueStack.push(newVal);

            }

            else if (temp == '^') {

                int op1 = (Integer) valueStack.pop();

                int op2 = (Integer) valueStack.pop();

                int newVal = (int) Math.pow(op2, op1);

                valueStack.push(newVal);

            }

        }

        return (Integer)valueStack.pop();

    }

}
