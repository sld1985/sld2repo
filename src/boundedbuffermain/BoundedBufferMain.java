/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedbuffermain;

/**
 *
 * @author stefandanielsen
 */
public class BoundedBufferMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
       BoundedBuffer b = new BoundedBuffer(5);
       producer p = new producer(10, b);
    }
}
