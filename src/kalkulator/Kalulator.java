/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Acer
 */
public class Kalulator extends javax.swing.JFrame {
    String Angka;
    double angka1,angka2,angka3,hasil;
    int Pilih;
    /**
     * Creates new form Kalulator
     */
    public Kalulator() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Layar = new javax.swing.JTextField();
        Angka1 = new javax.swing.JButton();
        Angka2 = new javax.swing.JButton();
        Angka3 = new javax.swing.JButton();
        Angka4 = new javax.swing.JButton();
        Angka5 = new javax.swing.JButton();
        Angka6 = new javax.swing.JButton();
        Angka7 = new javax.swing.JButton();
        Angka8 = new javax.swing.JButton();
        Angka9 = new javax.swing.JButton();
        Angka0 = new javax.swing.JButton();
        Titik = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        Hasil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Anggap aja Kalkulator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        Layar.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Layar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Layar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 500, 69));

        Angka1.setBackground(new java.awt.Color(255, 0, 0));
        Angka1.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka1.setForeground(new java.awt.Color(255, 204, 0));
        Angka1.setText("1");
        Angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka1ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 60));

        Angka2.setBackground(new java.awt.Color(255, 0, 0));
        Angka2.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka2.setForeground(new java.awt.Color(255, 204, 0));
        Angka2.setText("2");
        Angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka2ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 60));

        Angka3.setBackground(new java.awt.Color(255, 0, 0));
        Angka3.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka3.setForeground(new java.awt.Color(255, 204, 0));
        Angka3.setText("3");
        Angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka3ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 80, 60));

        Angka4.setBackground(new java.awt.Color(255, 0, 0));
        Angka4.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka4.setForeground(new java.awt.Color(255, 204, 0));
        Angka4.setText("4");
        Angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka4ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, 60));

        Angka5.setBackground(new java.awt.Color(255, 0, 0));
        Angka5.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka5.setForeground(new java.awt.Color(255, 204, 0));
        Angka5.setText("5");
        Angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka5ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 60));

        Angka6.setBackground(new java.awt.Color(255, 0, 0));
        Angka6.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka6.setForeground(new java.awt.Color(255, 204, 0));
        Angka6.setText("6");
        Angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka6ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 60));

        Angka7.setBackground(new java.awt.Color(255, 0, 0));
        Angka7.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka7.setForeground(new java.awt.Color(255, 204, 0));
        Angka7.setText("7");
        Angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka7ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, 60));

        Angka8.setBackground(new java.awt.Color(255, 0, 0));
        Angka8.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka8.setForeground(new java.awt.Color(255, 204, 0));
        Angka8.setText("8");
        Angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka8ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, 60));

        Angka9.setBackground(new java.awt.Color(255, 0, 0));
        Angka9.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka9.setForeground(new java.awt.Color(255, 204, 0));
        Angka9.setText("9");
        Angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka9ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 80, 60));

        Angka0.setBackground(new java.awt.Color(255, 0, 0));
        Angka0.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Angka0.setForeground(new java.awt.Color(255, 204, 0));
        Angka0.setText("0");
        Angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka0ActionPerformed(evt);
            }
        });
        jPanel1.add(Angka0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 170, 60));

        Titik.setBackground(new java.awt.Color(255, 0, 0));
        Titik.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Titik.setForeground(new java.awt.Color(255, 204, 0));
        Titik.setText(".");
        Titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitikActionPerformed(evt);
            }
        });
        jPanel1.add(Titik, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, 60));

        Clear.setBackground(new java.awt.Color(255, 0, 0));
        Clear.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 204, 0));
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 170, 60));

        Tambah.setBackground(new java.awt.Color(255, 0, 0));
        Tambah.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Tambah.setForeground(new java.awt.Color(255, 204, 0));
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        jPanel1.add(Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 80, 60));

        Kurang.setBackground(new java.awt.Color(255, 0, 0));
        Kurang.setFont(new java.awt.Font("Orator Std", 1, 48)); // NOI18N
        Kurang.setForeground(new java.awt.Color(255, 204, 0));
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        jPanel1.add(Kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 80, 60));

        Kali.setBackground(new java.awt.Color(255, 51, 0));
        Kali.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Kali.setForeground(new java.awt.Color(255, 204, 0));
        Kali.setText("x");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kali, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 80, 60));

        Bagi.setBackground(new java.awt.Color(255, 0, 0));
        Bagi.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        Bagi.setForeground(new java.awt.Color(255, 204, 0));
        Bagi.setText("/");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        jPanel1.add(Bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 80, 60));

        Hasil.setBackground(new java.awt.Color(255, 0, 0));
        Hasil.setFont(new java.awt.Font("Orator Std", 1, 48)); // NOI18N
        Hasil.setForeground(new java.awt.Color(255, 153, 0));
        Hasil.setText("=");
        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        jPanel1.add(Hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka1ActionPerformed
        // TODO add your handling code here:
        Angka +="1";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka1ActionPerformed

    private void Angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka4ActionPerformed
        // TODO add your handling code here:
        Angka +="4";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka4ActionPerformed

    private void Angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka6ActionPerformed
        // TODO add your handling code here:
        Angka +="6";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka6ActionPerformed

    private void Angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka8ActionPerformed
        // TODO add your handling code here:
        Angka +="8";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka8ActionPerformed

    private void TitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitikActionPerformed
        // TODO add your handling code here:
        Angka +=".";
        Layar.setText(Angka);
    }//GEN-LAST:event_TitikActionPerformed

    private void Angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka0ActionPerformed
        // TODO add your handling code here:
        Angka +="0";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka0ActionPerformed

    private void Angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka2ActionPerformed
        // TODO add your handling code here:
        Angka +="2";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka2ActionPerformed

    private void Angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka3ActionPerformed
        // TODO add your handling code here:
        Angka +="3";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka3ActionPerformed

    private void Angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka5ActionPerformed
        // TODO add your handling code here:
        Angka +="5";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka5ActionPerformed

    private void Angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka7ActionPerformed
        // TODO add your handling code here:
        Angka +="7";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka7ActionPerformed

    private void Angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka9ActionPerformed
        // TODO add your handling code here:
        Angka +="9";
        Layar.setText(Angka);
    }//GEN-LAST:event_Angka9ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        Layar.setText("");
        angka1=0;
        angka2=0;
        hasil=0;
        Angka="";
    }//GEN-LAST:event_ClearActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(Angka);
        Layar.setText("+");
        Angka="";
        Pilih=1;
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(Angka);
        Layar.setText("-");
        Angka="";
        Pilih=2;
    }//GEN-LAST:event_KurangActionPerformed

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(Angka);
        Layar.setText("X");
        Angka="";
        Pilih=3;
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(Angka);
        Layar.setText("/");
        Angka="";
        Pilih=4;
    }//GEN-LAST:event_BagiActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
        switch (Pilih){
            case 1:
                angka2 = Double.parseDouble(Angka);
                hasil=angka1+angka2;
                Angka=Double.toString(hasil);
                Layar.setText(Angka);
                break;
            case 2:
                angka2 = Double.parseDouble(Angka);
                hasil=angka1-angka2;
                Angka=Double.toString(hasil);
                Layar.setText(Angka);
                break;
            case 3:
                angka2 = Double.parseDouble(Angka);
                hasil=angka1*angka2;
                Angka=Double.toString(hasil);
                Layar.setText(Angka);
                break;
            case 4:
                angka2 = Double.parseDouble(Angka);
                hasil=angka1/angka2;
                Angka=Double.toString(hasil);
                Layar.setText(Angka);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_HasilActionPerformed

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
            java.util.logging.Logger.getLogger(Kalulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Angka0;
    private javax.swing.JButton Angka1;
    private javax.swing.JButton Angka2;
    private javax.swing.JButton Angka3;
    private javax.swing.JButton Angka4;
    private javax.swing.JButton Angka5;
    private javax.swing.JButton Angka6;
    private javax.swing.JButton Angka7;
    private javax.swing.JButton Angka8;
    private javax.swing.JButton Angka9;
    private javax.swing.JButton Bagi;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JTextField Layar;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Titik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
