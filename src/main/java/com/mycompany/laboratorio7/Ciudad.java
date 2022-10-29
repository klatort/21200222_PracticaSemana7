/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio7;

/**
 *
 * @author Fabo
 */
public class Ciudad {
    private String codigo;
    private String nombre;
    private Aereopuerto aereopuerto;
    
    public Ciudad(String codigo, String nombre, Aereopuerto aereopuerto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.aereopuerto = aereopuerto;
    }
    
    public Aereopuerto getAereopuerto(String codCiudad){
        return this.aereopuerto;
    }
}
