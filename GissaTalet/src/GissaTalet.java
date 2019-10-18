/*
Uppgift: Gissa Talet
Skapad 17-10-2019
Dev: Rasmus Gillberg
*/

import java.util.Random;
import javax.swing.*;

    public class GissaTalet {
        public static void main(String[] args) {
            int gissa = 0;
            Random rand = new Random();
            int n = rand.nextInt(100);
            int försök = 0;


            gissa = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa talet"));
            while (gissa != n) {

                if (gissa < n) {
                    JOptionPane.showMessageDialog(null, "För lågt!");
                    gissa = Integer.parseInt(JOptionPane.showInputDialog(null, "Välj ett större tal än " + gissa));
                    försök++;
                }
                else if (gissa > n) {
                    JOptionPane.showMessageDialog(null, "För högt!");
                 gissa = Integer.parseInt(JOptionPane.showInputDialog(null, "Välj ett mindre tal än " + gissa));
                 försök++;

                }

                }
                if (gissa == n) {
                JOptionPane.showMessageDialog(null, "Du hade rätt! Du behövde " + försök + " försök!");
            }
        }
    }
