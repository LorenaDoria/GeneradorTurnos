/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnos.proyectoturnos;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Main {//Este método main es de PRUEBA para ver el funcionamiento de las dos clases creadas: USUARIO Y PERSONA.
    public static void main(String[] args) {
        ArrayList<Turno> cola = new ArrayList<>();//Creo una lista de objetos tipo Turno
        VistaInicio vista = new VistaInicio();
        vista.setVisible(true);
        
        
        
         Usuario user = new Usuario();
         //user.Mostrar();
         //Turno turn = new Turno();
         //System.out.print("Eso hay en la ID"+user.getIdentificacion());
         
        //turn.solicitarTurno();
    }
}
