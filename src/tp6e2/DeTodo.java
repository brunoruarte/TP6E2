/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp6e2;

import java.util.TreeSet;

/**
 *
 * @author bruno
 */
public class DeTodo extends javax.swing.JFrame {
    

    /**
     * Creates new form DeTodo
     */
    public DeTodo() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGestionDeProductos = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenu();
        jMenuItemNombre = new javax.swing.JMenuItem();
        jMenuItemPrecio = new javax.swing.JMenuItem();
        jMenuItemRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemGestionDeProductos.setText("Gestión de productos");
        jMenuItemGestionDeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionDeProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGestionDeProductos);

        jMenuBarMenu.add(jMenu1);

        jMenuConsultar.setText("Consultar...");

        jMenuItemNombre.setText("por nombre");
        jMenuItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNombreActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemNombre);

        jMenuItemPrecio.setText("por precio");
        jMenuItemPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrecioActionPerformed(evt);
            }
        });
        jMenuConsultar.add(jMenuItemPrecio);

        jMenuItemRubro.setText("por rubro");
        jMenuConsultar.add(jMenuItemRubro);

        jMenuBarMenu.add(jMenuConsultar);

        setJMenuBar(jMenuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGestionDeProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionDeProductosActionPerformed
        // TODO add your handling code here: 
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionDeProductos gestion = new GestionDeProductos();
        gestion.setVisible(true);
        Escritorio.add(gestion);
    }//GEN-LAST:event_jMenuItemGestionDeProductosActionPerformed

    private void jMenuItemPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPrecioActionPerformed

    private void jMenuItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNombreActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeTodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenu jMenuConsultar;
    private javax.swing.JMenuItem jMenuItemGestionDeProductos;
    private javax.swing.JMenuItem jMenuItemNombre;
    private javax.swing.JMenuItem jMenuItemPrecio;
    private javax.swing.JMenuItem jMenuItemRubro;
    // End of variables declaration//GEN-END:variables
}