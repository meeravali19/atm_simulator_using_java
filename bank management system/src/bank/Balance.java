
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class Balance extends JFrame implements ActionListener {
    JButton back;
    String pin;
    public Balance(String pin){
        this.pin=pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        
        label.add(back);
        
        conn c= new conn();
        int balance=0;
            try
            {
                ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pin+"'");
                
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));  
                    }
                else{
                        balance-=Integer.parseInt(rs.getString("amount")); 
                        }
                }
        
            }catch(Exception e){
                System.out.println(e);
            }
        
            JLabel text=new JLabel("Your Current account balance is Rs"+balance);
            text.setForeground(Color.WHITE);
            text.setBounds(170,300,400,30);
            label.add(text);
            
            
        setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(900,900);
    //setUndecorated(true);
    setVisible(true);
    setLocation(300, 0);
    
        
    }
    
    public  void actionPerformed(ActionEvent ae){
        setVisible(false);
        new atm(pin).setVisible(true);
                
    }
    
    
    public static void main(String args[]){
        new Balance("");
    }
    
}
