/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;


public class Main {
    public static void main(String []args){
        Cliente cliente1 = new Cliente("Rolando", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Alex", new int[] { 1, 3, 5, 1, 1 });
        Cliente cliente3 = new Cliente("Ernesto", new int[] { 2, 2, 2, 1, 1, 1 });
        Cliente cliente4 = new Cliente("Alexander", new int[] { 1, 8, 3, 3, 5 });

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        
        Cajero cajero1 = new Cajero("Hugo", cliente1, initialTime);
        Cajero cajero2 = new Cajero("Ruben", cliente2, initialTime);
        Cajero cajero3 = new Cajero("Victor", cliente3, initialTime);
        Cajero cajero4 = new Cajero("Steven", cliente4, initialTime);

        cajero1.start();
        cajero2.start();
        cajero3.start();
        cajero4.start();
    }
}
