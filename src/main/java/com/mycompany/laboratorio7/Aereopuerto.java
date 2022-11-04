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
    private Ciudad ciudadOrigen;
    
    public Aereopuerto(String nombre, String direccion, Ciudad ciudadOrigen){
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudadOrigen = ciudadOrigen;
    }
}
