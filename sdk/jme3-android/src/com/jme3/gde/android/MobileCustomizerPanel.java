/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LwjglAppletCustomizerPanel.java
 *
 * Created on 11.11.2010, 16:56:53
 */
package com.jme3.gde.android;

import com.jme3.gde.android.AndroidSdkTool.AndroidTarget;
import com.jme3.gde.core.j2seproject.ProjectExtensionProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author normenhansen
 */
public class MobileCustomizerPanel extends javax.swing.JPanel implements ActionListener {

    private ProjectExtensionProperties properties;

    /** Creates new form LwjglAppletCustomizerPanel */
    public MobileCustomizerPanel(ProjectExtensionProperties properties) {
        this.properties = properties;
        initComponents();
        updateTargetList();
        loadProperties();
    }

    private void updateTargetList() {
        jComboBox1.removeAllItems();
        List<AndroidTarget> targets = AndroidSdkTool.getTargetList();
        for (Iterator<AndroidTarget> it = targets.iterator(); it.hasNext();) {
            AndroidTarget androidTarget = it.next();
            jComboBox1.addItem(androidTarget);
        }
    }

    private void loadProperties() {
        String str = properties.getProperty("mobile.android.enabled");
        if ("true".equals(str)) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
        }
        if (properties.getProperty("mobile.android.target") != null) {
            setSelected(properties.getProperty("mobile.android.target"));
        }
        if (properties.getProperty("mobile.android.package") != null) {
            jTextField1.setText(properties.getProperty("mobile.android.package"));
        }else{
            jTextField1.setText("com.mycompany.mygame");
        }
    }

    private void saveProperties() {
        if (jCheckBox1.isSelected()) {
            properties.setProperty("mobile.android.enabled", "true");
        } else {
            properties.setProperty("mobile.android.enabled", "");
        }
        //TODO: check properties
        properties.setProperty("mobile.android.target", ((AndroidTarget) jComboBox1.getSelectedItem()).getName());
        properties.setProperty("mobile.android.package", jTextField1.getText());
    }
    
    private void setSelected(String name){
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            AndroidTarget target = (AndroidTarget)jComboBox1.getItemAt(i);
            if(target.equals(name)){
                jComboBox1.setSelectedIndex(i);
                return;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        saveProperties();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jCheckBox1.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jCheckBox1.text")); // NOI18N
        jCheckBox1.setToolTipText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jCheckBox1.toolTipText")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jLabel2.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jComboBox1.toolTipText")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jLabel3.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jTextField1.text")); // NOI18N
        jTextField1.setToolTipText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jTextField1.toolTipText")); // NOI18N

        jButton2.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jButton2.text")); // NOI18N
        jButton2.setToolTipText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jButton2.toolTipText")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(MobileCustomizerPanel.class, "MobileCustomizerPanel.jTextArea1.text")); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, 0, 278, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    AndroidSdkTool.startAndroidTool(true);
    updateTargetList();
}//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
