
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class signup2 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    public signup2(String fromno){
        this.formno=fromno;
        
        JLabel title=new JLabel("Page 3:Account Details");
        title.setFont(new Font("osward",Font.BOLD,38));
        title.setBounds(180,40,600,50);
        add(title);
        //details
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("osward",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,40);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup acc= new ButtonGroup();
        acc.add(r1);
        acc.add(r2);
        acc.add(r3);
        acc.add(r4);
        
        JLabel card= new JLabel("Card Number:");
        card.setFont(new Font("raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel card1= new JLabel("Enter Your 16 Digit Card Number:");
        card1.setFont(new Font("raleway",Font.BOLD,12));
        card1.setBounds(100,330,300,20);
        add(card1);
        
        
        JLabel number= new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("raleway",Font.BOLD,18));
        number.setBounds(330,300,300,30);
        add(number);
        
        
        JLabel pin= new JLabel("PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber= new JLabel("XXXX");
        pnumber.setFont(new Font("raleway",Font.BOLD,18));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pin1= new JLabel("your 4 Digit Password");
        pin1.setFont(new Font("raleway",Font.BOLD,12));
        pin1.setBounds(100,400,200,30);
        add(pin1);
        
        
        JLabel service= new JLabel("Services Requried:");
        service.setFont(new Font("raleway",Font.BOLD,22));
        service.setBounds(100,450,400,30);
        add(service);
        
        c1= new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2= new JCheckBox("Internt Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4= new JCheckBox("Email & Sms Alret");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5= new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6= new JCheckBox("E-Statemnet");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7= new JCheckBox("I Hereby Declares that the Above entered details to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        
        submit= new JButton("Submit");
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("raleway",Font.BOLD,12));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel= new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setFont(new Font("raleway",Font.BOLD,12));
        cancel.setBounds(450,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(800,800);
    setVisible(true);
    setLocation(350, 10);
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
            if (ae.getSource()==submit){
                String accountType=null;
                if (r1.isSelected()){
                    accountType="Saving Account";
                }else if(r2.isSelected()){
                    accountType="Fixed Deposit Account";
                    
                }else if(r3.isSelected()){
                    accountType="Current Account";
                
            }else if(r4.isSelected()){
                accountType="Reccuring Account";
            }
                
                
             Random rand=new Random();
             String cn=""+Math.abs((rand.nextLong() % 90000000L)+5040936000000000L);
             String pn=""+Math.abs((rand.nextLong()%9000L)+1000L);
             
             String fac="";
             if (c1.isSelected()){
                 fac=fac+"ATM CARD";
             } 
             if(c2.isSelected()){
                 fac=fac+" Internet Banking";
             }
             if(c3.isSelected()){
                 fac=fac+" MObile Banking";
             }
             if(c4.isSelected()){
                 fac=fac+" Email & Sms Alerts";
                 
             }
             if(c5.isSelected()){
                 fac=fac+" Cheque Book";
             }
             if(c6.isSelected()){
                         fac=fac+"E-statement";
            }
                
             
             try{
           if (accountType.equals("")){
               JOptionPane.showMessageDialog(null,"Account Type is required");
           }else if(c7.isSelected()){
               conn c =new conn();
               String Query1="insert into signup2 values('"+formno+"','"+accountType+"','"+cn+"','"+pn+"','"+fac+"');";
               String Query2="insert into login values('"+formno+"','"+cn+"','"+pn+"');";
               c.s.executeUpdate(Query1);
               c.s.executeUpdate(Query2);
               JOptionPane.showMessageDialog(null,"Card Number:"+cn+"\n pin:"+pn);
               
               setVisible(false);
               new Deposit(pn).setVisible(true);
               
           }else{
               JOptionPane.showMessageDialog(null,"please check the Declaration box");
           }
           
       }
       catch(Exception e){
           System.out.println(e);
       }
       
             
}else if(ae.getSource()== cancel){
    setVisible(false);
    new Login().setVisible(true);
                
            
            } 
    }
    
    
    public static void main(String args[]){
        new signup2("");
    }
}
