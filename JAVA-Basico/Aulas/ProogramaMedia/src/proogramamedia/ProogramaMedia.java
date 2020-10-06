/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proogramamedia;

import java.util.Scanner;

/**
 *
 * @author rssilva
 */
public class ProogramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = keyboard.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = keyboard.nextFloat();
        float n = (n1 + n2) / 2;
        System.out.println("Sua media foi " + n);
        if(n > 9) {
            System.out.println("Parabéns!");
        }
    }  
}
