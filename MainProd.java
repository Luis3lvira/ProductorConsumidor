
package ProdConsumidor;

import javax.swing.DefaultListModel;

/**
 *
 * @author LuisElvira
 */
public class MainProd extends javax.swing.JFrame {

   
    DefaultListModel modelo;
    Container c;
    int contadorPro = 0;
    int contadorCon = 0;
    Pruduct[] arrayPro = new Pruduct[10];
    Consumer[] arrayCon = new Consumer[10];
    public MainProd() {
        initComponents();
        modelo = new DefaultListModel();
        c = new Container();
    }
    
    public void registrar(String texto){
        modelo.addElement(texto);
        this.listBitacora.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnArrancar = new javax.swing.JButton();
        btnAddPro = new javax.swing.JButton();
        btnAddCon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBitacora = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnArrancar.setBackground(new java.awt.Color(102, 255, 255));
        btnArrancar.setText("INICIO");
        btnArrancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrancarActionPerformed(evt);
            }
        });

        btnAddPro.setBackground(new java.awt.Color(102, 255, 255));
        btnAddPro.setText("AGREGA PRODUCTOR");
        btnAddPro.setEnabled(false);
        btnAddPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProActionPerformed(evt);
            }
        });

        btnAddCon.setBackground(new java.awt.Color(102, 255, 255));
        btnAddCon.setText("AGREGA CONSUMIDOR");
        btnAddCon.setEnabled(false);
        btnAddCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConActionPerformed(evt);
            }
        });

        listBitacora.setBackground(new java.awt.Color(153, 255, 255));
        listBitacora.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listBitacora);

        jLabel1.setText("           ++++++++ʕ·ᴥ·ʔ+++++Luis3lvirA+++++ʕ·ᴥ·ʔ+++++++");

        btnStop.setBackground(new java.awt.Color(102, 255, 255));
        btnStop.setText("DETENER");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jTextField1.setText("           ʕ◉ᴥ◉ʔ"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(41, 41, 41)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnArrancar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAddPro)
                        .addGap(37, 37, 37)
                        .addComponent(btnAddCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArrancar)
                    .addComponent(btnStop))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrancarActionPerformed
        // TODO add your handling code here:
        
        Pruduct produce = new Pruduct(c,this,contadorPro);
        Consumer consume = new Consumer(c,this,contadorCon);
        arrayPro[0] = produce;
        arrayCon[0] = consume;
        
        produce.start();
        consume.start();
        btnArrancar.setEnabled(false);
        btnAddCon.setEnabled(true);
        btnAddPro.setEnabled(true);
        btnStop.setEnabled(true);
        contadorPro++;
        contadorCon++;
    }//GEN-LAST:event_btnArrancarActionPerformed

    private void btnAddProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProActionPerformed
        // TODO add your handling code here:
        if (contadorPro != 10){
            Pruduct produce = new Pruduct(c,this,contadorPro);
            produce.start();
            arrayPro[contadorPro] = produce;
            contadorPro++;
        }else{
            btnAddPro.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddProActionPerformed

    private void btnAddConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConActionPerformed
        // TODO add your handling code here:
        if (contadorCon != 10){
            Consumer consume = new Consumer(c,this,contadorCon);
            consume.start();
            arrayCon[contadorCon] = consume;
            contadorCon++;
        }else{
            btnAddCon.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddConActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        for(int i = 0;i < contadorPro;i++){
            arrayPro[i].detener();
        }
        
        for(int i = 0;i < contadorCon;i++){
            arrayCon[i].detener();
        }
    }//GEN-LAST:event_btnStopActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCon;
    private javax.swing.JButton btnAddPro;
    private javax.swing.JButton btnArrancar;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JList<String> listBitacora;
    // End of variables declaration//GEN-END:variables
}
