/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.TP2_Paradigmas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franco
 */
public class Aerolinea {
    private Integer id;
    private String nombre;
    private String direccion;
    private String pais;
    
    //Relaciones
    List <Vuelo> vuelos=new ArrayList<>();
    List <Avion> aviones = new ArrayList<>();
    List <Piloto> pilotos = new ArrayList <>();
    
    //Constructor

    public Aerolinea(Integer id, String nombre, String direccion, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
    }

    public Aerolinea() {
    }
    
    
    
    
    //Getter and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
     @Override
    public String toString() {
        return "La areolinea con id: "+ id +" - Nombre: " + nombre + " - Direccion: " + direccion + " - Pais: " + pais + "\n";
    }
}