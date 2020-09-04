/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author rssilva
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Ola mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultador final <br>-------------------<br> Somatorio vale </html>" + s);
        
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
    }
    
}
