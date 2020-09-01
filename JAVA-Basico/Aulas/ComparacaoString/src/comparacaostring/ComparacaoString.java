/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author rssilva
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Rafael";
        String nome2 = "Rafael";
        String nome3 = new String("Rafael");
        String res;
        //res = (nome1 == nome2) ? "igual" : "diferente"; // vai dar "igual"
        //res = (nome1 == nome3) ? "igual" : "diferente"; // vai dar "diferente" pois a forma de declarar está num escopo diferente, Solução nesse casp esta abaixo.
        res = (nome1.equals(nome3)) ? "igual" : "diferente"; // vai dar igual pois o .equals confere o "conteudo da variavel, ignorando o escopo de declaracção"
        System.out.println(res);
    }
    
}
