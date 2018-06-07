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
public class Cajero extends Thread{

        
//    private String nombre;
//
//    public Cajero(String nombre) {
//        this.nombre = nombre;
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
//    public void procesarTransaccion(Cliente cliente, long timeStamp) {
//
//		System.out.println("El cajero " + this.nombre + 
//				" COMIENZA A PROCESAR LA TRANSSACCION DEL CLIENTE " + cliente.getNombre() + 
//				" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
//				"seg");
//
//		for (int i = 0; i < cliente.getTransacciones().length; i++) { 
//				this.esperarXsegundos(cliente.getTransacciones()[i]); 
//				System.out.println("Procesado la transaccion " + (i + 1) +  
//				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
//				"seg");
//		}
//
//		System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " + 
//				cliente.getNombre() + " EN EL TIEMPO: " + 
//				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");
//
//	}
//
//
//	private void esperarXsegundos(int segundos) {
//		try {
//			Thread.sleep(segundos * 1000);
//		} catch (InterruptedException ex) {
//			Thread.currentThread().interrupt();
//		}
//	}

    private Cliente cliente;
    private String nombre;
    private long initialTime;
    
    
    public Cajero() {}
    
    public Cajero(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    @Override
    public void run() {

        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA TRANSACCION DEL CLIENTE " 
                                + this.cliente.getNombre() + " EN EL TIEMPO: " 
                                + (System.currentTimeMillis() - this.initialTime) / 1000 
                                + "seg");

        for (int i = 0; i < this.cliente.getTransacciones().length; i++) { 

            this.esperarXsegundos(cliente.getTransacciones()[i]); 
            System.out.println("Procesando la transaccion " + (i + 1) 
            + " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
            + (System.currentTimeMillis() - this.initialTime) / 1000 
            + "seg");
        }

        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " 
                                        + this.cliente.getNombre() + " EN EL TIEMPO: " 
                                        + (System.currentTimeMillis() - this.initialTime) / 1000 
                                        + "seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
