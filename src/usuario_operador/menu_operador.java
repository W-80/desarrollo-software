/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario_operador;

import java.awt.Image;
import javax.swing.ImageIcon;
import modulos.Inicio;

/**
 *
 * @author juandiazvillota
 */
public class menu_operador extends javax.swing.JFrame {

    /**
     * Creates new form operador
     */
    public menu_operador() {
        initComponents();
        this.setLocationRelativeTo(null);
        imagenes();
    }
    
    public void imagenes(){
        
        ImageIcon imagenlogo = new ImageIcon("src/imagenes/conductor.png");
        Image logo = imagenlogo.getImage();
        Image imglogo = logo.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_logo = new ImageIcon(imglogo);
        this.jLabel_logo.setIcon(imagen_logo);
        this.jLabel_logo.setText("");
        
        ImageIcon imagenpickup = new ImageIcon("src/imagenes/pickup.png");
        Image pickup = imagenpickup.getImage();
        Image imgpickup = pickup.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_pickup = new ImageIcon(imgpickup);
        this.jLabel_pickuo.setIcon(imagen_pickup);
        this.jLabel_pickuo.setText("");

        ImageIcon imagencobrar = new ImageIcon("src/imagenes/cobrar.png");
        Image imagecobro = imagencobrar.getImage();
        Image imgcobro = imagecobro.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_cobrar = new ImageIcon(imgcobro);
        this.jLabel_cobrar.setIcon(imagen_cobrar);
        this.jLabel_cobrar.setText("");
        
        ImageIcon imagenrastreo = new ImageIcon("src/imagenes/rastreo.png");
        Image imagenrast = imagenrastreo.getImage();
        Image imgrast = imagenrast.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_rastreo = new ImageIcon(imgrast);
        this.jLabel_rastreo.setIcon(imagen_rastreo);
        this.jLabel_rastreo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENIDO = new javax.swing.JPanel();
        jLabel_pickuo = new javax.swing.JLabel();
        jLabel_cobrar = new javax.swing.JLabel();
        jLabel_rastreo = new javax.swing.JLabel();
        jButton_PICKUP = new javax.swing.JButton();
        jButton_cobrar = new javax.swing.JButton();
        jButton_rastreo = new javax.swing.JButton();
        jButton_atras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel_logo = new javax.swing.JLabel();
        jLabel_TITULO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_pickuo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pickuo.setText("Programar pickup");
        jLabel_pickuo.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel_pickuo.setMinimumSize(new java.awt.Dimension(16, 16));

        jLabel_cobrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cobrar.setText("realizar cobro");

        jLabel_rastreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_rastreo.setText("Rastrear paquete");

        jButton_PICKUP.setText("Programar Pickup");
        jButton_PICKUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PICKUPActionPerformed(evt);
            }
        });

        jButton_cobrar.setText("Pagar recibo");
        jButton_cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cobrarActionPerformed(evt);
            }
        });

        jButton_rastreo.setText("Rastrear Paquete");
        jButton_rastreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rastreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CONTENIDOLayout = new javax.swing.GroupLayout(jPanel_CONTENIDO);
        jPanel_CONTENIDO.setLayout(jPanel_CONTENIDOLayout);
        jPanel_CONTENIDOLayout.setHorizontalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_pickuo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_PICKUP))
                .addGap(65, 65, 65)
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_cobrar)
                    .addComponent(jLabel_cobrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_rastreo)
                    .addComponent(jLabel_rastreo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_CONTENIDOLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_PICKUP, jButton_cobrar, jButton_rastreo});

        jPanel_CONTENIDOLayout.setVerticalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pickuo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cobrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_PICKUP)
                    .addComponent(jButton_cobrar))
                .addGap(18, 42, Short.MAX_VALUE)
                .addComponent(jLabel_rastreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_rastreo))
        );

        jButton_atras.setText("Cerrar Sesion");
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        jLabel_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_logo.setText("logo");

        jLabel_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO.setText("Operador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel_TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_atras)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PICKUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PICKUPActionPerformed
        programar_pickup op_pickup;
        op_pickup = new programar_pickup(this,true);
        op_pickup.setAlwaysOnTop (true);
        op_pickup.setVisible(true);      
    }//GEN-LAST:event_jButton_PICKUPActionPerformed

    private void jButton_cobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cobrarActionPerformed
        dialogo_de_pago dialopago;
        dialopago = new dialogo_de_pago(this,true);
        dialopago.setAlwaysOnTop (true);
        dialopago.setVisible(true);
    }//GEN-LAST:event_jButton_cobrarActionPerformed

    private void jButton_rastreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rastreoActionPerformed
        rastrear_paquete tracking;
        tracking = new rastrear_paquete(this,true);
        tracking.setAlwaysOnTop(true);
        tracking.setVisible(true);
    }//GEN-LAST:event_jButton_rastreoActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        Inicio log = new Inicio();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(menu_operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_operador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_PICKUP;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_cobrar;
    private javax.swing.JButton jButton_rastreo;
    private javax.swing.JLabel jLabel_TITULO;
    private javax.swing.JLabel jLabel_cobrar;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabel_pickuo;
    private javax.swing.JLabel jLabel_rastreo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CONTENIDO;
    // End of variables declaration//GEN-END:variables
}
