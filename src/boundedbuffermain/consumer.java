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
public class consumer implements Runnable {

    BoundedBuffer b;
    int max;

    public consumer(BoundedBuffer b, int max) {

        this.b = b;
        this.max = max;
    }

    public void run() {

        for (int i = 0; i <= max; i++) {
            try {
                System.out.println("jeg tager " + b.take() + " fra listen");
            } catch (InterruptedException ex) {
                Logger.getLogger(consumer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}