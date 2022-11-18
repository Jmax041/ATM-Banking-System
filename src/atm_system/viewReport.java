/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jimuel Maxwell
 */
public class viewReport extends javax.swing.JFrame {

    /**
     * Creates new form viewReport
     */
    public viewReport() {
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

        framePanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        transTable = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        accnumLabel = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        menuHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AccountInfo = new javax.swing.JButton();
        Balance = new javax.swing.JButton();
        DepositMoney = new javax.swing.JButton();
        WithdrawMoney = new javax.swing.JButton();
        Report = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");

        framePanel.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        reportTable.setBackground(new java.awt.Color(255, 255, 255));
        reportTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        reportTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        transTable.setViewportView(reportTable);

        accnumLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        accnumLabel.setForeground(new java.awt.Color(0, 0, 0));
        accnumLabel.setText("Account Number:");

        acc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acc.setForeground(new java.awt.Color(102, 153, 255));
        acc.setText("-accountnum-");

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transTable)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(accnumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print)
                .addGap(209, 209, 209))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accnumLabel)
                    .addComponent(acc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transTable, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(102, 153, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Operations");

        javax.swing.GroupLayout menuHeaderLayout = new javax.swing.GroupLayout(menuHeader);
        menuHeader.setLayout(menuHeaderLayout);
        menuHeaderLayout.setHorizontalGroup(
            menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuHeaderLayout.setVerticalGroup(
            menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuHeaderLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        AccountInfo.setBackground(new java.awt.Color(102, 153, 255));
        AccountInfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AccountInfo.setText("Account Information");
        AccountInfo.setBorder(null);
        AccountInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountInfoActionPerformed(evt);
            }
        });

        Balance.setBackground(new java.awt.Color(102, 153, 255));
        Balance.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Balance.setText("Check Current Balance");
        Balance.setToolTipText("");
        Balance.setBorder(null);
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });

        DepositMoney.setBackground(new java.awt.Color(102, 153, 255));
        DepositMoney.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DepositMoney.setText("Deposit Money");
        DepositMoney.setToolTipText("");
        DepositMoney.setBorder(null);
        DepositMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositMoneyActionPerformed(evt);
            }
        });

        WithdrawMoney.setBackground(new java.awt.Color(102, 153, 255));
        WithdrawMoney.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        WithdrawMoney.setText("Withdraw Money");
        WithdrawMoney.setToolTipText("");
        WithdrawMoney.setBorder(null);
        WithdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawMoneyActionPerformed(evt);
            }
        });

        Report.setBackground(new java.awt.Color(102, 153, 255));
        Report.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Report.setText("View report");
        Report.setToolTipText("");
        Report.setBorder(null);
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(102, 153, 255));
        Logout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Logout.setText("Logout");
        Logout.setToolTipText("");
        Logout.setBorder(null);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AccountInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DepositMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WithdrawMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Balance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DepositMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WithdrawMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Report)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(102, 153, 255));

        header1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        header1.setForeground(new java.awt.Color(255, 255, 255));
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_system/ATMlogo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(header1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(header1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout framePanelLayout = new javax.swing.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(framePanelLayout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    PreparedStatement psm = null;
    ResultSet rs = null;
    Statement sm = null;
    
    
    private int myAcc;
    
    public viewReport(int acc){
        
        initComponents();
                      
        myAcc = acc;      
        this.acc.setText(""+ myAcc);
        
        displayTable();
    }
    
    private void displayTable(){
        
        String display = "SELECT * FROM transaction where AccNum ='"+ acc.getText() +"'  ";
            try{
                 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                sm = con.createStatement();
                rs = sm.executeQuery(display);
                reportTable.setModel(DbUtils.resultSetToTableModel(rs));
                          
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }
    
    private void print(){
        
        MessageFormat header = new MessageFormat("Transaction Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
        try{
            
            reportTable.print(JTable.PrintMode.NORMAL, header, footer);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(this, e);
        }

    }
    
    private void AccountInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountInfoActionPerformed
       
        String retrieve = "SELECT * FROM account where AccNum ='"+ acc.getText() +"' ";
            try{
                 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                sm = con.createStatement();
                rs = sm.executeQuery(retrieve);
                  
                if(rs.next()){
                                          
                    new mainMenu(rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(1),rs.getInt(2)).setVisible(true);
                    this.dispose();                    
                }
                            
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_AccountInfoActionPerformed

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed
        
        String retrieve = "SELECT * FROM account where AccNum ='"+ acc.getText() +"' ";
            try{
                 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                sm = con.createStatement();
                rs = sm.executeQuery(retrieve);
                  
                if(rs.next()){
                                          
                    new checkBalance(rs.getString(3), rs.getString(4), rs.getInt(1),rs.getDouble(8)).setVisible(true);
                    this.dispose();                    
                }
                            
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_BalanceActionPerformed

    private void DepositMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositMoneyActionPerformed
        
        String retrieve = "SELECT * FROM account where AccNum ='"+ acc.getText() +"' ";
            try{
                 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                sm = con.createStatement();
                rs = sm.executeQuery(retrieve);
                  
                if(rs.next()){
                                          
                    new deposit(rs.getInt(1),rs.getDouble(8)).setVisible(true);
                    this.dispose();                    
                }
                            
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_DepositMoneyActionPerformed

    private void WithdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawMoneyActionPerformed
       
        String retrieve = "SELECT * FROM account where AccNum ='"+ acc.getText() +"' ";
            try{
                 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                sm = con.createStatement();
                rs = sm.executeQuery(retrieve);
                  
                if(rs.next()){
                                          
                    new withdraw(rs.getInt(1),rs.getDouble(8)).setVisible(true);
                    this.dispose();                    
                }
                            
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_WithdrawMoneyActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
       
        String retrieve = "SELECT * FROM account where AccNum ='"+ acc.getText() +"' ";
            try{
                 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                sm = con.createStatement();
                rs = sm.executeQuery(retrieve);
                  
                if(rs.next()){
                                          
                    new viewReport(rs.getInt(1)).setVisible(true);
                    this.dispose();                    
                }
                            
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_ReportActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        
        int response = JOptionPane.showConfirmDialog(this, "Do you really want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.YES_OPTION){
             new frontPage().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
        print();
    }//GEN-LAST:event_printActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountInfo;
    private javax.swing.JButton Balance;
    private javax.swing.JButton DepositMoney;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Report;
    private javax.swing.JButton WithdrawMoney;
    private javax.swing.JLabel acc;
    private javax.swing.JLabel accnumLabel;
    private javax.swing.JPanel framePanel;
    private javax.swing.JLabel header1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuHeader;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton print;
    private javax.swing.JTable reportTable;
    private javax.swing.JScrollPane transTable;
    // End of variables declaration//GEN-END:variables
}
