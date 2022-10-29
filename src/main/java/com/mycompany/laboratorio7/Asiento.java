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
        this.estado = "Ocupado";
        return true;
    }
    
    public boolean cancelarAsiento(){
        if("Comprado".equals(this.estado)){
            return false;
        }
        this.estado = "Libre";
        return true;
    }
    
    public boolean venderAsiento(){
        if("Comprado".equals(this.estado)){
            this.estado = "Libre";
            return true;
        }
        return false;
    }
    
    public int nroAsiento(){
        return this.nroAsiento;
    }
    
    public char getFila(){
        return this.fila;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
}
