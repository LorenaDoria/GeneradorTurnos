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
        Turno ultimo = cola.get(cola.size() - 1);//Creo un objeto de tipo Turno que obtiene el último elemento de la lista cola
        
        //VALIDACIÓN CON UN PRIMER USUARIO
        
        if (cola.isEmpty()){//Si la lista esta vacia una el constructo #1
            Turno persona1 = new Turno(10000000, "Contributivo", "Embarazada o persona discapacitada");//Creo objeto persona1 y le asigno atributos del método constructor #1
            System.out.println(persona1.solicitarTurno());
            cola.add(persona1);//Se agrega ese objeto a la lista llamada cola
        } 
        //si no esta vacia usa el constructor #2
         //VALIDACIÓN CON UN SEGUNDO USUARIO
        ultimo = cola.get(cola.size() - 1);
        Turno persona2 = new Turno(ultimo.getContadorCajaSubsidiado(), ultimo.getContadorCajaSubsidiadoR(), ultimo.getContadorCajaContributivo(), ultimo.getContadorCajaContributivoR(), 1574894, "Contributivo", "Embarazada o persona discapacitada");
        System.out.println(persona2.solicitarTurno());//El System.out.println se usa para mostar en consola y ver que funciona. PERO cuando se implemente la interfaz gráfica USAR solo: persona2.solicitarTurno()
        cola.add(persona2);
        
         //VALIDACIÓN CON UN TERCER USUARIO
        ultimo = cola.get(cola.size() - 1);//Obtener el último objeto de la lista
        Turno persona3 = new Turno(ultimo.getContadorCajaSubsidiado(), ultimo.getContadorCajaSubsidiadoR(), ultimo.getContadorCajaContributivo(), ultimo.getContadorCajaContributivoR(), 15748954, "Subsidiado", "Persona normal");
        System.out.println(persona3.solicitarTurno());
        cola.add(persona3);
        
    }
}
