/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnos.proyectoturnos;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VistaInicio extends javax.swing.JFrame {
        Usuario us= new Usuario();
        Turno turn = new Turno();
    
    /**
     * Creates new form VistaInicio
     */
    public VistaInicio() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        btnTipoUsuario = new javax.swing.ButtonGroup();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jRcontributivo = new javax.swing.JRadioButton();
        jRsubsidiado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        opEmb = new javax.swing.JRadioButton();
        opAdulto = new javax.swing.JRadioButton();
        opDiscap = new javax.swing.JRadioButton();
        opUnP = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese su número de Identificación");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Escoja su tipo de afiliación");

        btnAceptar.setBackground(new java.awt.Color(0, 153, 153));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Enviar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jRcontributivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo.add(jRcontributivo);
        jRcontributivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRcontributivo.setText("Contributivo");
        jRcontributivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcontributivoActionPerformed(evt);
            }
        });

        jRsubsidiado.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo.add(jRsubsidiado);
        jRsubsidiado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRsubsidiado.setText("Subsidiado");
        jRsubsidiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsubsidiadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Escoja su tipo de Usuario");

        opEmb.setBackground(new java.awt.Color(255, 255, 255));
        btnTipoUsuario.add(opEmb);
        opEmb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opEmb.setText("Embarazada");
        opEmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEmbActionPerformed(evt);
            }
        });

        opAdulto.setBackground(new java.awt.Color(255, 255, 255));
        btnTipoUsuario.add(opAdulto);
        opAdulto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opAdulto.setText("Adulto Mayor");
        opAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAdultoActionPerformed(evt);
            }
        });

        opDiscap.setBackground(new java.awt.Color(255, 255, 255));
        btnTipoUsuario.add(opDiscap);
        opDiscap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opDiscap.setText("Persona con Discapacidad");
        opDiscap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDiscapActionPerformed(evt);
            }
        });

        opUnP.setBackground(new java.awt.Color(255, 255, 255));
        btnTipoUsuario.add(opUnP);
        opUnP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opUnP.setText("Usuario NO preferencial");
        opUnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUnPActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\GitProyecto\\GeneradorTurnos\\src\\main\\java\\com\\turnos\\proyectoturnos\\Imagenes\\med.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(opAdulto)
                                .addComponent(opDiscap)
                                .addComponent(opUnP)
                                .addComponent(opEmb)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jRcontributivo)
                            .addComponent(jRsubsidiado))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRcontributivo)
                .addGap(18, 18, 18)
                .addComponent(jRsubsidiado)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(opEmb)
                .addGap(6, 6, 6)
                .addComponent(opAdulto)
                .addGap(3, 3, 3)
                .addComponent(opDiscap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opUnP)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(txtIdentificacion.getText().equals("")){
        JOptionPane.showMessageDialog(null, " ERROR! DEBE INGRESAR UNA IDENTIFICACIÓN");
        }else{
        
        us.setIdentificacion(txtIdentificacion.getText());
        txtIdentificacion.setText("");
        if(jRcontributivo.isSelected()==true){
            us.setTipoAfiliacion("Contributivo");
        }
        if(jRsubsidiado.isSelected()==true){
            us.setTipoAfiliacion("Subsidiado");
        }
        if(opEmb.isSelected()==true){
            us.setTipoUsuario("EMB");
        }
        if(opAdulto.isSelected()==true){
            us.setTipoUsuario("ADM");
        }
        if(opDiscap.isSelected()==true){
            us.setTipoUsuario("PCD");
            
        }if(opUnP.isSelected()==true){
            us.setTipoUsuario("UNP");
        }
        this.setVisible(true);      
    
       turn.solicitarTurno(us);
        
        }  
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jRcontributivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcontributivoActionPerformed
        // TODO add your handling code here:
        //Usuario us= new Usuario();
        
        
    }//GEN-LAST:event_jRcontributivoActionPerformed

    private void jRsubsidiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRsubsidiadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRsubsidiadoActionPerformed

    private void opEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opEmbActionPerformed

    private void opAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAdultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opAdultoActionPerformed

    private void opDiscapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDiscapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opDiscapActionPerformed

    private void opUnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUnPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opUnPActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.ButtonGroup btnTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRcontributivo;
    private javax.swing.JRadioButton jRsubsidiado;
    private javax.swing.JRadioButton opAdulto;
    private javax.swing.JRadioButton opDiscap;
    private javax.swing.JRadioButton opEmb;
    private javax.swing.JRadioButton opUnP;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
