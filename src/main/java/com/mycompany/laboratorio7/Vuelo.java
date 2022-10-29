/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio7;

/**
 *
 * @author Fabo
 */
public class Vuelo {
    private String codigo;
    private String fecha;
    private String hora;
    
    public Vuelo(String codigo, String fecha, String hora){
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public boolean venderAsiento(String nroAsiento, char fila){
        return true;
    }
    
    public Asiento[] asientosDisponibles(){
        Asiento[] aux = new Asiento[10];
        return aux;
    }
    
    public boolean reservarAsiento(String nroAsiento, char fila){
        return true;
    }
    
    public boolean cancelarAsiento(String nroAsiento, char fila){
        return true;
    }
}
