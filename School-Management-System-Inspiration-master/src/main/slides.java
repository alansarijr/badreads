/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author bishoykamel
 */
public class slides extends javax.swing.JFrame {

    /**
     * Creates new form slides
     */
    public slides() {
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
        jLabel15 = new javax.swing.JLabel();
        tabbedPaneCustom1 = new raven.tabbed.TabbedPaneCustom();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        switchButton3 = new swing.SwitchButton();
        switchButton4 = new swing.SwitchButton();
        comboBoxSuggestion4 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion2 = new combo_suggestion.ComboBoxSuggestion();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        switchButton5 = new swing.SwitchButton();
        switchButton6 = new swing.SwitchButton();
        comboBoxSuggestion3 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion5 = new combo_suggestion.ComboBoxSuggestion();
        jPanel4 = new javax.swing.JPanel();
        switchButton7 = new swing.SwitchButton();
        switchButton8 = new swing.SwitchButton();
        comboBoxSuggestion6 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion7 = new combo_suggestion.ComboBoxSuggestion();
        jPanel5 = new javax.swing.JPanel();
        switchButton9 = new swing.SwitchButton();
        switchButton10 = new swing.SwitchButton();
        comboBoxSuggestion8 = new combo_suggestion.ComboBoxSuggestion();
        comboBoxSuggestion9 = new combo_suggestion.ComboBoxSuggestion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 148, 85));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8-slides-48.png"))); // NOI18N
        jLabel15.setText("Slides");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(255, 236, 158));
        tabbedPaneCustom1.setUnselectedColor(new java.awt.Color(255, 236, 158));

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));

        jLabel5.setText("About:");

        switchButton3.setForeground(new java.awt.Color(240, 240, 240));

        switchButton4.setForeground(new java.awt.Color(240, 240, 240));

        comboBoxSuggestion4.setEditable(false);
        comboBoxSuggestion4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programming C++", "Electronics 1", "Maths 3", "Circuits", "Technical writting", "Discrete math" }));
        comboBoxSuggestion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion4ActionPerformed(evt);
            }
        });

        comboBoxSuggestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Advanced progarmming (Java)", "Basic Electronics", "Satistics and probability", "Logic design", "Workshops", "Presentation skills" }));
        comboBoxSuggestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSuggestion4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                        .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(switchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(switchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxSuggestion4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Sophomore", jPanel2);

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));

        jLabel8.setText("About:");

        switchButton5.setForeground(new java.awt.Color(240, 240, 240));

        switchButton6.setForeground(new java.awt.Color(240, 240, 240));

        comboBoxSuggestion3.setEditable(false);
        comboBoxSuggestion3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Structures", "Computer Arch", "Electronics ciruits", "Numerical ", "Signals", "Creative Thinking", " ", " " }));
        comboBoxSuggestion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion3ActionPerformed(evt);
            }
        });

        comboBoxSuggestion5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Database", "Comunications", "power and machines", "Measure", "MP-MC", "Operations Research" }));
        comboBoxSuggestion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(switchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSuggestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                        .addComponent(comboBoxSuggestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(switchButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxSuggestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxSuggestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(switchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );

        tabbedPaneCustom1.addTab("Junior   ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));

        switchButton7.setForeground(new java.awt.Color(240, 240, 240));

        switchButton8.setForeground(new java.awt.Color(240, 240, 240));

        comboBoxSuggestion6.setEditable(false);
        comboBoxSuggestion6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Software engineering", "System & Control", "Digital signal ", "Computer network", "VLSI", "Engineering economics" }));
        comboBoxSuggestion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion6ActionPerformed(evt);
            }
        });

        comboBoxSuggestion7.setEditable(false);
        comboBoxSuggestion7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Digital control", "Operating system", "Artificial intelligent", "Parallel & Distributed", "Elective course", "Project Management" }));
        comboBoxSuggestion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(switchButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxSuggestion6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(switchButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(switchButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(switchButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxSuggestion6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSuggestion7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(453, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Senior 1  ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(243, 243, 243));

        switchButton9.setForeground(new java.awt.Color(240, 240, 240));

        switchButton10.setForeground(new java.awt.Color(240, 240, 240));

        comboBoxSuggestion8.setEditable(false);
        comboBoxSuggestion8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Network", "DSP", "CI", "AI", "Control" }));
        comboBoxSuggestion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion8ActionPerformed(evt);
            }
        });

        comboBoxSuggestion9.setEditable(false);
        comboBoxSuggestion9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Security", "Systems", "Compiler", "Control", "Computer vision" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(switchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxSuggestion8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(comboBoxSuggestion9, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switchButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(switchButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxSuggestion9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxSuggestion8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(448, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Senior 2  ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSuggestion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion3ActionPerformed

    private void comboBoxSuggestion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion4ActionPerformed

    private void comboBoxSuggestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion2ActionPerformed

    private void comboBoxSuggestion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion5ActionPerformed

    private void comboBoxSuggestion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion6ActionPerformed

    private void comboBoxSuggestion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion7ActionPerformed

    private void comboBoxSuggestion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSuggestion8ActionPerformed

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
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slides().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion2;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion3;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion4;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion5;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion6;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion7;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion8;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion9;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private swing.SwitchButton switchButton10;
    private swing.SwitchButton switchButton3;
    private swing.SwitchButton switchButton4;
    private swing.SwitchButton switchButton5;
    private swing.SwitchButton switchButton6;
    private swing.SwitchButton switchButton7;
    private swing.SwitchButton switchButton8;
    private swing.SwitchButton switchButton9;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables
}
