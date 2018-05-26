package matchBrackets;

import java.util.HashMap;
import java.util.Scanner;
public class Match {
    char contents[] = new char[50];
    int stackPointer = -1;
    HashMap<Character, Character> list = new HashMap<>();
    public static void main(String[] args) {
        Match match = new Match();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        match.isBalanced(scanner.nextLine());
    }

    //constructor that initializes list of symbols that stack supports and defines it's curresponding match symbol
    public Match(){
        list.put('<','>');
        list.put('{','}');
        list.put('(',')');
        list.put('[',']');
    }
    //processes given input string on stack
    public void isBalanced(String expression) {
        for (int i=0;i<expression.length();i++){
            if (stackPointer >= 0 && list.get(contents[stackPointer]) != null && list.get(contents[stackPointer]) == expression.charAt(i))
                this.pop();
            else this.push(expression.charAt(i));
        }
        //After processing string, if stack pointer is again at same position(-1) as balanced before
        //then we print True
        //Otherwise False
        if (stackPointer == -1)
            System.out.println("True");
        else System.out.println("False");
    }

    //pops the character whenever latest char matches with current checking character
    //Just decrements pointer
    public void pop() {
        stackPointer--;
    }

    //pushes bracket whenever latest char does not matche with current checking character
    //first increments pointer to hold next character in stack
    //then puts character in contents(stack)
    public void push(char bracketSymbol) {
        contents[++stackPointer] = bracketSymbol;
    }
}
