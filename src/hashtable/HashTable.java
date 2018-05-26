package hashtable;

import java.util.LinkedList;

public class HashTable {
    //You can make this array size to be 128.
    static int input[] = {4371, 1323, 6173, 4199, 4344, 9679, 1989};

    public static void main(String[] args) {
        LinkedList<Integer> hashTableLL[] = new LinkedList[10];
        for (int i = 0;i<hashTableLL.length; i++) {
            hashTableLL[i] = new LinkedList<>();
        }
        doChaining(hashTableLL.clone());

        System.out.println();
        System.out.println();

        int hashTableLinear[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        doLinearProbing(hashTableLinear);

//        System.out.println();
//        System.out.println();
//
//        int hashTableQuadratic[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
//        doQuadraticProbing(hashTableQuadratic);
    }

//    private static void doQuadraticProbing(int[] hashTable) {
//        for (int value : input) {
//            int hash = value % 10;
//            int probe = 1;
//            while (hashTable[hash] != -1){
//                hash = quadraticProb(probe, hash, hashTable.length);
//                hash %= 10;
//                probe++;
//            }
//            hashTable[hash] = value;
//        }
//        System.out.println("After Quadratic Probing Hashtable structure:");
//        print(hashTable);
//    }

//    private static int quadraticProb(int probe, int hash, int length) {
//        return (((int) Math.pow(probe,2)) + hash) % length;
//    }

    private static void doLinearProbing(int[] hashTable) {
        for (int value : input) {
            int hash = value % 10;
            while (hashTable[hash] != -1){
                hash++;
                hash %= 10;
            }
            hashTable[hash] = value;
        }

        System.out.println("After Linear Probing Hashtable structure:");
        print(hashTable);
    }

    private static void print(int[] hashTable) {
        for (int i = 0;i<hashTable.length; i++){
            String toPrint = (hashTable[i] == -1)?"":hashTable[i]+"";
            System.out.println(i+") "+toPrint);
        }
    }

    private static void doChaining(LinkedList<Integer>[] hashTable) {
        for (int value : input) {
            int hash = value % 10;
            hashTable[hash].add(value);
        }
        System.out.println("After Chaining Hashtable structure:");
        int index = 0;
        for (LinkedList list : hashTable) {
            System.out.print(index+") ");
            for (int i = 0;i<list.size(); i++){
                System.out.print(list.get(i));
                if (list.size() > i+1)
                    System.out.print(" -> ");
            }
            System.out.println();
            index++;
        }
    }

}