
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pinchange extends JFrame implements ActionListener{
    JPasswordField f1,f2;
    JButton b1,b2;
    String pin;
    
    public pinchange(String pin){
        this.pin=pin;
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        JLabel text= new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        label.add(text);
        
        
        JLabel pintext= new JLabel("New Pin");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        label.add(pintext);
        
        f1= new JPasswordField();
        f1.setFont(new Font("System",Font.BOLD,16));
        f1.setBounds(330,320,180,25);
        label.add(f1);
        
        
        JLabel repintext= new JLabel("Re-Enter your Pin");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        label.add(repintext);
        
        f2= new JPasswordField();
        f2.setFont(new Font("System",Font.BOLD,16));
        f2.setBounds(330,360,180,25);
        label.add(f2);
        
        b1=new JButton("Change");
        b1.setBounds(355,485,150,30);
        b1.addActionListener(this);
        
        label.add(b1);
        
         b2=new JButton("Back");
        b2.setBounds(355,520,150,30);
         b2.addActionListener(this);
        label.add(b2);
        
        setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(900,900);
    //setUndecorated(true);
    setVisible(true);
    setLocation(300, 0);
    
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()==b1){
            try{
            String npin=f1.getText();
            String rpin=f2.getText();
            
            if(npin.equals("") || rpin.equals("")){
                JOptionPane.showMessageDialog(null," please Your Enter Pin ");
                return;
            }
            
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Entered Pin is not match");
                return;
            }
           conn c1 = new conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pin+"' ";
                String q3 = "update signup2 set pinnumber = '"+rpin+"' where pinnumber = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new atm(rpin).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
            
        }else if(ae.getSource()==b2){
           setVisible(false);
           new atm(pin).setVisible(true);
           
            
        }
        
    }
        


    
    public static void main(String args[]){
        new pinchange("").setVisible(true);
    }
}
