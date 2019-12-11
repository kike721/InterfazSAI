/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adip.interfazsai;

import com.adip.interfazsai.clientRest.RequestUtil;
import com.adip.interfazsai.models.Boleta;
import com.adip.interfazsai.models.Lote;
import com.adip.interfazsai.models.Token;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.ws.rs.core.Response;
import org.apache.storm.shade.org.apache.commons.codec.binary.Base64;

/**
 *
 * @author enrique
 */
public class Home extends javax.swing.JFrame {
    Token webToken = null;
    String path = System.getProperty("user.home") + "//files";

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(Token token){
        this.webToken = token;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loteField = new javax.swing.JTextField();
        numDocsField = new javax.swing.JTextField();
        sendDocsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dayField = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        monthField = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        yearField = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loteFieldActionPerformed(evt);
            }
        });

        numDocsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDocsFieldActionPerformed(evt);
            }
        });

        sendDocsBtn.setBackground(new java.awt.Color(72, 168, 62));
        sendDocsBtn.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        sendDocsBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendDocsBtn.setText("Enviar Documentos");
        sendDocsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendDocsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendDocsBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del lote");

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setText("# de documentos");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de Emision");

        dayField.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        dayField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel4.setText("Dia");

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel5.setText("Mes");

        monthField.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        monthField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        monthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel6.setText("Año");

        yearField.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        yearField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendDocsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loteField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addComponent(numDocsField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loteField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numDocsField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sendDocsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loteFieldActionPerformed

    private void numDocsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDocsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDocsFieldActionPerformed

    private void sendDocsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendDocsBtnActionPerformed
        // TODO add your handling code here:
        String nameLote = loteField.getText();
        String numDocsString = numDocsField.getText();
        if (!numDocsString.equals("") && !nameLote.equals("")) {
            int numDocs = Integer.parseInt(numDocsString);
            File folder = new File(this.path);
            String[] nameFiles = folder.list();
            List<String> nameFilesList = Arrays.asList(nameFiles);
            Collections.sort(nameFilesList);
            String error = "";
            if (nameFilesList.size() == numDocs * 2) {
                String webToken = "Bearer " + this.webToken.getAccess();
                String dateEmision = yearField.getSelectedItem().toString() + "-" + monthField.getSelectedItem().toString() + "-" + dayField.getSelectedItem().toString();
                Lote lote = new Lote(nameLote, dateEmision, 1);
                RequestUtil clientWebLote = new RequestUtil();
                Response responseLote = clientWebLote.crearLote(lote, webToken);
                Boolean loteCreado = false;
                Lote loteResponse = new Lote();
                switch (responseLote.getStatus()){
                    case 400:
                        error = responseLote.readEntity(String.class);
                        System.out.println("error 400" + error);
                        break;
                    case 401:
                        error = responseLote.readEntity(String.class);
                        System.out.println("error 401" + error);
                        break;
                    case 201:
                        loteResponse = responseLote.readEntity(Lote.class);
                        System.out.println("Se agrego correctamente el lote: " + loteResponse.getId());
                        loteCreado = true;
                        break;
                }
                // Harcodeo para prod sin endpoint de Lote
                /* Boolean loteCreado = true;
                Lote loteResponse = new Lote(nameLote, dateEmision, 1);
                loteResponse.setId(1); */
                if (loteCreado) {
                    Boolean sendFiles = true;
                    error = "";
                    for (int i = 0; i < nameFilesList.size() - 1; i += 2) {
                        RequestUtil clientWeb = new RequestUtil(true);
                        int j = i + 1;
                        File boletaAnverso = new File(folder.getAbsolutePath() + "//" + nameFilesList.get(i));
                        File boletaReverso = new File(folder.getAbsolutePath() + "//" + nameFilesList.get(j));
                        Boleta boleta = new Boleta(boletaAnverso, boletaReverso);
                        Response response = clientWeb.crearBoletas(boleta, loteResponse, webToken);
                        switch (response.getStatus()){
                            case 400:
                                error = response.readEntity(String.class);
                                System.out.println("error 400" + error);
                                sendFiles = false;
                                break;
                            case 401:
                                error = response.readEntity(String.class);
                                System.out.println("error 401" + error);
                                sendFiles = false;
                                break;
                            case 201:
                                boletaAnverso.delete();
                                boletaReverso.delete();
                                break;
                        }
                        if (!sendFiles) {
                            break;
                        }
                    }
                    if (sendFiles) {
                        JOptionPane.showMessageDialog(this, "Se subieron correctamente los archivos");
                    } else {
                        // Hubo algun error en la carga de documentos
                        JOptionPane.showMessageDialog(this, error);
                    }
                } else {
                    // No se cre correctamente el lote
                    JOptionPane.showMessageDialog(this, error);
                }
            } else {
                if (nameFilesList.size() != numDocs * 2) {
                    JOptionPane.showMessageDialog(this, "No se escanearon completamente las boletas, favor de reintentar");
                }
            }
        } else { 
            // Validaciones de formularios
            if (nameLote.equals("")) {
                JOptionPane.showMessageDialog(this, "Favor de ingresar el nombre del lote");
            } else {
                if (numDocsString.equals("")) {
                    JOptionPane.showMessageDialog(this, "Favor de ingresar el numero de documentos que se van a escanear");
                }
            }
        }
    }//GEN-LAST:event_sendDocsBtnActionPerformed

    private void dayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayFieldActionPerformed

    private void monthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dayField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField loteField;
    private javax.swing.JComboBox monthField;
    private javax.swing.JTextField numDocsField;
    private javax.swing.JButton sendDocsBtn;
    private javax.swing.JComboBox yearField;
    // End of variables declaration//GEN-END:variables
}
