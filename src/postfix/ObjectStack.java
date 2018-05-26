package postfix;

public class ObjectStack implements ObjectStackInterface {

    private Object[] item;

    private int top;



    public ObjectStack(){

        item = new Object[1];

        top = -1;

    }



    @Override

    public boolean isEmpty() {

        return top == -1;

    }



    @Override

    public void push(Object o) {

        if (isFull()){

            resize(2*item.length);

        }

        item[++top] = o;

    }

    @Override

    public boolean isFull() {

        return top == item.length-1;

    }



    @Override

    public void clear() {

        item = new Object[1];

        top = -1;

    }



    @Override

    public Object pop() {

        if (isEmpty() == true){

            System.out.println("Stack is Empty cannot pop");

            System.exit(1);

        }

        Object temp = item[top--];

        if(top == item.length/4){

            resize(item.length/2);

        }

        return temp;

    }



    @Override

    public Object top() {

        if (isEmpty() == true){

            System.out.println("Stack is Empty cannot pop");

        }

        return item[top];

    }





    /** Private method to resize stack **/

    private void resize(int size){

        Object[] temp = new Object[size];

        for(int i = 0; i <= top; i++){

            temp[i] = item[i];

        }

        item = temp;

    }



}
