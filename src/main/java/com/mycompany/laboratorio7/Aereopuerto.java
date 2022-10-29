/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio7;

/**
 *
 * @author Fabo
 */
public class Aereopuerto {
    private String nombre;
    private String direccion;    
    private Vuelo[] llegada;
    private Vuelo[] salida;
    
    public Aereopuerto(String nombre, String direccion, 
            Vuelo[] llegada, Vuelo[] salida){
        this.nombre = nombre;
        this.direccion = direccion;
        this.llegada = llegada;
        this.salida = salida;
    }
}
