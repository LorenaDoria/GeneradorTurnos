/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnos.proyectoturnos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Turno extends Usuario {
    ArrayList<Usuario> colaCR = new ArrayList<>();//Creo una Cola para Usuario Contributivo Rápida
    ArrayList<Usuario> colaC = new ArrayList<>();//Creo una Cola para Usuario Contributivo 
    ArrayList<Usuario> colaSR = new ArrayList<>();//Creo una Cola para Usuario Subsidiado Rápida
    ArrayList<Usuario> colaS = new ArrayList<>();//Creo una Cola para Usuario Subsidiado
    
    
    
    
    Usuario us= new Usuario();
    //Creación atributos
    private String caja;//Indica la caja a la cuál se debe dirijir el usuario una vez entregado el código del turno
    private String codigoTurno;//Código de turno alfanumérico que indica en sus siglas el regimen y tipo de usuario junto con el número indicativo de orden de atención
    /*Hay 4 tipos de caja para el atributo caja y cada una tiene asoasociada entre parentesís el que seria el atributo codigoTurno: 
    1.Caja Subsidiado normal (SN)
    2.Caja Subsidiado rápida (SN)
    3.Caja Contributivo normal (CN)
    4.Caja Contributivo rápida (CR)
    Las cajas "normal" son donde van las personas normales y las cajas "rápidas" son donde van las personas embarazadas, discapacitas o adultos mayores.
    */
   
    //Inicialización de contadores para generar turno de cada caja.
    //número indicativo de orden de atención de cada turno para cada clasificación de cajas (4 cajas)
    private int contadorCajaSubsidiado = 1;
    private int contadorCajaSubsidiadoR = 1;
    private int contadorCajaContributivo = 1;
    private int contadorCajaContributivoR = 1;
public Turno(){}
    //Método constructor #1
    //Se usa para el primer usuario que vaya a generar turno
    public Turno(String identificacion, String tipoAfiliacion, String tipoUsuario) {
        super(identificacion, tipoAfiliacion, tipoUsuario);
    }
    //Método constructor #2
    //Se usa a partir del segundo usuario que vaya a generar turno para de esta manera ir incrementando los contadores y asi el número indicativo del turno
    public Turno(int contadorCajaSubsidiado, int contadorCajaSubsidiadoR, int contadorCajaContributivo, int contadorCajaContributivoR, String identificacion, String tipoAfiliacion, String tipoUsuario) {
        super(identificacion, tipoAfiliacion, tipoUsuario);
        this.contadorCajaSubsidiado = contadorCajaSubsidiado;
        this.contadorCajaSubsidiadoR = contadorCajaSubsidiadoR;
        this.contadorCajaContributivo = contadorCajaContributivo;
        this.contadorCajaContributivoR = contadorCajaContributivoR;
    }

   
    
//Métodos getters y setters para los atributos
    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getCodigoTurno() {
        return codigoTurno;
    }

    public void setCodigoTurno(String codigoTurno) {
        this.codigoTurno = codigoTurno;
    }

    public int getContadorCajaSubsidiado() {
        return contadorCajaSubsidiado;
    }

    public void setContadorCajaSubsidiado(int contadorCajaSubsidiado) {
        this.contadorCajaSubsidiado = contadorCajaSubsidiado;
    }

    public int getContadorCajaSubsidiadoR() {
        return contadorCajaSubsidiadoR;
    }

    public void setContadorCajaSubsidiadoR(int contadorCajaSubsidiadoR) {
        this.contadorCajaSubsidiadoR = contadorCajaSubsidiadoR;
    }

    public int getContadorCajaContributivo() {
        return contadorCajaContributivo;
    }

    public void setContadorCajaContributivo(int contadorCajaContributivo) {
        this.contadorCajaContributivo = contadorCajaContributivo;
    }

    public int getContadorCajaContributivoR() {
        return contadorCajaContributivoR;
    }

    public void setContadorCajaContributivoR(int contadorCajaContributivoR) {
        this.contadorCajaContributivoR = contadorCajaContributivoR;
    }
    
    //Métodos para incrementar los contadores para el número indicativo del turno (número usuarios que se van atendiendo)
    public void incrementarContributivo(){
        this.contadorCajaContributivo += 1;
    }
    
    public void incrementarContributivoR(){
        this.contadorCajaContributivoR += 1;
    }
    
    public void incrementarSubsidiado(){
        this.contadorCajaSubsidiado += 1;
    }
    
    public void incrementarSubsidiadoR(){
        this.contadorCajaSubsidiadoR += 1;
    }
    //Se sobre escribe el método anbstracto de la clase Usuario
    //Se realizan las validaciones para generar el CodigoTurno y caja a cada usuario dependiendo su regimen y tipo de usurio
    
    public void solicitarTurno(Usuario us){
      //Si la lista esta vacia una el constructo #1
            
           //Se agrega ese objeto a la lista llamada cola
            
            
            if(us.getTipoAfiliacion().equals("Contributivo") && us.getTipoUsuario().equals("EMB")||
               (us.getTipoAfiliacion().equals("Contributivo") && us.getTipoUsuario().equals("ADM"))||
                (us.getTipoAfiliacion().equals("Contributivo") && us.getTipoUsuario().equals("PCD"))){
             //if (colaCR.isEmpty()){
                this.caja = " CAJA CONTRIBUTIVO #1  ";
                this.codigoTurno = "Dirijase a:"+this.caja+"\n"+"Turno:"+this.contadorCajaContributivoR+"\n";
                this.incrementarContributivoR();
                colaCR.add(us);
                JOptionPane.showMessageDialog(null, "-----SOLICITUD EXITOSA----- \n"+this.codigoTurno);
            
            }else if(us.getTipoAfiliacion().equals("Contributivo") && ( us.getTipoUsuario().equals("UNP"))){
                   //if (colaC.isEmpty()){
                    this.caja = "CAJA CONTRIBUTIVO #2 ";
                    this.codigoTurno = "Dirijase a:"+this.caja+"\n"+"Turno:"+this.contadorCajaContributivo+"\n";
                    this.incrementarContributivo();
                    colaC.add(us);
                JOptionPane.showMessageDialog(null, "------SOLICITUD EXITOSA------\n"+this.codigoTurno);
            }else if(us.getTipoAfiliacion().equals("Subsidiado") && us.getTipoUsuario().equals("EMB")||
               (us.getTipoAfiliacion().equals("Subsidiado") && us.getTipoUsuario().equals("ADM"))||
                (us.getTipoAfiliacion().equals("Subsidiado") && us.getTipoUsuario().equals("PCD"))){
                // if (colaSR.isEmpty()){
                 this.caja = " CAJA SUBSIDIADO #3";
                 this.codigoTurno = "Dirijase a:"+this.caja+"\n"+"Turno:"+this.contadorCajaSubsidiadoR+"\n";
                 this.incrementarSubsidiadoR();
                 colaSR.add(us);
                JOptionPane.showMessageDialog(null, "------SOLICITUD EXITOSA------- \n"+this.codigoTurno);
            } else if(us.getTipoAfiliacion().equals("Subsidiado") && ( us.getTipoUsuario().equals("UNP"))){
               //if (colaS.isEmpty()){
                this.caja = "CAJA SUBSIDIADO #4";
                this.codigoTurno = "Dirijase a:"+this.caja+"\n"+"Turno:"+this.contadorCajaSubsidiado+"\n";
                this.incrementarSubsidiado();
                colaS.add(us);
                JOptionPane.showMessageDialog(null, "--------SOLICITUD EXITOSA------ \n"+this.codigoTurno);
          
          
            }}
    }

        
        
        
        
    

    
    
    
    
    

    