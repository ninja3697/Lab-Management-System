import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * searchFRM.java
 *
 * Created on 13 Dec, 2015, 7:40:33 PM
 */

/**
 *
 * @author Comp11
 */
public class searchFRM extends javax.swing.JFrame {

    /** Creates new form searchFRM */
    public searchFRM() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        sCB = new javax.swing.JComboBox();
        cCB = new javax.swing.JComboBox();
        sTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTbl = new javax.swing.JTable();
        entLBL = new javax.swing.JLabel();
        rLBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setText("Search Field");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setText("Condition");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel5.setText("Criteria");

        panel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Search for an Item ");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        sCB.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        sCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ItemName", "Price", "number" }));
        sCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sCBActionPerformed(evt);
            }
        });

        cCB.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        cCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", "!=", "like" }));
        cCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCBActionPerformed(evt);
            }
        });

        sTF.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        sTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTFActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cBTN.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        cBTN.setText("Clear Table");
        cBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setText("Search Results-");

        jButton3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jButton3.setText("<html>Back to<br>Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        labTbl.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        labTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemName", "Price", "Lifetime", "Qty.", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        labTbl.setEnabled(false);
        jScrollPane1.setViewportView(labTbl);

        rLBL.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cCB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(sTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addComponent(rLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(sTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(rLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(entLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_sTFActionPerformed

    private void sCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sCBActionPerformed
int i=sCB.getSelectedIndex();
if(i!=0){
    cCB.removeAllItems();
    cCB.insertItemAt("=",0);
    cCB.insertItemAt(">",1);
    cCB.insertItemAt("<",2);
    cCB.insertItemAt("!=",3);
    cCB.insertItemAt(">=",4);
    cCB.insertItemAt("<=",5);
}
else if(i==0){
    cCB.removeAllItems();
    cCB.insertItemAt("=",0);
    cCB.insertItemAt("!=",1);
    cCB.insertItemAt("like",2);
}// TODO add your handling code here:
    }//GEN-LAST:event_sCBActionPerformed

    private void cCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 myFrame2 frame2=new myFrame2();
        searchFRM.this.setVisible(false);
        frame2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTNActionPerformed
DefaultTableModel model=(DefaultTableModel) labTbl.getModel();
int rows=model.getRowCount();
if(rows>0){
for(int i=0;i<rows;i++){
model.removeRow(0);
}
rLBL.setText("");
}// TODO add your handling code here:
}//GEN-LAST:event_cBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cBTN.doClick();
DefaultTableModel model= (DefaultTableModel) labTbl.getModel();
String i = (String) sCB.getSelectedItem();
String con = (String) cCB.getSelectedItem();
String crit = sTF.getText();
if(con.equals("like"))
{
    crit=crit+"%";
}
if(crit.length()==0){
JOptionPane.showMessageDialog(null,"Please specify the search crieteria");
}
else if(crit.length()!=0){
if(sCB.getSelectedIndex()==0){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.print("\nConnecting to database...");
Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/kashyap", "root", "kvalwar");
System.out.println(" SUCCESS!\n");
Statement stmt = con1.createStatement();
ResultSet rs=null;
String query="SELECT * FROM lab WHERE "+i+" "+con+"'"+crit+"';";
rs = stmt.executeQuery(query);
while(rs.next()) {
model.addRow( new Object[ ]{rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getDate(7) });
}
int a=labTbl.getRowCount();
rLBL.setText(a+"records found");
rs.close();
stmt.close();
con1.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,"Error in Connectivity");
}
}
else if(sCB.getSelectedIndex()!=0){
 try{
                Class.forName("java.sql.Driver");
                System.out.print("\nConnecting to database...");
Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/kashyap", "root", "kvalwar");
System.out.println(" SUCCESS!\n");
Statement stmt = con1.createStatement();
String query="SELECT * FROM lab WHERE "+i+" "+con+" "+crit+";";
ResultSet rs = stmt.executeQuery(query);
while(rs.next()) {
model.addRow( new Object[ ]{rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getDate(7) });
}
int a=labTbl.getRowCount();
rLBL.setText(a+"records found");
rs.close();
stmt.close();
con1.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,"Error in Connectivity");
}
}
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cBTN;
    private javax.swing.JComboBox cCB;
    private javax.swing.JLabel entLBL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTbl;
    private java.awt.Panel panel1;
    private javax.swing.JLabel rLBL;
    private javax.swing.JComboBox sCB;
    private javax.swing.JTextField sTF;
    // End of variables declaration//GEN-END:variables

}
