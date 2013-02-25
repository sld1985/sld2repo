/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedbuffermain;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author stefandanielsen
 */
public class BoundedBuffer {

    private int spaces;
    private Queue<Integer> que;
    private int removed;
    private int buffersize;

    public BoundedBuffer(int spaces) throws IllegalArgumentException {

        this.spaces = spaces;
        que = new LinkedList<Integer>();

    }

    public int getSpaces() {
        return spaces;
    }

    public boolean isEmpty() {
        return (que.size() == 0);
    }

    /**
     *
     * @return returns false per defaulte
     */
    public boolean isFull() {
        return (que.size() == spaces);
    }

    /**
     *
     * @param element er det vi putter ind i vores linkedList
     */
    public synchronized void put(int element) throws InterruptedException {
        while (isFull()) {
            wait();
        }
        que.add(element);
        notifyAll();

    }

    /**
     *
     * @return take tager et element fra linkedlist og fjerner det fra listen
     */
    public synchronized int take() throws InterruptedException {

        while (isEmpty()) {
            wait();
        }
        removed = que.remove();
        notifyAll();


        return removed;
    }
}
