package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class fastcash extends JFrame implements ActionListener{
    
    JButton deposit,withdraw,fastcash,mini,pinc,be,exit;
    String pn;
    
    public fastcash(String pn){
        this.pn=pn;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210,300,700,35);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        label.add(text);
        
        deposit=new JButton("Rs 100");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        label.add(deposit);
        
       withdraw=new JButton("500");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        label.add(withdraw);
        
        fastcash=new JButton("Rs 1000 ");
        fastcash.setBounds(170,450,150,30);
       fastcash.addActionListener(this);
        label.add(fastcash);
        
        mini=new JButton("Rs 2000");
        mini.setBounds(355,450,150,30);
        mini.addActionListener(this);
        label.add(mini);
        
        pinc=new JButton("Rs 5000");
        pinc.setBounds(170,485,150,30);
        pinc.addActionListener(this);
        label.add(pinc);
        
        be=new JButton("Rs 10000");
        be.setBounds(355,485,150,30);
        be.addActionListener(this);
        label.add(be);
        
        exit=new JButton("Back");
         exit.setBounds(355,520,150,30);
         exit.addActionListener(this);
        label.add( exit);
        
        
        setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(900,900);
    //setUndecorated(true);
    setVisible(true);
    setLocation(300, 0);
    
    }
 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            setVisible(false);
            new atm(pn).setVisible(true);
        }else{
            String amount=((JButton)ae.getSource()).getText().substring(3);
            conn c= new conn();
            try
            {
                ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pn+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));  
                    }
                else{
                        balance-=Integer.parseInt(rs.getString("amount")); 
                        }
                }
                
                if(ae.getSource() !=null && balance< Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficent Balance" );
                    return;
                }
                Date date= new Date();
               String query="insert into bank values('"+pn+"','"+date+"','withdrawl','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Rs"+amount+"Debited Sucessfully" );
                setVisible(false);
                new atm(pn).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        
    }
    
    
    public static void main(String args[]){
        new fastcash("");
    }
}
