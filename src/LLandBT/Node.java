package LLandBT;

public class Node {
    private String ID;
    private Node next;

    public Node(String id) {
        ID = id;
        this.next = null;
    }
    public void print(){
        System.out.println(ID);
        if (next != null)
            next.print();
    }
    public void addNext(Node next){
        this.next = next;
    }

    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        a.addNext(b);
        b.addNext(c);
        c.addNext(d);
        d.addNext(e);

        System.out.println("Calling print() on "+e.ID+":");
        e.print();
        System.out.println();

        System.out.println("Calling print() on "+a.ID+":");
        a.print();
    }
}
