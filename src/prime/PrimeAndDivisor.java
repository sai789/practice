package prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeAndDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        //input number
        int number = input.nextInt();
        //stores divisors
        List<Integer> divisors = new ArrayList<>();
        int i=2;
        //divides number by 2,3,,,,,number-1
        while (i < number){
            if (number % i == 0)// if true, it is a divisor
                divisors.add(i);
            i++;
        }
        if (divisors.size()>0){
            System.out.print(number + " is not a prime number."+number+" can be divided by:");
            for (Integer divisor : divisors) {
                System.out.print(divisor+", ");
            }
        }
        else System.out.println(number+" is a prime number");
    }
}
