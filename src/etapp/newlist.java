/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package etapp;

/**
 *
 * @author Sara Mariam Raju
 */
public class newlist extends javax.swing.JFrame {

    /**
     * Creates new form newlist
     */
    public newlist() {
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
        newlist = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        namee = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresss = new javax.swing.JTextArea();
        adharno = new javax.swing.JLabel();
        adharnoo = new javax.swing.JTextField();
        accept = new javax.swing.JButton();
        reject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newlist.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        newlist.setText("ETAPP FOR EASY CONNECTION");
        jPanel1.add(newlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 440, 40));

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setText("NAME");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, 30));

        namee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameeActionPerformed(evt);
            }
        });
        jPanel1.add(namee, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 150, 30));

        address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        address.setText("ADDRESS");
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 90, 30));

        addresss.setColumns(20);
        addresss.setRows(5);
        jScrollPane1.setViewportView(addresss);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 180, 70));

        adharno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adharno.setText("ADHAR NO");
        jPanel1.add(adharno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 100, 40));
        jPanel1.add(adharnoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 170, 30));

        accept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        accept.setText("ACCEPT");
        jPanel1.add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 120, 30));

        reject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reject.setText("REJECT");
        jPanel1.add(reject, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etapp/allimg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 58, 527, 368));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameeActionPerformed

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
            java.util.logging.Logger.getLogger(newlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JLabel address;
    private javax.swing.JTextArea addresss;
    private javax.swing.JLabel adharno;
    private javax.swing.JTextField adharnoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField namee;
    private javax.swing.JLabel newlist;
    private javax.swing.JButton reject;
    // End of variables declaration//GEN-END:variables
}
