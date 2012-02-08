/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bumm;

/**
 *
 * @author sascha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("Bumm");
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + i);
        }
    }
}
