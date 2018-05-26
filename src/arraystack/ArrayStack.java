package arraystack;

public class ArrayStack {
    private int[] data;
    private int t = -1;
    public ArrayStack(int capacity){
        data = new int[capacity];
    }
    public int size(){
        return t+1;
    }
    public boolean isEmpty(){
        return t==-1;
    }
    public void push(int e){
        if(t==data.length-1){
            System.out.println("Overflow! Array stack is full\nYou cannot insert!");
            return;
        }
        data[++t] = e;
    }
    public int top(){
        return data[t];
    }
    public int pop(){
        if (t==-1){
            System.out.println("Underflow! Array stack is empty\nYou cannot pop!");
            return -1000000;
        }
        int top = top();
        t--;
        return top;
    }

    @Override
    public String toString() {
        String stack = "";
        for (int i=0;i<=t;i++){
            stack += data[i] + ", ";
        }
        return stack;
    }
    public void reverseStack(){
        for (int i=0;i<t/2;i++){
            int a = data[i];
            data[i] = data[t-i];
            data[t-i] = a;
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        arrayStack.pop();
        arrayStack.push(1);
        System.out.println(arrayStack);
        arrayStack.push(11);
        System.out.println(arrayStack);
        arrayStack.push(111);
        System.out.println(arrayStack);
        arrayStack.push(1110);
        System.out.println(arrayStack);
        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println("Top element:"+arrayStack.top());
        arrayStack.reverseStack();
        System.out.println(arrayStack);
        System.out.println("Top element:"+arrayStack.top());
        arrayStack.push(1111);
        System.out.println(arrayStack);
        arrayStack.push(1111);
        System.out.println(arrayStack);
    }
}
