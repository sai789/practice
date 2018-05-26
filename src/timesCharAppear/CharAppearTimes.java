package timesCharAppear;

import java.util.ArrayList;

public class CharAppearTimes {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('e');
        list.add('Z');
        list.add('q');
        list.add('e');
        list.add('Q');
        System.out.println("Significant character: "+findSignificantCharacter(list));
        System.out.println("Count: "+countOfSignificantCharacterIn(list));
    }
    private static char findSignificantCharacter(ArrayList<Character> list){
        char significant = list.get(0);
        for (Character c : list) {
            if (Character.toLowerCase(significant) > Character.toLowerCase(c)){
                significant = c;
            }
        }
        return significant;
    }
    public static int countOfSignificantCharacterIn(ArrayList<Character> list){
        char significant = findSignificantCharacter(list);
        int count = 0;
        for (Character c : list) {
            if (Character.toLowerCase(significant) == Character.toLowerCase(c)){
                count++;
            }
        }
        return count;
    }
}
