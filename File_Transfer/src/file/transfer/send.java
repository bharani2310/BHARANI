
package file.transfer;
import java.awt.HeadlessException;
import file.transfer.Index;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
    

/**
 *
 * @author bhara
 */
public class send extends javax.swing.JFrame {

    /**
     * Creates new form send
     */
    public send() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private Socket socket;
    private ObjectOutputStream out;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jclose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        jbutton4 = new javax.swing.JButton();
        jbutton5 = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jbutton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jclose.setBackground(new java.awt.Color(51, 0, 255));
        jclose.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jclose.setForeground(new java.awt.Color(255, 255, 255));
        jclose.setText("X");
        jclose.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcloseMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 0, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sender");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jmin.setBackground(new java.awt.Color(51, 0, 255));
        jmin.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jmin.setForeground(new java.awt.Color(255, 255, 255));
        jmin.setText("-");
        jmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(291, 291, 291)
                .addComponent(jmin)
                .addGap(18, 18, 18)
                .addComponent(jclose)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jclose)
                    .addComponent(jmin))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("IP:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtIp.setBackground(new java.awt.Color(108, 122, 137));
        txtIp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIp.setForeground(new java.awt.Color(255, 255, 255));

        jbutton4.setBackground(new java.awt.Color(51, 0, 255));
        jbutton4.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton4.setForeground(new java.awt.Color(255, 255, 255));
        jbutton4.setText("Connect");
        jbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton4ActionPerformed(evt);
            }
        });

        jbutton5.setBackground(new java.awt.Color(51, 0, 255));
        jbutton5.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton5.setForeground(new java.awt.Color(255, 255, 255));
        jbutton5.setText("Send");
        jbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton5ActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(108, 122, 137));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));

        jbutton6.setBackground(new java.awt.Color(51, 0, 255));
        jbutton6.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton6.setForeground(new java.awt.Color(255, 255, 255));
        jbutton6.setText("Back");
        jbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton6ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 0, 255));
        jComboBox1.setFont(new java.awt.Font("STLiti", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Image", "File" }));

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jbutton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtName)
                        .addGap(3, 3, 3)
                        .addComponent(jbutton6)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jcloseMouseClicked

    private void jminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jminMouseClicked

    private void jbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton4ActionPerformed
         try {
            socket = new Socket(txtIp.getText().trim(), 6001);
            txt.append("Connection success ...\n");
            out = new ObjectOutputStream(socket.getOutputStream());
            Data data = new Data();
            data.setStatus("new");
            data.setName("");
            out.writeObject(data);
            out.flush();
        } 
         catch (IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbutton4ActionPerformed

    private void jbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton5ActionPerformed
        try {
            JFileChooser ch = new JFileChooser();
            int c = ch.showOpenDialog(this);
            if (c == JFileChooser.APPROVE_OPTION) {
                File f = ch.getSelectedFile();
                FileInputStream in = new FileInputStream(f);
                byte b[] = new byte[in.available()];
                in.read(b);
                Data data = new Data();
                data.setStatus(jComboBox1.getSelectedItem() + "");
                data.setName(txtName.getText().trim());
                data.setFile(b);
                out.writeObject(data);
                out.flush();
                txt.append("send 1 file ..\n");
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jbutton5ActionPerformed

    private void jbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton6ActionPerformed
        // TODO add your handling code here:
        Index i=new Index();
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jbutton6ActionPerformed

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
            java.util.logging.Logger.getLogger(send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new send().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutton4;
    private javax.swing.JButton jbutton5;
    private javax.swing.JButton jbutton6;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jmin;
    private javax.swing.JTextArea txt;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

   
    
}