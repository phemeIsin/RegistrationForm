package registrationform;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class form extends javax.swing.JFrame {

    public form() {
        initComponents();
       loadtdata();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMale = new javax.swing.JRadioButton();
        jFemale = new javax.swing.JRadioButton();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Mobile");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setText("Gender");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setText("DOB");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(jMale);
        jMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMale.setText("male");
        jMale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(jFemale);
        jFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jFemale.setText("female");
        jFemale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleActionPerformed(evt);
            }
        });

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        day.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        month.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jCheckBox1.setText("Accept Terms and Conditions");
        jCheckBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel6.setText("Registration Form");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField1))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton1)
                                .addGap(64, 64, 64)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMale)
                            .addComponent(jFemale)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(month)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFemaleActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String Name = jTextField1.getText();
String Mobile = jTextField2.getText();
String Gender = " ";
    if (jMale.isSelected()) {
        Gender = "Male";
    } else if (jFemale.isSelected()) {
        Gender = "Female";
    }
String Address = jTextField3.getText();
String DOB = day.getSelectedItem().toString()+ " " +
                     month.getSelectedItem().toString() + " " +
                     year.getSelectedItem().toString();
if (Name.isEmpty() || Mobile.isEmpty() || Gender.isEmpty() || Address.isEmpty() || !jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields or accept the terms");

  return;
 }
try{
String url = "jdbc:mysql://127.0.0.1:3306/registration form?autoReconnect=true&useSSL=false";
      String user = "phemeIsin";
      String password = "shinigami123";
Connection con = DriverManager.getConnection(url, user, password);
 String query ="INSERT INTO tableform (Name, Mobile, Gender, DOB, Address) VALUES(?, ?, ?, ?, ?)";
 PreparedStatement pst = con.prepareStatement(query);
 pst.setString(1, Name);
 pst.setString(2, Mobile);
 pst.setString(3, Gender);
 pst.setString(4, DOB);
 pst.setString(5, Address);
 pst.executeUpdate();
 JOptionPane.showMessageDialog(this,"details accepted");
 loadtdata();
 jTextField1.setText("");
 jTextField2.setText("");
 jMale.setSelected(false);
 jFemale.setSelected(false);
 day.setSelectedIndex(0);
 month.setSelectedIndex(0);
 year.setSelectedIndex(0);
 jTextField3.setText("");
 jCheckBox1.setSelected(false);
}
catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error submitting details:" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 jTextField1.setText("");
 jTextField2.setText("");
 jMale.setSelected(false);
 jFemale.setSelected(false);
 day.setSelectedIndex(0);
 month.setSelectedIndex(0);
 year.setSelectedIndex(0);
 jTextField3.setText("");
 jCheckBox1.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JRadioButton jFemale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
public void loadtdata()
{
    try 
  {
      String url = "jdbc:mysql://127.0.0.1:3306/registration form?autoReconnect=true&useSSL=false";
      String user = "phemeIsin";
      String password = "shinigami123";
      Connection con = DriverManager.getConnection(url, user, password);
      String query = "SELECT * FROM tableform";
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
      String columns[] = {"Name","Mobile","Gender","DOB","Address"};
      String data[][] = new String[8][5];
      int i = 0;
      while (res.next() && i< data.length) {
      String name = res.getString("Name");
     String mobile = res.getString("Mobile");
     String gender = res.getString("Gender");
     String dob = res.getString("DOB");
     String address = res.getString("Address");
        data[i][0] = name;
        data[i][1] = mobile;
        data[i][2] = gender;
        data[i][3] = dob;  
        data[i][4] = address;
       
        i++;
      }
    
  DefaultTableModel model = new DefaultTableModel(data, columns);
  jTable1.setModel(model);
  jTable1.setShowGrid(true);
      jTable1.setShowVerticalLines(true);
  
      
  } catch(SQLException e) {
      e.printStackTrace();
    }
    }                                        

}

