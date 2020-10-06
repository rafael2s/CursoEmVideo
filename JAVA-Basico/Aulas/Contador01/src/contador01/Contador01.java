/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author rssilva
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int contador = 1;
        ** while(contador <= 4){
        **     System.out.println("Contando " + contador);
        **     contador++;
        ** }
        */
        int contador = 0;
        while(contador < 10){
            contador++;
            if(contador == 2 || contador == 3 || contador == 4) {
                continue;
            }
            if(contador == 7){
                break;
            }
            System.out.println("Contando " + contador);
            
        }
    }
    
}
