/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio7;

/**
 *
 * @author Fabo
 */
public class Asiento {
    private int nroAsiento;
    private char fila;
    private String estado;
    
    public Asiento(int nroAsiento, char fila, String estado){
        this.nroAsiento = nroAsiento;
        this.fila = fila;
        this.estado = estado;
    }
    public boolean reservarAsiento(){
        return true;
    }
    
    public boolean cancelarAsiento(){
        return true;
    }
    
    public boolean venderAsiento(){
        return true;
    }
}
