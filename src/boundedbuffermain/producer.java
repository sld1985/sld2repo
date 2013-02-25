/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedbuffermain;

/**
 *
 * @author stefandanielsen
 */
public class producer {

    private int max;
    private BoundedBuffer b;

    public producer(int max, BoundedBuffer b) throws InterruptedException {
        {
            for (int i = 0; i <= max; i++) {
               b.put(i);
               System.out.println( "jeg putter nummer "+ i +" ind i din liste");
            }

        }

    }
}
