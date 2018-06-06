/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;


public class Main {
    public static void main(String []args){
        Cliente cliente1 = new Cliente("Hugo", new int[]{2,4,6,8,9});
        Cliente cliente2 = new Cliente("Steven", new int[]{1,3,5,7,9});
     
        Cajero cajero1 = new Cajero("Victor");
        Cajero cajero2 = new Cajero("Victor^2");
        
        long initialTime = System.currentTimeMillis();
        
        cajero1.procesarTransaccion(cliente1, initialTime);
        cajero2.procesarTransaccion(cliente2, initialTime);
    }
}
