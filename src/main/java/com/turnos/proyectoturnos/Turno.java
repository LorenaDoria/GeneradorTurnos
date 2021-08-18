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
public class Turno extends Usuario {
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

    //Método constructor #1
    //Se usa para el primer usuario que vaya a generar turno
    public Turno(int identificacion, String tipoAfiliacion, String tipoUsuario) {
        super(identificacion, tipoAfiliacion, tipoUsuario);
    }
    //Método constructor #2
    //Se usa a partir del segundo usuario que vaya a generar turno para de esta manera ir incrementando los contadores y asi el número indicativo del turno
    public Turno(int contadorCajaSubsidiado, int contadorCajaSubsidiadoR, int contadorCajaContributivo, int contadorCajaContributivoR, int identificacion, String tipoAfiliacion, String tipoUsuario) {
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
    @Override
    public String solicitarTurno(){
        if(this.getTipoAfiliacion().equals("Subsidiado") && ( this.getTipoUsuario().equals("Embarazada o persona discapacitada") || this.getTipoUsuario().equals("Adulto Mayor") )){
            this.caja = "Caja Subsidiado rápida";
            this.codigoTurno = "Turno: SR"+this.contadorCajaSubsidiadoR+" dirijase a: "+this.caja;
            this.incrementarSubsidiadoR();
            return this.codigoTurno;
        } else if(this.getTipoAfiliacion().equals("Subsidiado") && this.getTipoUsuario().equals("Persona normal")){
            this.caja = "Caja Subsidiado";
            this.codigoTurno = "Turno: SN"+this.contadorCajaSubsidiado+" dirijase a: "+this.caja;
            this.incrementarSubsidiado();
            return this.codigoTurno;
        } else if(this.getTipoAfiliacion().equals("Contributivo") && ( this.getTipoUsuario().equals("Embarazada o persona discapacitada") || this.getTipoUsuario().equals("Adulto Mayor") )){
            this.caja = "Caja Contrubutivo rápida";
            this.codigoTurno = "Turno: CR"+this.contadorCajaContributivoR+" dirijase a: "+this.caja;
            this.incrementarContributivoR();
            return this.codigoTurno;
        } else if(this.getTipoAfiliacion().equals("Contributivo") && this.getTipoUsuario().equals("Persona normal")){
            this.caja = "Caja Contributivo";
            this.codigoTurno = "Turno: CN"+this.contadorCajaContributivo+" dirijase a: "+this.caja;
            this.incrementarContributivo();
            return this.codigoTurno;
        } else {
            return "Error, usuario no válido";
        }
    }
}
    