/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimuel Maxwell
 */
public class checkBalance extends javax.swing.JFrame {

    /**
     * Creates new form checkBalance
     */
    public checkBalance() {
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
        headerPanel = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        accnumLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");

        framePanel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(102, 153, 255));

        header1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        header1.setForeground(new java.awt.Color(255, 255, 255));
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_system/ATMlogo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
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

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name:");

        accnumLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        accnumLabel.setForeground(new java.awt.Color(0, 0, 0));
        accnumLabel.setText("Account Number:");

        balanceLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(0, 0, 0));
        balanceLabel.setText("Current Balance:");

        name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(102, 153, 255));
        name.setText("-name-");

        acc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acc.setForeground(new java.awt.Color(102, 153, 255));
        acc.setText("-accountnum-");

        balance.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        balance.setForeground(new java.awt.Color(102, 153, 255));
        balance.setText("0.00");

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
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(balanceLabel)
                            .addComponent(accnumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print)
                .addGap(185, 185, 185))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accnumLabel)
                    .addComponent(acc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(balance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print)
                .addGap(27, 27, 27))
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
                .addGap(0, 176, Short.MAX_VALUE))
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
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    PreparedStatement psm = null;
    ResultSet rs = null;
    Statement sm = null;
    
    DecimalFormat df = new DecimalFormat("₱ ###,###,##0.00"); 
    
    private String myFname;
    private String myLname;
    private int myAcc;
    private double myBalance;
        
    public checkBalance(String first, String last, int acc, double balance){
        
        initComponents();
        myFname = first;
        myLname = last;
        myAcc = acc;
        myBalance = balance;
        
        this.name.setText(myFname + " " + myLname);
        this.acc.setText(""+myAcc);
        this.balance.setText(""+df.format(myBalance));
    }
    
    private String transDate;
    private String transTime;
    
    private void getDate(){
        
        Date d= new Date();
        SimpleDateFormat sdf =  new SimpleDateFormat("dd-MM-yyyy");
        transDate = sdf.format(d);
    }
    
    private void getTime(){
        
        Date t= new Date();
        SimpleDateFormat sdf =  new SimpleDateFormat("hh:mm:ss a");
        transTime = sdf.format(t);
    }
    
    private void print(){
        
        try{
        PrintStream text = new PrintStream(new File("Balance.txt"));
        System.setOut(text);
        
        text.print("Name: " + name.getText());
        text.print("\nAccount Number: " + acc.getText());
        text.print("\nDate of Print: " + transDate);
        text.print("\nTime of Print: " + transTime);
        text.print("\nCurrent Balance: " + df.format(myBalance));
        }
        
        catch(FileNotFoundException fx){
            
            System.out.print(fx);
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
         
        getDate();
        getTime();
        print();
        JOptionPane.showMessageDialog(this, "Print process successful!");
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(checkBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkBalance().setVisible(true);
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
    private javax.swing.JLabel balance;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JPanel framePanel;
    private javax.swing.JLabel header1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuHeader;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
