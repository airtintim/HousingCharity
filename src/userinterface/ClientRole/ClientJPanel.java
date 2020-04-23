/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClientRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ClientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private ClientOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private ClientRequest request;
    /**
     * Creates new form ClientJPanel
     */
    public ClientJPanel(JPanel userProcessContainer, UserAccount account, ClientOrganization organization, Enterprise enterprise, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        initComponents();
        request = (ClientRequest) account.getWorkQueue().getWorkRequestList().get(0);
        populateMessage(request);
    }

    public void populateMessage(ClientRequest request) {
        String status = request.getStatus();
        String helper = (request.getReceiver() != null) ? request.getReceiver().getUsername() : "N/A";
        messageLabel.setText(request.getMessage());
        statusLabel.setText(status);
        helperLabel.setText(helper);
        if (status.equals("None")) {
            applyButton.setEnabled(true);
            applyTextField.setEnabled(true);
            additonalLabel.setEnabled(true);
        } else {
            applyButton.setEnabled(false);
            applyTextField.setEnabled(false);
            additonalLabel.setEnabled(false);
        }
        if (status.equals("Match")) {
            doneButton.setEnabled(true);
        } else {
            doneButton.setEnabled(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        applyTextField = new javax.swing.JTextField();
        applyButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        helperLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        additonalLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("Message:");

        messageLabel.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Status:");

        statusLabel.setText("jLabel2");

        applyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyTextFieldActionPerformed(evt);
            }
        });

        applyButton.setBackground(new java.awt.Color(255, 255, 255));
        applyButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        applyButton.setText("Apply for a room");
        applyButton.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 255, 51)));
        applyButton.setContentAreaFilled(false);
        applyButton.setOpaque(true);
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("Room provider: ");

        helperLabel.setText("jLabel2");

        doneButton.setBackground(new java.awt.Color(255, 255, 255));
        doneButton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        doneButton.setText("Check out");
        doneButton.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 102, 102)));
        doneButton.setContentAreaFilled(false);
        doneButton.setOpaque(true);
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel2.setText("Looking for a place to stay?");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel5.setText("Welcome to apply for a room at no cost ");

        additonalLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        additonalLabel.setText("Addtional Message to staff and patient? ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(additonalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(applyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(helperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(77, 77, 77)
                                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(96, 96, 96)
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 415, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(503, 503, 503))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(messageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(statusLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helperLabel)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addComponent(additonalLabel)
                .addGap(15, 15, 15)
                .addComponent(applyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applyTextFieldActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        // TODO add your handling code here:
        String message = applyTextField.getText();
        request.setMessage(message);
        request.setStatus("Under review");
        applyTextField.setText("");
        populateMessage(request);
        system.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Your application is under review");
    }//GEN-LAST:event_applyButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to check out your room? \nYou may have to queue up next time", "Checkout comfirmation", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            JOptionPane.showMessageDialog(null,  "Alright good luck, wish you well");
            request.setMessage("Done");
            request.setStatus("None");
            system.getWorkQueue().getWorkRequestList().remove(request);
            UserAccount userAccount = request.getReceiver();
            for (WorkRequest r : userAccount.getWorkQueue().getWorkRequestList()) {
                if (r.getReceiver() != null && account.getUsername().equals(r.getReceiver().getUsername())) {
                    r.setMessage("Done");
                    r.setStatus("Under review");
                    r.setReceiver(null);
                }
            }
            request.setReceiver(null);
            populateMessage(request);
        } else if (n == 1) {
            JOptionPane.showMessageDialog(null, "Room checkout canceled");
        }
    }//GEN-LAST:event_doneButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additonalLabel;
    private javax.swing.JButton applyButton;
    private javax.swing.JTextField applyTextField;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel helperLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
