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
public class Cliente {
    
    
//    private String nombre;
//    private int[] transacciones;
//
//    public Cliente(String nombre, int[] transacciones) {
//        this.nombre = nombre;
//        this.transacciones = transacciones;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public int[] getTransacciones() {
//        return transacciones;
//    }
//
//    public void setTransacciones(int[] transacciones) {
//        this.transacciones = transacciones;
//    }
//    
//    

    private String nombre;
    private int[] transacciones;
    
    public Cliente() {}
    
      public Cliente(String nombre, int[] transacciones) {
        this.nombre = nombre;
        this.transacciones = transacciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int[] transacciones) {
        this.transacciones = transacciones;
    }
    
}
