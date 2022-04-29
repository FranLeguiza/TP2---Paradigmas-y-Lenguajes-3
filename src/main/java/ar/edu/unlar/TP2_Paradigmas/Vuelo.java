/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.TP2_Paradigmas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Franco
 */
public class Vuelo {
    private Integer id;
    private Date horarioSalida;
    private Date horarioLlegada;
    
    //Relaciones
    private Aeropuerto aeropuertos;
    List <Piloto> pilotos =new ArrayList <>();
    private Avion aviones;
    private Aerolinea aerolineas;
            
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(Date horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public Date getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(Date horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }
    
    
    
    
}