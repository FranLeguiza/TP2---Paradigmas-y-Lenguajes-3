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
public class Aeropuerto {
    private Integer id;
    
    //Relaciones
    List <Vuelo> vuelos=new ArrayList<>();
    
    //Setter and getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    //Constructor
    public Aeropuerto(Integer id) {
        this.id = id;
    }
    
    public Aeropuerto(){
    }
    
}