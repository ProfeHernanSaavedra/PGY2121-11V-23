/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Unidad3.ComponentesGUI;

/**
 *
 * @author USRVI-LC4
 */
public class Form_Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Form_Ventana1
     */
    public Form_Ventana1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlbl_nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_agnoNac = new javax.swing.JTextField();
        jchk_futbol = new javax.swing.JCheckBox();
        jchk_padel = new javax.swing.JCheckBox();
        jchk_consolas = new javax.swing.JCheckBox();
        jrbtn_masculino = new javax.swing.JRadioButton();
        jrbtn_femenino = new javax.swing.JRadioButton();
        jrbtn_otro = new javax.swing.JRadioButton();
        jcbo_nacionalidad = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jlbl_mensaje = new javax.swing.JLabel();
        jlbl_mensaje2 = new javax.swing.JLabel();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_calcular = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mi primera Ventana");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jlbl_nombre.setText("Nombre :");

        jLabel1.setText("Año Nacimiento:");

        jLabel2.setText("Deportes:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Nacionalidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_nombre)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jchk_futbol.setText("Fútbol");

        jchk_padel.setText("Padel");

        jchk_consolas.setText("Consolas");

        buttonGroup1.add(jrbtn_masculino);
        jrbtn_masculino.setText("Masculino");

        buttonGroup1.add(jrbtn_femenino);
        jrbtn_femenino.setText("Femenino");

        buttonGroup1.add(jrbtn_otro);
        jrbtn_otro.setText("Otro");

        jcbo_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Chilena", "Venezolana", "Colombina", "Peruana", "EEUU" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbtn_masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtn_femenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbtn_otro))
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_agnoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jchk_futbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_padel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jchk_consolas))
                    .addComponent(jcbo_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_agnoNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchk_futbol)
                    .addComponent(jchk_padel)
                    .addComponent(jchk_consolas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtn_masculino)
                    .addComponent(jrbtn_femenino)
                    .addComponent(jrbtn_otro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbo_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jbtn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unidad3/ComponentesGUI/imagenes/1904677-add-addition-calculate-charge-create-new-plus_122527.png"))); // NOI18N
        jbtn_nuevo.setText("Nuevo");
        jbtn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nuevoActionPerformed(evt);
            }
        });

        jbtn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unidad3/ComponentesGUI/imagenes/calculator_math_calculate_accounting_finance_icon_192552.png"))); // NOI18N
        jbtn_calcular.setText("Calcular");
        jbtn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_calcularActionPerformed(evt);
            }
        });

        jbtn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unidad3/ComponentesGUI/imagenes/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jbtn_salir.setText("Salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbl_mensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtn_nuevo)
                .addGap(38, 38, 38)
                .addComponent(jbtn_calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jbtn_salir)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_nuevo)
                    .addComponent(jbtn_calcular)
                    .addComponent(jbtn_salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jlbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_mensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_calcularActionPerformed
        //rescatar los datos del formulario
        String deporte = "";
        String sexo = "";
        String nombre = this.jtxt_nombre.getText();
        int agno = Integer.parseInt(this.jtxt_agnoNac.getText());
        
        int edad = 2023 - agno;
        
        if (this.jchk_futbol.isSelected()) {
            deporte += "Fútbol,";
        }
        
        if (this.jchk_padel.isSelected()) {
            deporte += "Padel,";
        }
        
        if (this.jchk_consolas.isSelected()) {
            deporte += "Consolas";
        }
        
        //radiobutton
        
        if (this.jrbtn_masculino.isSelected()) {
            sexo = "Masculino";
        }
        else{
            if (this.jrbtn_femenino.isSelected()) {
                sexo = "Femenino";
            }
            else{
                if (this.jrbtn_otro.isSelected()) {
                    sexo = "Otro";
                }
            }
        }
        
        //combobox
        
        int nacionalidad = this.jcbo_nacionalidad.getSelectedIndex();
        String nacion = "";
        switch (nacionalidad) {
            case 1:
                nacion = "Chilena";
                break;
            case 2:
                nacion = "Venezolana";
                break;
            case 3:
                nacion = "Colombiana";
                break;
            case 4:
                nacion = "Peruana";
                break;
            case 5:
                nacion = "EEUU";
                break;
            default:
                nacion= "no encontrada";
        }
        
        this.jlbl_mensaje.setText(nombre + " tiene " + edad + 
                " años app y le gusto lo siguiente: " + deporte);
        
        this.jlbl_mensaje2.setText("Y su sexo es: " + sexo + " y es de nacionalidad " + nacion);
    }//GEN-LAST:event_jbtn_calcularActionPerformed

    private void jbtn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nuevoActionPerformed
        
        this.jtxt_agnoNac.setText("");
        this.jtxt_nombre.setText("");
        this.jlbl_mensaje.setText("");
        this.jchk_consolas.setSelected(false);
        this.jchk_futbol.setSelected(false);
        this.jchk_padel.setSelected(false);
        this.jrbtn_otro.setSelected(true);
        this.jlbl_mensaje2.setText("");
        this.jcbo_nacionalidad.setSelectedIndex(0);
        this.jtxt_nombre.requestFocus();
        
    }//GEN-LAST:event_jbtn_nuevoActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Form_Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form_Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form_Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form_Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form_Ventana1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtn_calcular;
    private javax.swing.JButton jbtn_nuevo;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JComboBox<String> jcbo_nacionalidad;
    private javax.swing.JCheckBox jchk_consolas;
    private javax.swing.JCheckBox jchk_futbol;
    private javax.swing.JCheckBox jchk_padel;
    private javax.swing.JLabel jlbl_mensaje;
    private javax.swing.JLabel jlbl_mensaje2;
    private javax.swing.JLabel jlbl_nombre;
    private javax.swing.JRadioButton jrbtn_femenino;
    private javax.swing.JRadioButton jrbtn_masculino;
    private javax.swing.JRadioButton jrbtn_otro;
    private javax.swing.JTextField jtxt_agnoNac;
    private javax.swing.JTextField jtxt_nombre;
    // End of variables declaration//GEN-END:variables
}
