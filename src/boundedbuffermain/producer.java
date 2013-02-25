/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedbuffermain;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefandanielsen
 */
public class producer implements Runnable {

    private int max;
    private BoundedBuffer b;

    public producer(int max, BoundedBuffer b) throws InterruptedException {
        {
            this.max = max;
            this.b = b;

        }





    }

    public void run() {
        for (int i = 0; i < max; i++) {
            try {
                b.put(i);

            } catch (InterruptedException ex) {
                Logger.getLogger(producer.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("jeg putter nummer " + i + " ind i din liste");
        }

    }
}
