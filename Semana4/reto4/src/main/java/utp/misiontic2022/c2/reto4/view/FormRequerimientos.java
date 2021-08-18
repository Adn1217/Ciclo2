/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.reto4.view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utp.misiontic2022.c2.reto4.controller.ControllerRequerimientos;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_3;

/**
 *
 * @author Adrian
 */
public class FormRequerimientos extends javax.swing.JFrame {

    /**
     * Creates new form FormRequerimientos
     */
    public FormRequerimientos() {
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

        BtnReq1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        BtnReq2 = new javax.swing.JButton();
        BtnReq3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnReq1.setText("Requerimiento 1");
        BtnReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReq1ActionPerformed(evt);
            }
        });

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        BtnReq2.setText("Requerimiento 2");
        BtnReq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReq2ActionPerformed(evt);
            }
        });

        BtnReq3.setText("Requerimiento 3");
        BtnReq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReq3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnReq1)
                        .addGap(18, 18, 18)
                        .addComponent(BtnReq2)
                        .addGap(18, 18, 18)
                        .addComponent(BtnReq3)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnReq1)
                    .addComponent(BtnReq2)
                    .addComponent(BtnReq3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReq1ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "Aceptar", "Confirmar", JOptionPane.INFORMATION_MESSAGE);
        
        String[] columnNombre = {"Fecha Compra", "Cod. Compra", "Nombre Proveedor", "Pagado"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_1> lista;
        
        try{
            lista = controlador.consultaRequerimiento_1();
            Object[][] datos = new Object[lista.size()][4];
            int index = 0;
            
            for(Requerimiento_1 i: lista){
                datos[index][0] = i.getFechaCompra();
                datos[index][1] = i.getCodCompra();
                datos[index][2] = i.getNombreProveedor();
                datos[index][3] = i.getPagado();
                index ++;
            }
            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);
            Tabla1.setModel(model);
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_BtnReq1ActionPerformed

    private void BtnReq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReq2ActionPerformed
        // TODO add your handling code here:
        String[] columnNombre = {"Fec Inicio", "Nombre Constructora", "Nombre Ciudad", "Nombre Lider", "Cod. Tipo", "Estrato"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        ArrayList<Requerimiento_2> lista;
        
        try{
            lista = controlador.consultaRequerimiento_2();
            Object[][] datos = new Object[lista.size()][6];
            int index = 0;
            
            for(Requerimiento_2 i: lista){
                datos[index][0] = i.getFechaInicio();
                datos[index][1] = i.getConstructora();
                datos[index][2] = i.getCiudad();
                datos[index][3] = i.getLider();
                datos[index][4] = i.getTipo();
                datos[index][5] = i.getEstrato();
                index ++;
            }
            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);
            Tabla1.setModel(model);
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_BtnReq2ActionPerformed

    private void BtnReq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReq3ActionPerformed
        // TODO add your handling code here
         String[] columnNombre = {"Abrev"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_3> lista;
        
        try{
            lista = controlador.consultaRequerimiento_3();
            Object[][] datos = new Object[lista.size()][1];
            int index = 0;
            
            for(Requerimiento_3 i: lista){
                datos[index][0] = i.getAbrev();
                index ++;
            }
            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);
            Tabla1.setModel(model);
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_BtnReq3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReq1;
    private javax.swing.JButton BtnReq2;
    private javax.swing.JButton BtnReq3;
    private javax.swing.JTable Tabla1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}