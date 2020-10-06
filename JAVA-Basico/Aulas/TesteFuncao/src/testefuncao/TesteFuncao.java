/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author rssilva
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    // PROCEDIMENTO/FUNCAO sem retorno "void"
    /*static void soma(int a, int b){
    **    int s = a + b;
    **    System.out.println("A soma de " + a + " + " + b + " é: " + s);
    }*/
    
    // PROCEDIMENTO/FUNCAO com retorno
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
