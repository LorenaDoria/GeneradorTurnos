/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnos.proyectoturnos;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Usuario {
    
    private String identificacion;
    private String tipoAfiliacion;// tipo de afiliación va a ser: contributivo o subsidiado
    private String tipoUsuario ;// tipo de usurio va a ser: persona normal, persona embarazada o discapacitada y adulto mayor
   
    public Usuario(){
    }
    
   //Constructor
    public Usuario(String identificacion, String tipoAfiliacion, String tipoUsuario){
        
        this.identificacion = identificacion;
        this.tipoAfiliacion = tipoAfiliacion;
        this.tipoUsuario = tipoUsuario;  
    }
    
    //Método abstacto que sera implementado en la clase Turno
    //public abstract String solicitarTurno();

   
   public void Mostrar(){
       
      JOptionPane.showMessageDialog(null, "Hola Su turno es"+this.identificacion+this.tipoAfiliacion+this.tipoUsuario);
     //System.out.print("ID :"+this.identificacion+"\n"+"Afiliacion:"+this.tipoAfiliacion+"\n"+"Usuario:"+this.tipoUsuario);
   }
   
   public void Saludar(){
       
       if(this.getIdentificacion().equals("123")){      JOptionPane.showMessageDialog(null,"HOLAAAAAA");
}
   }
    
    //Creacion de getters y setters
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
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


