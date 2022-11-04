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
        Ciudad ciudad1 = new Ciudad("20200030", "Lima");
        Ciudad ciudad2 = new Ciudad("20200120", "Arequipa");
        Aereopuerto aereopuerto1 = new Aereopuerto("Jorge Chavez", "Av. Elmer Faucett s/n, Callao 07031", ciudad1);
        Aereopuerto aereopuerto2 = new Aereopuerto("Alfredo Rodríguez Ballón", "Av. Aeropuerto S/N, Cerro Colorado 04017", ciudad2);
        Ciudad[] ciudades = new Ciudad[2];
        Pais peru = new Pais("PER", "Perú", ciudades);
        Vuelo vuelo1 = new Vuelo("21200221", "31/09/2022", "21:00", aereopuerto1, aereopuerto2);
        Vuelo vuelo2 = new Vuelo("21200033", "1/10/2022", "22:00", aereopuerto2, aereopuerto1);
        vuelo1.imprimirAsientosDisp();
        vuelo1.reservarAsiento(5, 'C');
        vuelo1.imprimirAsientos();
        System.out.println(vuelo1.cancelarAsiento(5, 'C'));
        System.out.println(vuelo1.cancelarAsiento(5, 'C'));
        System.out.println(vuelo1.comprarAsiento(5, 'C'));
        vuelo1.reservarAsiento(5, 'C');
        System.out.println(vuelo1.comprarAsiento(5, 'C'));
    }
}
