package file.transfer;


import javax.swing.JFrame;




public class Index extends javax.swing.JFrame {

   
    public Index() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jclose = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jclose1 = new javax.swing.JLabel();
        jmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbutton2 = new javax.swing.JButton();
        jbutton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PC to PC File Transfer");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jclose1.setBackground(new java.awt.Color(51, 0, 255));
        jclose1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jclose1.setForeground(new java.awt.Color(255, 255, 255));
        jclose1.setText("X");
        jclose1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jclose1MouseClicked(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(103, 103, 103)
                .addComponent(jmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jclose1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jclose1)
                    .addComponent(jmin))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jbutton2.setBackground(new java.awt.Color(0, 0, 255));
        jbutton2.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jbutton2.setForeground(new java.awt.Color(255, 255, 255));
        jbutton2.setText("Send");
        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton2ActionPerformed(evt);
            }
        });

        jbutton1.setBackground(new java.awt.Color(0, 0, 255));
        jbutton1.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jbutton1.setForeground(new java.awt.Color(255, 255, 255));
        jbutton1.setText("Receive");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jbutton2)
                .addGap(110, 110, 110)
                .addComponent(jbutton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton2)
                    .addComponent(jbutton1))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
        Receiver r=new Receiver();
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_jbutton1ActionPerformed

    private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton2ActionPerformed
        send s=new send();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_jbutton2ActionPerformed

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jcloseMouseClicked

    private void jclose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jclose1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jclose1MouseClicked

    private void jminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jminMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbutton1;
    private javax.swing.JButton jbutton2;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jclose1;
    private javax.swing.JLabel jmin;
    // End of variables declaration//GEN-END:variables
}
