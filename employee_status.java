package employeemanagement;

import static com.sun.javafx.fxml.expression.Expression.set;
import static com.sun.javafx.scene.CameraHelper.project;
import static com.sun.scenario.Settings.set;
import static java.lang.reflect.Array.set;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class Employee_Status extends javax.swing.JFrame {
    Connection conn =null;
    PreparedStatement stm= null;
    Statement stm1= null;
    Statement stm2= null;
    ResultSet rs=null;
    
    public Employee_Status() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_empname = new javax.swing.JTextField();
        txt_project = new javax.swing.JTextField();
        IDBTN = new javax.swing.JButton();
        Reportbtn = new javax.swing.JButton();
        STATUSBTN = new javax.swing.JButton();
        Homebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_status = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Employee Project Status");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EmpID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EmpName");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Project");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Status");

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txt_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_projectActionPerformed(evt);
            }
        });

        IDBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDBTN.setText("GET EMPID");
        IDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDBTNActionPerformed(evt);
            }
        });

        Reportbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reportbtn.setText("REPORT");
        Reportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportbtnActionPerformed(evt);
            }
        });

        STATUSBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        STATUSBTN.setText("UPDATE STATUS");
        STATUSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATUSBTNActionPerformed(evt);
            }
        });

        Homebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Homebtn.setText("HOME");
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });

        txt_status.setColumns(20);
        txt_status.setRows(5);
        jScrollPane1.setViewportView(txt_status);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_project, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_empname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(IDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(STATUSBTN)
                                .addGap(18, 18, 18)
                                .addComponent(Reportbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_empname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_project, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDBTN)
                    .addComponent(STATUSBTN)
                    .addComponent(Reportbtn)
                    .addComponent(Homebtn))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void IDBTNActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","root");
            stm1=conn.createStatement();
            ResultSet rs = stm1.executeQuery("SELECT EMPID from empdb");
	   
            while(rs.next()){
                String id=rs.getString("EMPID");
                jComboBox1.addItem(id);
            }
           
            stm1.close();
            conn.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        

    }                                     

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {                                                        
        // TODO add your handling code here:
        String tmp=(String)jComboBox1.getSelectedItem();
        String Sql="select * from empdb where EMPID=?";
        
        try{
               Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","root");
         
            stm=conn.prepareStatement(Sql);
            stm.setString(1,tmp);
            rs=stm.executeQuery();
            if(rs.next()){
                String name =rs.getString("EmpName");
                txt_empname.setText(name);
                String Project=rs.getString("ProjectAssigned");
                txt_project.setText(Project);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee_Status.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                       

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
    }                                          

    private void STATUSBTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try{
            String Sql1="Insert into statusupdate"
                    +"(EmpID,EmpName,Project,Status)"
                    +"values(?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            conn= (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/empstatus","root","root");
            stm=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(Sql1);
            stm.setString(1,jComboBox1.getSelectedItem().toString());
            stm.setString(2,txt_empname.getText());
            stm.setString(3,txt_project.getText());
            stm.setString(4,txt_status.getText());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Status Updated Sucessfully");  
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }                                         

    private void ReportbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
         try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn=  DriverManager.getConnection("jdbc:mysql://localhost/empstatus","root","root");
               JasperDesign jdesign=JRXmlLoader.load("C:\\Users\\DELL\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\employeemanagement\\Emp_statusReport.jrxml");
      
               String Query="Select * from  statusupdate";
               
               JRDesignQuery updateQuery=new  JRDesignQuery();
               updateQuery.setText(Query);
               
               jdesign.setQuery(updateQuery);
               
               JasperReport jReport = JasperCompileManager.compileReport(jdesign);
               JasperPrint JPrint = JasperFillManager.fillReport(jReport, null,conn);
      
               JasperViewer.viewReport(JPrint);
                       
        }   catch (JRException ex) { 
                java.util.logging.Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) { 
            Logger.getLogger(Employee_Status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Status.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }                                         

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        login l=new login();
      l.setVisible(true);
      dispose();
    }                                       

    private void txt_projectActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Homebtn;
    private javax.swing.JButton IDBTN;
    private javax.swing.JButton Reportbtn;
    private javax.swing.JButton STATUSBTN;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_empname;
    private javax.swing.JTextField txt_project;
    private javax.swing.JTextArea txt_status;
    // End of variables declaration                   

    private static class report {

        public report() {
        }
    }

    
    
}
