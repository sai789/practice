package divisorsum;

import java.util.ArrayList;
import java.util.List;

public class DivisorSum {
    public static int sum = 0;
    public static void main(String[] args) {
        System.out.println(rec(4,4,1));
    }

    private static int rec(int actualNo, int no, int level) {
        List divisors = findDivisors(no);
        level++;
        for (Object divisor : divisors) {
            if (level == actualNo){
                sum+=(Integer)divisor;
                System.out.print(sum+",");
            }
            else{
                rec(actualNo, (Integer)divisor, level);
            }
        }
        return sum;
    }

    private static List findDivisors(int no) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=no;i++){
            if(no%i == 0)
                list.add(i);
        }
        return list;
    }
}
