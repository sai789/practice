import java.util.Scanner;
public class ThreeLetterAcronym {
    public String main(Scanner s){
        Scanner scanner = s;
        System.out.println("Enter 3 words:");
        String wholeInput = scanner.nextLine();
        String words[] = wholeInput.split(" ");
        String result="";
        for (int i=0;i<3;i++)
            result += words[i].toUpperCase().charAt(0);
        System.out.println("The Three-Letter Acronym: "+result);
        return result;
    }
}
