/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ar.edu.unlar.TP2_Paradigmas;

/**
 *
 * @author Franco
 */
public class TP2_ParadigmasyLenguajesIII {

    public static void main(String[] args) {
        System.out.println("Practico N°2");
        
        //Creo una instancia de la clase Aerolinea
        Aerolinea aerolinea1;
        aerolinea1 = new Aerolinea(120,"Aero MAX","Ezeiza","Argentina");
        
        System.out.print(aerolinea1.toString());
        
        //Creo otra instacia de la clase aerolinea utilizando los metodos
        Aerolinea aerolinea2 = new Aerolinea();
        aerolinea2.setId(320);
        aerolinea2.setNombre("Lufthansa");
        aerolinea2.setDireccion("Al");
        aerolinea2.setPais("Alemania");
        
        System.out.println("\nNuevo objeto creado");
        System.out.println(aerolinea2.getId());
        System.out.println(aerolinea2.getNombre());
        System.out.println(aerolinea2.getDireccion());
        System.out.println(aerolinea2.getPais());
        
    }
}
