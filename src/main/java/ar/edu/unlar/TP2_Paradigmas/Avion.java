/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.TP2_Paradigmas;

/**
 *
 * @author Franco
 */
public class Avion {
    private String marca;
    private Integer capacidad;
    private String matricula;
    private String tipo;
    
    //Relaciones
    private Vuelo vuelos;
    private Aerolinea aerolineas;
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Constructor
    public Avion(){
    }

    public Avion(String marca, Integer capacidad, String matricula, String tipo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.matricula = matricula;
        this.tipo = tipo;
    }
    
    
}