/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author x
 */
public class JFrameAplikasiKonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAplikasiKonversiSuhu
     */
    public JFrameAplikasiKonversiSuhu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonCelcius = new javax.swing.JRadioButton();
        jRadioButtonFahrenheit = new javax.swing.JRadioButton();
        jRadioButtonKelvin = new javax.swing.JRadioButton();
        jRadioButtonReamur = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Input");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Output");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel2, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jTextField1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        buttonGroup1.add(jRadioButtonCelcius);
        jRadioButtonCelcius.setText("Celcius");
        jRadioButtonCelcius.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonCelciusItemStateChanged(evt);
            }
        });
        jPanel2.add(jRadioButtonCelcius);

        buttonGroup1.add(jRadioButtonFahrenheit);
        jRadioButtonFahrenheit.setText("Fahrenheit");
        jRadioButtonFahrenheit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonFahrenheitItemStateChanged(evt);
            }
        });
        jPanel2.add(jRadioButtonFahrenheit);

        buttonGroup1.add(jRadioButtonKelvin);
        jRadioButtonKelvin.setText("Kelvin");
        jRadioButtonKelvin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonKelvinItemStateChanged(evt);
            }
        });
        jPanel2.add(jRadioButtonKelvin);

        buttonGroup1.add(jRadioButtonReamur);
        jRadioButtonReamur.setText("Reamur");
        jRadioButtonReamur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonReamurItemStateChanged(evt);
            }
        });
        jPanel2.add(jRadioButtonReamur);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jPanel2, gridBagConstraints);

        jButton1.setText("Konversi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jButton1, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Hasil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel3, gridBagConstraints);

        jTextField2.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jTextField2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hitungHasil(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        var utils = new Utilities(false);
        utils.validasiInputHanyaAngka(evt);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        this.hitungHasil(true);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jRadioButtonCelciusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonCelciusItemStateChanged
        this.hitungHasil(true);
    }//GEN-LAST:event_jRadioButtonCelciusItemStateChanged

    private void jRadioButtonFahrenheitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonFahrenheitItemStateChanged
        this.hitungHasil(true);
    }//GEN-LAST:event_jRadioButtonFahrenheitItemStateChanged

    private void jRadioButtonKelvinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonKelvinItemStateChanged
        this.hitungHasil(true);
    }//GEN-LAST:event_jRadioButtonKelvinItemStateChanged

    private void jRadioButtonReamurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonReamurItemStateChanged
        this.hitungHasil(true);
    }//GEN-LAST:event_jRadioButtonReamurItemStateChanged

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        new Utilities(true).clearSaatFocus(evt);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        this.hitungHasil(true);
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void hitungHasil(boolean silent) {
        var utils = new Utilities(silent);

        if (utils.validasiTidakNull(jComboBox1, "format suhu input")
                || utils.validasiTidakKosong(jTextField1, "suhu")) {
            return;
        }

        Suhu input = null;
        var nilai = jTextField1.getText();
        var tipeInput = (String) jComboBox1.getSelectedItem();
        if (tipeInput == "Celcius") {
            input = new Celcius(nilai);
        } else if (tipeInput == "Fahrenheit") {
            input = new Fahrenheit(nilai);
        } else if (tipeInput == "Kelvin") {
            input = new Kelvin(nilai);
        } else if (tipeInput == "Reamur") {
            input = new Reamur(nilai);
        }

        Suhu output;
        if (jRadioButtonCelcius.isSelected()) {
            output = new Celcius(input);
        } else if (jRadioButtonFahrenheit.isSelected()) {
            output = new Fahrenheit(input);
        } else if (jRadioButtonKelvin.isSelected()) {
            output = new Kelvin(input);
        } else if (jRadioButtonReamur.isSelected()) {
            output = new Reamur(input);
        } else {
            utils.showErrorDialog("pilihan format suhu output belum dipilih!");
            return;
        };

        jTextField2.setText(output.toString());
    }

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
            java.util.logging.Logger.getLogger(JFrameAplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAplikasiKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonCelcius;
    private javax.swing.JRadioButton jRadioButtonFahrenheit;
    private javax.swing.JRadioButton jRadioButtonKelvin;
    private javax.swing.JRadioButton jRadioButtonReamur;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
