/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.TP2_Paradigmas;

/**
 *
 * @author Franco
 */
public class Capitan extends Piloto {
    private String licencia;
    
    
    public void setLicencia(String licencia){
        this.licencia=licencia;
    }
    
    public String getLicencia(){
        return licencia;
    }
}