package linkedbad;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedBag<T> {

    private LinkedList<T> firstNode;
    private int numberOfEntries;

    LinkedBag(){
        firstNode = new LinkedList<>();
        numberOfEntries = 0;
    }

    public void add(T value){
        firstNode.add(value);
    }

    public LinkedBag<T> difference(LinkedBag<T> bag){
        LinkedBag<T> newBag = new LinkedBag<>();
        ArrayList<T> removableNodes = new ArrayList<>();
        for (T node : firstNode) {
            if (bag.firstNode.contains(node)){
                removableNodes.add(node);
                bag.firstNode.remove(node);
            }
        }
        System.out.println(removableNodes);
        return newBag;
    }
}
