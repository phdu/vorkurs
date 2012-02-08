/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package monate;

/**
 *
 * @author sascha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String namen[] = new String[] {
            "Januar", "Februar", "März", "April",
            "Mai", "Juni", "Juli", "August",
            "September", "Oktober", "November", "Dezember" };
        int tage[] = new int[] {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31 };

        for (int i = 0; i < namen.length; i++) {
            System.out.println("Der Monat " + namen[i]
                    + " hat " + tage[i] + " Tage.");
        }
    }
}
