package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class atm extends JFrame implements ActionListener{
    
    JButton deposit,withdraw,fastcash,mini,pinc,be,exit;
    String pn;
    
    public atm(String pn){
        this.pn=pn;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(210,300,700,35);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        label.add(text);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        label.add(deposit);
        
       withdraw=new JButton("Cash Withdrawl");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        label.add(withdraw);
        
        fastcash=new JButton("Fast cash");
        fastcash.setBounds(170,450,150,30);
       fastcash.addActionListener(this);
        label.add(fastcash);
        
        mini=new JButton("Mini Statement");
        mini.setBounds(355,450,150,30);
        mini.addActionListener(this);
        label.add(mini);
        
        pinc=new JButton("Pin Change");
        pinc.setBounds(170,485,150,30);
        pinc.addActionListener(this);
        label.add(pinc);
        
        be=new JButton("Balance Enquiry");
        be.setBounds(355,485,150,30);
        be.addActionListener(this);
        label.add(be);
        
        exit=new JButton("Exit");
         exit.setBounds(355,520,150,30);
         exit.addActionListener(this);
        label.add( exit);
        
        
        setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(900,900);
    setUndecorated(true);
    setVisible(true);
    setLocation(300, 0);
    
    }
 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== deposit){
            setVisible(false);
            new Deposit(pn).setVisible(true);
        }else if (ae.getSource()==withdraw){
            setVisible(false);
            new withdrawl(pn).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new fastcash(pn).setVisible(true);
            
        }else if(ae.getSource()==mini){
           
            new mini(pn).setVisible(true);
            
        }else if(ae.getSource()==pinc){
            setVisible(false);
            new pinchange(pn).setVisible(true);
            
        }else if(ae.getSource()==be){
            setVisible(false);
            new Balance(pn).setVisible(true);
            
        }else if(ae.getSource()==exit){
            System.exit(0);
        }
        
        
    }
    
    
    public static void main(String args[]){
        new atm("");
    }
}
