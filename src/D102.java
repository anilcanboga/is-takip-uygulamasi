
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yvz
 */
public class D102 extends javax.swing.JFrame {
public Statement st = null;
    public ResultSet rs;
    public Connection c = null;
    /**
     * Creates new form D102
     */
    public D102() {
        initComponents();
             kler();
              setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        this.setTitle(ana.ad);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Kullanıcı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yetkiler"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A101", "A102", "A103", "A104", "A105", "B101", "B102", "C101", "D101", "D102", "D103" }));

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Çıkar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel tablo = (DefaultTableModel) jTable1.getModel();
        jTextField1.setText(tablo.getValueAt(jTable1.getSelectedRow(), 0).toString());
        yetkiler();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String  userid = jTextField1.getText();
       String  yetki = jComboBox1.getSelectedItem().toString();
        
        
        try
        {
             Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
            st = c.createStatement();
            
           
            //String query ="INSERT INTO giris(name , pass) VALUES ('"+ name +"' , '"+pass +"' )";
               String query ="INSERT INTO user2(userid , yetki , dogrula ) VALUES ('"+ userid +"' , '"+yetki +"'  , '"+yetki +"id"+ userid +"'  )";
            PreparedStatement ps;
            ps = c.prepareStatement(query);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Yapıldı", "Başarılı", -1);
  yetkiler();
        }
            catch(Exception e)
            {
                  JOptionPane.showMessageDialog(null, "HATA", "HATA", -1);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String  userid = jTextField1.getText();
       String  yetki = jComboBox2.getSelectedItem().toString();
        
        
        try
        {
             Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
            st = c.createStatement();
            
           
            //String query ="INSERT INTO giris(name , pass) VALUES ('"+ name +"' , '"+pass +"' )";
              // String query ="INSERT INTO user2(userid , yetki , dogrula ) VALUES ('"+ userid +"' , '"+yetki +"'  , '"+yetki +"id"+ userid +"'  )";
               String query ="DELETE FROM user2 WHERE userid = "+userid+" and yetki like '"+yetki+"' ";
            PreparedStatement ps;
            ps = c.prepareStatement(query);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Silindi", "Başarılı", -1);
  yetkiler();
        }
            catch(Exception e)
            {
                  JOptionPane.showMessageDialog(null, "HATA", "HATA", -1);
            }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(D102.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D102.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D102.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D102.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D102().setVisible(true);
            }
        });
    }
    
    
    
        public void kler()
    {
      DefaultTableModel tablo = (DefaultTableModel) jTable1.getModel();
      int rows = tablo.getRowCount();
      for (int i = rows-1 ; i >= 0 ; i-- )
      {
      tablo.removeRow(i);
      }
      
        
    try
    {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
            st = c.createStatement();
    
            String query = "SELECT * FROM user";
            
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
            String nameal = rs.getString("user");
            String idal = rs.getString("id");
           
            
            tablo.addRow(new Object[] { idal ,nameal });
          
            }
            
            
            
    
    }
    catch(Exception e)
    {
    
    }
        
    
    
    }
        
       public void yetkiler()
    {
      DefaultTableModel tablo = (DefaultTableModel) jTable2.getModel();
      int rows = tablo.getRowCount();
      for (int i = rows-1 ; i >= 0 ; i-- )
      {
      tablo.removeRow(i);
      }
      jComboBox2.removeAllItems();
        
    try
    {
        String userid = jTextField1.getText();
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
            st = c.createStatement();
    
            String query = "SELECT * FROM user2 WHERE userid =" + userid;
            
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
            String nameal = rs.getString("yetki");
         
           
            
            tablo.addRow(new Object[] {nameal });
           
            jComboBox2.addItem(nameal);
            
            
            }
            
            
            
    
    }
    catch(Exception e)
    {
    
    }
        
    
    
    }  
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
