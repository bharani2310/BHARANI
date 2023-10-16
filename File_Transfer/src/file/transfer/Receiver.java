package file.transfer;


import file.transfer.ShowImage;
import file.transfer.Index;
import file.transfer.Data;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author RavenPC
 */
public class Receiver extends javax.swing.JFrame {
    public Receiver() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    


    private ServerSocket server;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private DefaultListModel mod = new DefaultListModel();
   

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if (evt.getClickCount() == 2) {
            if (!list.isSelectionEmpty()) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    open();
                } else if (SwingUtilities.isRightMouseButton(evt)) {
                    save();
                }

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_listMouseClicked

    private void open() {
        Data data = (Data) mod.getElementAt(list.getSelectedIndex());
        if (data.getStatus().equals("Image")) {
            ShowImage obj = new ShowImage(this, true);
            ImageIcon icon = new ImageIcon(data.getFile());
            obj.set(icon);
            obj.setVisible(true);
        }
    }

    private void save() {
        Data data = (Data) mod.getElementAt(list.getSelectedIndex());
        JFileChooser ch = new JFileChooser();
        int c = ch.showSaveDialog(this);
        if (c == JFileChooser.APPROVE_OPTION) {
            try {
                FileOutputStream out = new FileOutputStream(ch.getSelectedFile());
                out.write(data.getFile());
                out.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    

    

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receiver().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jclose = new javax.swing.JLabel();
        jbutton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jbutton4 = new javax.swing.JButton();
        jbutton2 = new javax.swing.JButton();
        jbutton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jbutton5 = new javax.swing.JButton();

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

        jbutton1.setBackground(new java.awt.Color(51, 0, 255));
        jbutton1.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jbutton1.setForeground(new java.awt.Color(255, 255, 255));
        jbutton1.setText("Connect to Server");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 0, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Receiver:");
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
                .addContainerGap()
                .addComponent(jbutton1)
                .addGap(199, 199, 199)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jmin)
                .addGap(18, 18, 18)
                .addComponent(jclose)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jclose)
                                .addComponent(jmin))
                            .addComponent(jbutton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jScrollPane5.setViewportView(list);

        jbutton4.setBackground(new java.awt.Color(51, 0, 255));
        jbutton4.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton4.setForeground(new java.awt.Color(255, 255, 255));
        jbutton4.setText("Back");
        jbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton4ActionPerformed(evt);
            }
        });

        jbutton2.setBackground(new java.awt.Color(192, 57, 43));
        jbutton2.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton2.setForeground(new java.awt.Color(255, 255, 255));
        jbutton2.setText("Open");
        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton2ActionPerformed(evt);
            }
        });

        jbutton3.setBackground(new java.awt.Color(34, 167, 240));
        jbutton3.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton3.setForeground(new java.awt.Color(255, 255, 255));
        jbutton3.setText("Save");
        jbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton3ActionPerformed(evt);
            }
        });

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane3.setViewportView(txt);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("IPV4 Address:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtName.setBackground(new java.awt.Color(108, 122, 137));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));

        jbutton5.setBackground(new java.awt.Color(51, 0, 255));
        jbutton5.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jbutton5.setForeground(new java.awt.Color(255, 255, 255));
        jbutton5.setText("Show");
        jbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbutton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton5))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton4)
                    .addComponent(jbutton2)
                    .addComponent(jbutton3))
                .addContainerGap(58, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
        list.setModel(mod);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    server = new ServerSocket(6001);
                    txt.append("Connecting to Server...\n");
                    Socket s = server.accept();
                    in = new ObjectInputStream(s.getInputStream());
                    Data data = (Data) in.readObject();
                    String name = data.getName();
                    txt.append("New client " + name + " has been connected ...\n");
                    while (true) {
                        data = (Data) in.readObject();
                        mod.addElement(data);
                        txt.append("get 1 file ... \n");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(Receiver.this, e, "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }).start();
    }//GEN-LAST:event_jbutton1ActionPerformed

    private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton2ActionPerformed
        if (!list.isSelectionEmpty()) {
            open();
        }
    }//GEN-LAST:event_jbutton2ActionPerformed

    private void jbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton3ActionPerformed
        if (!list.isSelectionEmpty()) {
            save();
        }
    }//GEN-LAST:event_jbutton3ActionPerformed

    private void jbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton4ActionPerformed
        Index i=new Index();
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jbutton4ActionPerformed

    private void jbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton5ActionPerformed
        try {
            // TODO add your handling code here:
            InetAddress addr = InetAddress.getLocalHost();
            txtName.setText(addr.getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jbutton5ActionPerformed

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jcloseMouseClicked

    private void jminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jminMouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbutton1;
    private javax.swing.JButton jbutton2;
    private javax.swing.JButton jbutton3;
    private javax.swing.JButton jbutton4;
    private javax.swing.JButton jbutton5;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jmin;
    private javax.swing.JList<String> list;
    private javax.swing.JTextArea txt;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
