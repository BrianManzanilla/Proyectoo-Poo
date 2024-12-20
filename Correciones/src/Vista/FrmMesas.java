/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author carlos
 */
public class FrmMesas extends javax.swing.JFrame {
    private List<JButton> botones;
    private int indice;

    /**
     * Creates new form FrmMesas
     */
    public FrmMesas() {
        initComponents();
        botones = new ArrayList<>();
        indice = 0;
        botonesMesa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        ScrpListaM = new javax.swing.JScrollPane();
        PnlListaM = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 102, 102));
        lbTitulo.setText("Mesas del Restaurante");

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        PnlListaM.setLayout(new java.awt.GridLayout(0, 4));
        ScrpListaM.setViewportView(PnlListaM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrpListaM)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrpListaM, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int indiceB;
    private void botonesMesa()
    {
         String archivoNumeroMesas = "numeroMesas.txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(archivoNumeroMesas))) {
                String linea = reader.readLine(); // lee el numero de mesas
                int numeroMesas = (linea != null) ? Integer.parseInt(linea) : 0;

                // Crear botones para cada mesa
                for (int i = 0; i < numeroMesas; i++) {
                    JButton btnMesa = new JButton("Mesa " + (i + 1));
                    PnlListaM.add(btnMesa);
                    botones.add(btnMesa);

                    // accion del boton
                    int numeroMesa = i + 1; // se guarda
                    btnMesa.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            indiceB = numeroMesa; // num mesa
                            System.out.println("Botón presionado: Mesa " + indiceB);

                            // Abrir la ventana de gestión de la mesa
                            FrmGestionMesa gestionMesa = new FrmGestionMesa();
                            gestionMesa.setVisible(true);
                        }
                    });
                }

                // Actualiza el UI
                PnlListaM.updateUI();
                indice = numeroMesas; 
            } catch (IOException | NumberFormatException e) {
                System.err.println("Error al leer el archivo de número de mesas: " + e.getMessage());
            }
    }
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

    }//GEN-LAST:event_BtnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JPanel PnlListaM;
    private javax.swing.JScrollPane ScrpListaM;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
