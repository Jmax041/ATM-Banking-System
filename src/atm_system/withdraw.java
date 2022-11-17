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
public class withdraw extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    public withdraw() {
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
        withdrawLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        withdrawButton = new javax.swing.JButton();
        withdrawText = new javax.swing.JTextField();
        accnumLabel = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
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

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        withdrawLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        withdrawLabel.setForeground(new java.awt.Color(0, 0, 0));
        withdrawLabel.setText("Withdraw Amount:");

        balanceLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(0, 0, 0));
        balanceLabel.setText("Current Balance:");

        balance.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        balance.setForeground(new java.awt.Color(102, 153, 255));
        balance.setText("0.00");

        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        withdrawText.setBackground(new java.awt.Color(255, 255, 255));
        withdrawText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        withdrawText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawTextActionPerformed(evt);
            }
        });

        accnumLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        accnumLabel.setForeground(new java.awt.Color(0, 0, 0));
        accnumLabel.setText("Account Number:");

        acc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acc.setForeground(new java.awt.Color(102, 153, 255));
        acc.setText("-accountnum-");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(withdrawLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawText, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accnumLabel)
                            .addComponent(balanceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(74, 74, 74))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(withdrawButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accnumLabel)
                    .addComponent(acc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(balance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawLabel)
                    .addComponent(withdrawText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(withdrawButton)
                .addGap(29, 29, 29))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(framePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(framePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    PreparedStatement psm = null;
    ResultSet rs = null;
    Statement sm = null;
    
    private int myAcc;
    private double myBalance;
    private double newBalance;
    DecimalFormat df = new DecimalFormat("₱ ###,###,##0.00"); 
    
    public withdraw(int acc, double balance){
        
        initComponents();
        myAcc = acc;
        myBalance = balance;
        
        this.acc.setText(""+ myAcc);
        this.balance.setText(""+ df.format(myBalance));
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
    
    private void withdrawTransactionReport(){
        
        try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement add = con.prepareStatement("INSERT INTO transaction VALUES(?,?,?,?,?,?)");
                add.setInt(1,0);
                add.setInt(2,myAcc);
                add.setString(3,"Withdraw");
                add.setString(4,transDate);
                add.setString(5,transTime);
                add.setString(6,withdrawText.getText());
                           
                add.executeUpdate();
                con.close();
            }
            
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    }
    
    public void print(){
        
        try{
        PrintStream text = new PrintStream(new File("Withdraw Report.txt"));
        System.setOut(text);
        
        text.print("Account Number: " + acc.getText());
        text.print("\nWithdraw Amount: ₱" + withdrawText.getText());
        text.print("\nDate of Transaction: " + transDate);
        text.print("\nTime of Transaction: " + transTime);
        text.print("\nCurrent Balance: " + df.format(newBalance));
        }
        
        catch(FileNotFoundException fx){
            
            System.out.print(fx);
        }
        
    }
    
    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        
        if(withdrawText.getText().isEmpty() || withdrawText.getText().equals(0)){
            
            JOptionPane.showMessageDialog(this, "Enter valid amount");
        }
        
        else if(myBalance < Double.valueOf(withdrawText.getText())){
            
            JOptionPane.showMessageDialog(this, "Not enough balance to withdraw!");
        }
        
        else{
            
            try{
                               
                String retrieve = "UPDATE account SET Balance=? WHERE AccNum=?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                psm = con.prepareStatement(retrieve);
                
                psm.setDouble(1, myBalance-Double.valueOf(withdrawText.getText()));
                psm.setInt(2, myAcc);
                
                if(psm.executeUpdate() == 1){
                    
                    JOptionPane.showMessageDialog(this, "Withdraw process successful!");
                    getDate();
                    getTime();
                    withdrawTransactionReport();
                    newBalance = myBalance-Double.valueOf(withdrawText.getText());
                    print();
                    
                    String retrieve2 = "SELECT * FROM account where AccNum ='"+ acc.getText() +"' ";
                        
                        try{

                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                        sm = con.createStatement();
                        rs = sm.executeQuery(retrieve2);

                        if(rs.next()){

                            new withdraw(rs.getInt(1),rs.getDouble(8)).setVisible(true);
                            this.dispose();                    
                        }
                            
                        }

                        catch(Exception e){

                            JOptionPane.showMessageDialog(this, e);
                        }
                            }
                
                else{
                    
                    JOptionPane.showMessageDialog(this, "Missing informartion!");
                }
            }
                
            catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void withdrawTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawTextActionPerformed

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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
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
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawLabel;
    private javax.swing.JTextField withdrawText;
    // End of variables declaration//GEN-END:variables
}
