package queue;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedQueue<>();
        queue.add("Sai");
        queue.add("glass");
        queue.add("power");
        queue.add("powsfsdfs");
        queue.add("powsfsdfs");
        queue.add("power");
        queue.add("glass");
        queue.add("Sai");

        System.out.println("isPalindrome: "+isPalindrome(queue));

    }
    public static <T> boolean isPalindrome(Queue<T> queue){
        Queue<T> safeQueue = new LinkedQueue<>();
        int size = queue.size();
        for (int i = 0; i< size; i++){
            T data = queue.poll();
            safeQueue.add(data);
            queue.add(data);
        }
        for (int i = 1; i<= size/2; i++){
            if(!checkMatchForFirstAndLastNodes(safeQueue))
                return false;
        }
        return true;
    }

    private static <T> boolean checkMatchForFirstAndLastNodes(Queue<T> queue) {
        Queue<T> safeQueue = new LinkedQueue<>();
        queue.add(queue.poll());
        int size = queue.size();
        for (int i = 1; i<=size-2; i++){
            safeQueue.add(queue.poll());
        }
        if (!(queue.poll().equals(queue.poll()))){
            return false;
        }
        for (int i = 1; i<=size-2; i++){
            queue.add(safeQueue.poll());
        }
        return true;
    }
}
