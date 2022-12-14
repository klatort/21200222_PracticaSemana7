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
    private Aereopuerto llegada;
    private Aereopuerto salida;
    
    public Vuelo(String codigo, String fecha, String hora, 
            Aereopuerto salida, Aereopuerto llegada){
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.salida = salida;
        this.llegada = llegada;
        this.asientos = new Asiento[56];
        int cont = 0;
        for(char i = 'A'; i <= 'G'; i++){
            for(int j = 1; j <= 8; j++){
                this.asientos[cont] = new Asiento(j, i);
                cont++;
            }
        }
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
                System.arraycopy(aux, 0, aux2, 0, cont);
                aux2[cont] = it;
                cont++;
                aux = aux2;
            }
        }
        return aux;
    }
    
    public boolean reservarAsiento(int nroAsiento, char fila){
        for(Asiento it: asientos){
            if(it.getNroAsiento() == nroAsiento && it.getFila() == fila){
                    return it.reservarAsiento();
            }
        }
        return false;
    }
    
    public boolean cancelarAsiento(int nroAsiento, char fila){
        for(Asiento it: asientos){
            if(it.getNroAsiento() == nroAsiento && it.getFila() == fila){
                    return it.cancelarAsiento();
            }
        }
        return false;
    }
    
    public boolean comprarAsiento(int nroAsiento, char fila){
        for(Asiento it: asientos){
            if(it.getNroAsiento() == nroAsiento && it.getFila() == fila){
                    return it.comprarAsiento();
            }
        }
        return false;
    }
    
    public void imprimirAsientosDisp(){
        Asiento[] asientosDisp = this.asientosDisponibles();
        
        for(Asiento it: asientosDisp){
            System.out.println(it);
        }
    }
    
    public void imprimirAsientos(){
        for(Asiento it: asientos){
            System.out.println(it);
        }
    }
}
