/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.TP2_Paradigmas;

/**
 *
 * @author Franco
 */
public class Piloto {
    private String rango;
    private Integer numRegistro;
    private Integer aniosExperiencia;
    
//Relaciones
private Aerolinea aerolineas;
private Vuelo vuelos;

 //Constructor
public Piloto (){
}

public Piloto (String rango, Integer numRegistro, Integer aniosExperiencia){
 this.rango= rango;
 this.numRegistro=numRegistro;
 this.aniosExperiencia=aniosExperiencia;
}

}
