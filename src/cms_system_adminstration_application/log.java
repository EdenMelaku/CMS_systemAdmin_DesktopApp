package cms_system_adminstration_application;






import cms_system_adminstration_application.main;
import controler.connection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class log extends javax.swing.JFrame  {
  
    
 public  int count=0;
  Calendar cal=new GregorianCalendar();
  int  month=cal.get(Calendar.MONTH);
  int year=cal.get(Calendar.YEAR);
  int day=cal.get(Calendar.DAY_OF_MONTH);
  
  
  
    String m="currecnt date : "+day+"/"+(month+1)+"/"+year;
    
    
      
    
    
    Connection connect=null;
    public log() {
        
        initComponents();
         connect=connection.connectDB();
          
         setLocationRelativeTo(null);
       
        setTitle("መግቢያ");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(15, 15));
        setMinimumSize(new java.awt.Dimension(1150, 600));
        getContentPane().setLayout(null);

        username.setFont(new java.awt.Font("Visual Geez Unicode", 0, 11)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(241, 110, 240, 35);

        login.setFont(new java.awt.Font("Visual Geez Unicode", 1, 18)); // NOI18N
        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(106, 370, 105, 48);

        password.setFont(new java.awt.Font("Visual Geez Unicode", 0, 11)); // NOI18N
        getContentPane().add(password);
        password.setBounds(241, 178, 240, 43);

        jButton2.setFont(new java.awt.Font("Visual Geez Unicode", 2, 18)); // NOI18N
        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(566, 370, 105, 48);

        jButton3.setText("cancel");
        getContentPane().add(jButton3);
        jButton3.setBounds(158, 711, 63, 23);

        jLabel1.setFont(new java.awt.Font("Visual Geez Unicode", 1, 14)); // NOI18N
        jLabel1.setText("username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(82, 109, 125, 33);

        jLabel2.setFont(new java.awt.Font("Visual Geez Unicode", 1, 14)); // NOI18N
        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(82, 176, 141, 43);

        jLabel3.setFont(new java.awt.Font("Visual Geez Unicode", 1, 36)); // NOI18N
        jLabel3.setText("LOGIN ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1324, 56);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 30, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
         try{
              
       String sql="SELECT *FROM adminusers where username=? and password=? ";
       PreparedStatement pst;
       pst=connect.prepareStatement(sql);
       pst.setString(1,username.getText());
       pst.setString(2,password.getText());
       ResultSet rs;
       rs=pst.executeQuery();
        
       if(rs.next()){
                    String un=rs.getString(1);
                    String pass=rs.getString(2);
                   
           
       main userPage= new main( un, pass);
        username.setText(null);
         password.setText(null);
        userPage.setVisible(true);
       
            
       }
       else{
           count++;
          JOptionPane.showMessageDialog(null,"login failed"); 
          if(count>2){
             dispose();
         }
          }
       rs.close();
       pst.close();
    }                                     
catch(SQLException e){
         JOptionPane.showMessageDialog(null,e);
         
     }
        
        
        
    }//GEN-LAST:event_loginActionPerformed
 
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.username.setText(null);
        this.password.setText(null);
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
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

   

}
