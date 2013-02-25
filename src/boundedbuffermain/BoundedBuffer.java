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
    private Boolean full;
    private int element;

    public BoundedBuffer(int spaces) throws IllegalArgumentException {

        this.spaces = spaces;
        que = new LinkedList<Integer>();

    }

    public int getSpaces() {
        return spaces;
    }

    /**
     *
     * @return returns false per defaulte
     */
    public boolean isFull() {
        if (que.size() == spaces) {
            full = true;

        }
        return full;
    }
/**
 * 
 * @param element er det vi putter ind i vores linkedList
 */
    public void put(int element) throws InterruptedException {
        while(isFull())
                {
                   wait();
        }
        que.add(element);

    }
    /**
     * 
     * @return  take tager et element fra linkedlist og fjerner det fra listen
     */

    public int take() {
        notifyAll();
        return que.remove();

    }
}
