/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

/**
 *
 * @author sascha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 1;
        int b = 1;
        int t;

        System.out.print("1 ");

        while (b < 1000) {
            System.out.print(b + " ");
            t = a + b;
            a = b;
            b = t;
        }

    }
}
