/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author rssilva
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        //r = (x < y && y < z) ? true : false; // op AND - r = true
        //r = (x < y && y == z) ? true : false; // op AND - r = false
        //r = (x < y || y == z) ? true : false; //op OR - r = true
        //r = (x < y ^ y == z) ? true : false; // op OR exclusivo - r = true
        r = (x < y ^ y < z) ? true : false; // op OR exclusivo - r = false
        System.out.println(r);
    }
    
}
