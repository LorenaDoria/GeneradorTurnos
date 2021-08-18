/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnos.proyectoturnos;

/**
 *
 * @author DELL
 */
public abstract class Usuario {
    
    private int identificacion;
    private String tipoAfiliacion;// tipo de afiliación va a ser: contributivo o subsidiado
    private String tipoUsuario ;// tipo de usurio va a ser: persona normal, persona embarazada o discapacitada y adulto mayor
   
    
    
   //Constructor
    public Usuario(int identificacion, String tipoAfiliacion, String tipoUsuario){
        
        this.identificacion = identificacion;
        this.tipoAfiliacion = tipoAfiliacion;
        this.tipoUsuario = tipoUsuario;  
    }
    
    //Método abstacto que sera implementado en la clase Turno
    public abstract String solicitarTurno();
    
    //Creacion de getters y setters
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
        
    
    
    
    
    
}


