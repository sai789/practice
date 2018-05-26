package superset;

import java.util.ArrayList;
import java.util.List;

public class SubarrayGenerator {
    public static void main(String[] args)
    {
        int[] listOne = {1,2};
        System.out.println(generateSubarrays(listOne));
        System.out.println("Expected: [[1], [2]], [[1, 2]]");
        int[] listTwo = {7,3,5};
        System.out.println(generateSubarrays(listTwo));
        System.out.println("Expected: [[7], [3], [5]],[[7, 3], [5]], [[7], [3, 5]], [[7, 3, 5]]");
        int[] listThree = {1,7,2,9};
        System.out.println(generateSubarrays(listThree));
        System.out.println("Expected: [[1], [7], [2], [9]],[[1, 7], [2], [9]],[[1], [7, 2], [9]],[[1, 7, 2], [9]], [[1], [7], [2, 9]],[[1, 7], [2], [9]], [[1], [7, 2, 9]], [[1, 7, 2, 9]]");
    }

    /**
     * A helper method for a method that recursively generate all ways
     * in which an array list can be split up into a sequence of
     * nonempty sublists.
     * @param sequence an array of integers
     * @return a string representing all non-empty sub-lists
     */
    public static String generateSubarrays(int[] sequence)
    {
        String result = "";
        List<String> list = new ArrayList<>();
        list.add("["+sequence[0]+"]");
        return generateSubarraysUsingRecursion(sequence,list,1);
    }

    private static String generateSubarraysUsingRecursion(int[] sequence, List<String> list, int position) {
        if (position >= sequence.length){
            return makeFlattenString(list);
        }
        List<String> resultList = new ArrayList<>();
        String addStr = sequence[position]+"]";
        for (String strInList: list){
            resultList.add(addSeparately(strInList, addStr));
            resultList.add(addInside(strInList, addStr));
        }
        return generateSubarraysUsingRecursion(sequence, resultList, position+1);
    }

    private static String addInside(String strInList, String addStr) {
        StringBuilder sb = new StringBuilder(strInList);
        return sb.replace(strInList.length()-1,strInList.length(),",").toString()+" "+addStr;
    }

    private static String addSeparately(String strInList, String addStr) {
        return strInList+", ["+addStr;
    }

    private static String makeFlattenString(List<String> list) {
        String result = "";
        String lastString = list.remove(list.size()-1);
        for (String str: list)
            result += "["+str + "],";
        result += "["+lastString + "]";
        return result;
    }
}
