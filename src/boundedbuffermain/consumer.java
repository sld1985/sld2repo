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
        while (true) {
            try {
                int element = b.take();

                System.out.println("jeg tager " + element + " fra listen");
                if (element == -3) {
                    break;
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(consumer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}