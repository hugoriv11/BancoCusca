/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class Transaccion {
    private int[] transacciones;
    
    public Transaccion() {}

    public Transaccion(int[] transacciones) {
        this.transacciones = transacciones;
    }

    public int[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int[] transacciones) {
        this.transacciones = transacciones;
    }
    
    
}
