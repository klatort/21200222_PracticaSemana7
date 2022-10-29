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
    private Asiento[] asientos;
    
    public Vuelo(String codigo, String fecha, String hora,
            Asiento[] asientos){
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.asientos = asientos;
    }
    
    public boolean venderAsiento(int nroAsiento, char fila){
        for(Asiento it: asientos){
            if(it.getNroAsiento() == nroAsiento && it.getFila() == fila){
                    return it.venderAsiento();
            }
        }
        return false;
    }
    
    public Asiento[] asientosDisponibles(){
        Asiento[] aux = new Asiento[0];
        int cont = 0;
        for(Asiento it: this.asientos){
            if("Libre".equals(it.getEstado())){
                Asiento[] aux2 = new Asiento[cont + 1];
                aux2[cont] = it;
                cont++;
                aux = aux2;
            }
        }
        return aux;
    }
    
    public boolean reservarAsiento(int nroAsiento, char fila){
        return true;
    }
    
    public boolean cancelarAsiento(int nroAsiento, char fila){
        return true;
    }
}
