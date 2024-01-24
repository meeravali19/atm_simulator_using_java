package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    //global varibale
    JButton login,clear,signup;
    JTextField cardtext;
    JPasswordField pintext;

    Login() {
        setTitle("ATM");
     
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);

        add(label);
        

        // heading
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        //input
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 375, 30);
        add(cardno);
        
        cardtext = new JTextField(15);
        cardtext.setBounds(300, 150, 250, 30);
        cardtext.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardtext);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125, 220, 375, 30);
        add(pin);
        
        pintext = new JPasswordField();
        pintext.setBounds(300, 220, 250, 30);
        add(pintext);
        //buttons
         login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        clear = new JButton("clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        setSize(800, 450);
        setVisible(true);
        setLocation(350, 200);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==clear){
            cardtext.setText("");
            pintext.setText("");
            
        }else if(ae.getSource()== login){
            conn conn=new conn();
            String cn=cardtext.getText();
            String pn=pintext.getText();
            
            String query="select * from login where cardnumber='"+cn+"' and pinnumber='"+pn+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new atm(pn);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or  Pin");
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource()== signup){
            setVisible(false);
            new signup().setVisible(true);
        
        
    }
    }
    public static void main(String[] args) {
        new Login();
    }
}
