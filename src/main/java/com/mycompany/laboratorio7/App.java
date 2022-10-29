/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laboratorio7;

/**
 *
 * @author Fabo
 */
public class App {

    public static void main(String[] args) {
        Aereopuerto aereopuerto1 = new Aereopuerto("Jorge Chavez", "Av. Elmer Faucett s/n, Callao 07031");
        Aereopuerto aereopuerto2 = new Aereopuerto("Alfredo Rodríguez Ballón", "Av. Aeropuerto S/N, Cerro Colorado 04017");
        Ciudad[] ciudades = new Ciudad[2];
        Ciudad ciudad1 = new Ciudad("20200030", "Lima", aereopuerto1);
        Ciudad ciudad2 = new Ciudad("20200120", "Arequipa", aereopuerto1);
        Pais peru = new Pais("PER", "Perú", ciudades);
        Vuelo vuelo1 = new Vuelo("21200221", "31/09/2022", "21:00", aereopuerto1, aereopuerto2);
        Vuelo vuelo2 = new Vuelo("21200033", "1/10/2022", "22:00", aereopuerto2, aereopuerto1);
        
        var asientosDispVuelo1 = vuelo1.asientosDisponibles();
        
        for(var it: asientosDispVuelo1){
            System.out.println(it.toString());
        }       
       
    }
}
