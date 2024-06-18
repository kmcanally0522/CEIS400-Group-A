/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ceis400ecsapp;

/**
 *
 * @author kmcan
 */
public class ECS_UI extends javax.swing.JFrame {


    /**
     * Creates new form ECS_UI
     */
    public ECS_UI() {
        initComponents();
        
        //center the form
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

        tabECS = new javax.swing.JTabbedPane();
        javax.swing.JPanel pnlLogIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTech = new javax.swing.JButton();
        btnMgr = new javax.swing.JButton();
        javax.swing.JPanel pnlTech = new javax.swing.JPanel();
        lblToolBox = new javax.swing.JLabel();
        btnViewTools = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        txaEmpInfo = new javax.swing.JTextArea();
        javax.swing.JPanel pnlMgr = new javax.swing.JPanel();
        lblEmp = new javax.swing.JLabel();
        btnCreateEmp = new javax.swing.JButton();
        btnTerminateEmp = new javax.swing.JButton();
        btnViewEmp = new javax.swing.JButton();
        lblOrders = new javax.swing.JLabel();
        btnViewOrder = new javax.swing.JButton();
        btnNewOrder = new javax.swing.JButton();
        btnOrderStatus = new javax.swing.JButton();
        lblTools = new javax.swing.JLabel();
        btnLostTool = new javax.swing.JButton();
        btnCheckOutTool = new javax.swing.JButton();
        btnCheckedInTool = new javax.swing.JButton();
        jopRequestedInfo = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ECS Log in:");

        btnTech.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTech.setText("Technician");
        btnTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTechActionPerformed(evt);
            }
        });

        btnMgr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMgr.setText("Manager");
        btnMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogInLayout = new javax.swing.GroupLayout(pnlLogIn);
        pnlLogIn.setLayout(pnlLogInLayout);
        pnlLogInLayout.setHorizontalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTech, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(btnMgr, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlLogInLayout.setVerticalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMgr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        tabECS.addTab("LOG IN", pnlLogIn);

        lblToolBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblToolBox.setText("Tool Box:");

        btnViewTools.setText("View Tools");

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnCheckIn.setText("Check in");

        txaEmpInfo.setColumns(20);
        txaEmpInfo.setRows(5);
        jScrollPane1.setViewportView(txaEmpInfo);

        javax.swing.GroupLayout pnlTechLayout = new javax.swing.GroupLayout(pnlTech);
        pnlTech.setLayout(pnlTechLayout);
        pnlTechLayout.setHorizontalGroup(
            pnlTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTechLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTechLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(pnlTechLayout.createSequentialGroup()
                        .addComponent(lblToolBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnViewTools, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        pnlTechLayout.setVerticalGroup(
            pnlTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTechLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnViewTools, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblToolBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tabECS.addTab("Tech", pnlTech);

        lblEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmp.setText("Employee");

        btnCreateEmp.setText("Create");

        btnTerminateEmp.setText("Terminate");

        btnViewEmp.setText("View");

        lblOrders.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOrders.setText("Orders");

        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        btnNewOrder.setText("New Order");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        btnOrderStatus.setText("Order Status");

        lblTools.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTools.setText("Tools");

        btnLostTool.setText("Lost");
        btnLostTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLostToolActionPerformed(evt);
            }
        });

        btnCheckOutTool.setText("Checked out");
        btnCheckOutTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutToolActionPerformed(evt);
            }
        });

        btnCheckedInTool.setText("Checked in");

        javax.swing.GroupLayout pnlMgrLayout = new javax.swing.GroupLayout(pnlMgr);
        pnlMgr.setLayout(pnlMgrLayout);
        pnlMgrLayout.setHorizontalGroup(
            pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMgrLayout.createSequentialGroup()
                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMgrLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMgrLayout.createSequentialGroup()
                                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewOrder)
                                    .addComponent(btnCreateEmp)))
                            .addGroup(pnlMgrLayout.createSequentialGroup()
                                .addComponent(lblTools, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(btnLostTool)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMgrLayout.createSequentialGroup()
                                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTerminateEmp)
                                    .addComponent(btnNewOrder))
                                .addGap(108, 108, 108))
                            .addGroup(pnlMgrLayout.createSequentialGroup()
                                .addComponent(btnCheckOutTool)
                                .addGap(100, 100, 100)))
                        .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheckedInTool)
                            .addComponent(btnOrderStatus)
                            .addComponent(btnViewEmp)))
                    .addGroup(pnlMgrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jopRequestedInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMgrLayout.setVerticalGroup(
            pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMgrLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerminateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlMgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTools, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLostTool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOutTool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckedInTool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jopRequestedInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabECS.addTab("Manager", pnlMgr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabECS)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabECS)
                .addContainerGap())
        );

        tabECS.getAccessibleContext().setAccessibleParent(tabECS);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnLostToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLostToolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLostToolActionPerformed

    private void btnCheckOutToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutToolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckOutToolActionPerformed

    private void btnTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechActionPerformed
        // tech screen
        tabECS.setSelectedIndex(1);
    }//GEN-LAST:event_btnTechActionPerformed

    private void btnMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgrActionPerformed
        // mgr screen
        tabECS.setSelectedIndex(2);
    }//GEN-LAST:event_btnMgrActionPerformed

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
            java.util.logging.Logger.getLogger(ECS_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECS_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECS_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECS_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ECS_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnCheckIn;
    javax.swing.JButton btnCheckOut;
    javax.swing.JButton btnCheckOutTool;
    javax.swing.JButton btnCheckedInTool;
    javax.swing.JButton btnCreateEmp;
    javax.swing.JButton btnLostTool;
    javax.swing.JButton btnMgr;
    javax.swing.JButton btnNewOrder;
    javax.swing.JButton btnOrderStatus;
    javax.swing.JButton btnTech;
    javax.swing.JButton btnTerminateEmp;
    javax.swing.JButton btnViewEmp;
    javax.swing.JButton btnViewOrder;
    javax.swing.JButton btnViewTools;
    javax.swing.JLabel jLabel1;
    javax.swing.JOptionPane jopRequestedInfo;
    javax.swing.JLabel lblEmp;
    javax.swing.JLabel lblOrders;
    javax.swing.JLabel lblToolBox;
    javax.swing.JLabel lblTools;
    javax.swing.JTabbedPane tabECS;
    javax.swing.JTextArea txaEmpInfo;
    // End of variables declaration//GEN-END:variables
}