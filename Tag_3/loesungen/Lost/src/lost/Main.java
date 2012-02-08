/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lost;

/**
 *
 * @author sascha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] zahlenfolge = new int[] { 4, 8, 15, 16, 23, 42 };

        int[] neueZF = new int[zahlenfolge.length + 3];

        for (int i = 0; i < zahlenfolge.length; i++) {
            neueZF[i] = zahlenfolge[i];
        }

        neueZF[neueZF.length - 3] = 108;
        neueZF[neueZF.length - 2] = 540;
        neueZF[neueZF.length - 1] = 7200;

        zahlenfolge = neueZF;

        for (int i = 0; i < zahlenfolge.length; i++) {
            System.out.print(neueZF[i] + " ");
        }
    }
}
