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
       Thread pc = new Thread(p); 
       consumer c = new consumer(b, 10);
       Thread pc2 = new Thread(c);
       pc.start();
       pc2.start();
    }
}
