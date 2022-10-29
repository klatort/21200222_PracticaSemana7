/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio7;

/**
 *
 * @author Fabo
 */
public class Pais {
    private String codigo;
    private String nombre;
    private Ciudad[] ciudades;
    
    public Pais(String codigo, String nombre, Ciudad[] ciudades){
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudades = ciudades;
    }
    
    public Ciudad[] getCiudades(/*codPais*/){
        return this.ciudades;
    }
}
