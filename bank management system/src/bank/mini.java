package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class mini extends JFrame{
    String pin;
    
    public mini(String pin){
        this.pin=pin;
        
        
        
        JLabel text=new JLabel();
        add(text);
        
        JLabel bank =new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel mini=new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        JLabel balance= new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        
        try{
            conn conn= new conn();
            ResultSet rs=conn.s.executeQuery("Select * from login where pinnumber='"+pin+"'");
            while(rs.next()){
                card.setText("Card Number:"+rs.getString("cardnumber").substring(0,4)+"xxxxxxxx"+rs.getString("cardnumber").substring(12,16));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        try{
            conn conn = new conn();
            int bal=0;
            ResultSet rs=conn.s.executeQuery("Select * from bank where pin='"+pin+"'");
            while(rs.next()){
                mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
            
                
                if(rs.getString("type").equals("Deposit")){
                        bal+=Integer.parseInt(rs.getString("amount"));  
                    }
                else{
                        bal-=Integer.parseInt(rs.getString("amount")); 
                        }
                }

            balance.setText("Your Current account balance is Rs:"+bal);
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        setTitle("Mini Statement");
       setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(400,600);
    //setUndecorated(true);
    setVisible(true);
    setLocation(20, 20);
     
    }
    
    
    
    public static void main(String args[]){
        new mini("");
    }
    
}
