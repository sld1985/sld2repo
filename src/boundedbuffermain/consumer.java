/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedbuffermain;

/**
 *
 * @author stefandanielsen
 */
public class consumer {
    
    
    public consumer(BoundedBuffer b){
        
        System.out.println(b.take());
    }
    
    
}
