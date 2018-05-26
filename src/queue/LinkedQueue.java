package queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> head, tail;
    private int size;
    /** Creates a new instance of LinkedQueue */
    public LinkedQueue() {
        head = tail = null;
        size = 0;
    }
    public boolean full() {
        return false;
    }
    public boolean add(T e) {
        if(tail == null){
            head = tail = new Node<T>(e);
        }
        else {
            tail.next = new Node<T>(e);
            tail = tail.next;
        }
        size++;
        return true;
    }
    public T poll() {
        T x = head.data;
        head = head.next;
        size--;
        if(size == 0)
            tail = null;
        return x;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}
