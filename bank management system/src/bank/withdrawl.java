
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class withdrawl extends JFrame implements ActionListener{
    JButton withdraw,back;
    JTextField de;
    String pinnumber;
    
    public withdrawl(String pinnumber){
        this.pinnumber=pinnumber;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        
        JLabel text=new JLabel("Enter the Amount you want to Withraw");
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,20);
        label.add(text);
        
        de= new JTextField();
        de.setFont(new Font("Raleway",Font.BOLD,22));
        de.setBounds(170,350,320,20);
        label.add(de);
        
         withdraw=new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        label.add(withdraw);
        
         back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        label.add(back);
        
        setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(900,900);
    //setUndecorated(true);
    setVisible(true);
    setLocation(300, 0);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== back){
            setVisible(false);
            new atm(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdraw){
            String cash=de.getText();
            Date date=new Date();
            if(de.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter some amount");
            }else{
                try{
                conn conn=new conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+cash+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+cash+"withdrawl succesfully");
                
                setVisible(false);
                new atm(pinnumber).setVisible(true);
                
                
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            
        }
    }
    
    
    
    public static void main(String args[]){
        new withdrawl("");
    }
    
}
