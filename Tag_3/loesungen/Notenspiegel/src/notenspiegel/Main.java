/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notenspiegel;

/**
 *
 * @author sascha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] notenspiegel = new int[] { 2, 5, 12, 8, 5 };

        int summe = 0;
        int anzahl = 0;
        double durchschnitt;

        summe = notenspiegel[0] + 2*notenspiegel[1]
                + 3*notenspiegel[2] + 4*notenspiegel[3]
                + 5*notenspiegel[4];
        anzahl = notenspiegel[0] + notenspiegel[1]
                + notenspiegel[2] + notenspiegel[3]
                + notenspiegel[4];

        for(int i = 0; i < notenspiegel.length; i++) {
            summe += notenspiegel[i] * (i+1);
            anzahl += notenspiegel[i];
        }
     
        durchschnitt = (double)summe / anzahl;

        System.out.println("Durchschnitt: "
                + ((int)(durchschnitt * 100)/100.0));

    }
}
