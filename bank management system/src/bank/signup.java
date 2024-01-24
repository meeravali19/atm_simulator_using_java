
package bank.management.system;
import javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class signup extends JFrame implements ActionListener{
    
    JTextField tname,tfname,temail,taddress,tcity,tstate,tpincode;
    long random;
    JDateChooser tdob;
    JButton next;
    JRadioButton male,female,o,m,um;
    
    signup(){
        
        
        //application number
        Random ran=new Random();
        random = Math.abs((ran.nextLong()%9000L+1000L));
        //heading
        JLabel j1= new JLabel("Application Form NO. "+random);
        j1.setFont(new Font("RAleway",Font.BOLD,38));
        j1.setBounds(140,20,600,40);
        add(j1);
        //personal detailds
       JLabel details= new JLabel("page 1:Personal Details");
        details.setFont(new Font("RAleway",Font.BOLD,22));
        details.setBounds(290,80,400,30);
        add(details);
        
        //details
        JLabel name= new JLabel("Name:");
        name.setFont(new Font("raleway",Font.BOLD,18));
        name.setBounds(100,140,100,30);
        add(name);
        
        tname= new JTextField();
        tname.setFont(new Font("Raleway",Font.BOLD,14));
        tname.setBounds(300,140,400,30);
        add(tname);
        
        JLabel Fname= new JLabel("Father Name:");
        Fname.setFont(new Font("raleway",Font.BOLD,18));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
        tfname= new JTextField();
        tfname.setFont(new Font("Raleway",Font.BOLD,14));
        tfname.setBounds(300,190,400,30);
        add(tfname);
        
        
        JLabel dob= new JLabel("Date Of Birth:");
        dob.setFont(new Font("raleway",Font.BOLD,18));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        tdob=new JDateChooser();
        tdob.setBounds(300, 240, 400, 30);
        tdob.setForeground(new Color(105,105,105));
        add(tdob);
        
        
        JLabel gender= new JLabel("Gender:");
        gender.setFont(new Font("raleway",Font.BOLD,18));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        
        
        female=new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
         female.setBackground(Color.white);
        add(female);
        
        ButtonGroup g= new ButtonGroup();
        g.add(male);
        g.add(female);
        
        JLabel email= new JLabel("E-mail:");
        email.setFont(new Font("raleway",Font.BOLD,18));
        email.setBounds(100,340,200,30);
        add(email);
        
        temail= new JTextField();
        temail.setFont(new Font("Raleway",Font.BOLD,14));
        temail.setBounds(300,340,400,30);
        add(temail);
        
        JLabel ms= new JLabel("Marital Status:");
        ms.setFont(new Font("raleway",Font.BOLD,18));
        ms.setBounds(100,390,200,30);
        add(ms);
        
        m=new JRadioButton("Married");
        m.setBounds(300, 390, 80, 30);
        m.setBackground(Color.white);
        add(m);
        
        
          um=new JRadioButton("Unmarried");
         um.setBounds(450, 390, 120, 30);
         um.setBackground(Color.white);
        add(um);
        
       o=new JRadioButton("Others");
         o.setBounds(600, 390, 120, 30);
         o.setBackground(Color.white);
        add(o);
        
        ButtonGroup gm= new ButtonGroup();
        gm.add(m);
        gm.add(um);
        gm.add(o);
        
        
        JLabel address= new JLabel("Address:");
        address.setFont(new Font("raleway",Font.BOLD,18));
        address.setBounds(100,440,200,30);
        add(address);
        
        taddress= new JTextField();
        taddress.setFont(new Font("Raleway",Font.BOLD,14));
        taddress.setBounds(300,440,400,30);
        add(taddress);
        
        
        
        JLabel city= new JLabel("City:");
        city.setFont(new Font("raleway",Font.BOLD,18));
        city.setBounds(100,490,200,30);
        add(city);
        
        tcity= new JTextField();
        tcity.setFont(new Font("Raleway",Font.BOLD,14));
        tcity.setBounds(300,490,400,30);
        add(tcity);
        
        
        JLabel state= new JLabel("State:");
        state.setFont(new Font("raleway",Font.BOLD,18));
        state.setBounds(100,540,200,30);
        add(state);
        
        tstate= new JTextField();
        tstate.setFont(new Font("Raleway",Font.BOLD,14));
        tstate.setBounds(300,540,400,30);
        add(tstate);
        
        
        JLabel pinc= new JLabel("Pin Code:");
        pinc.setFont(new Font("raleway",Font.BOLD,18));
        pinc.setBounds(100,590,200,30);
        add(pinc);
        
        tpincode= new JTextField();
        tpincode.setFont(new Font("Raleway",Font.BOLD,14));
        tpincode.setBounds(300,590,400,30);
        add(tpincode);
        
        
        
        next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
      
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String name=tname.getText();
        String fname=tfname.getText();
        String dob=((JTextField)tdob.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (male.isSelected()){
            gender="male";
        }else if(female.isSelected()){
            
        }
        String email=temail.getText();
        String married=null;
        if (m.isSelected()){
            married="married";
        }else if(um.isSelected()){
            married="unmarried";
        }else if (o.isSelected()){
            married="other";
        }
        
       String address=taddress.getText();
       String city=tcity.getText();
       String state=tstate.getText();
       String Pin=tpincode.getText();
       
       try{
           if (name.equals("")){
               JOptionPane.showMessageDialog(null,"name is required");
           }else{
               conn c =new conn();
               String Query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+married+"','"+address+"','"+city+"','"+state+"','"+Pin+"');";
               c.s.executeUpdate(Query);
               
               setVisible(false);
               new signup1(formno).setVisible(true);
           }
           
       }
       catch(Exception e){
           System.out.println(e);
       }
       
       
       
       
    }
    
    public static void main(String args[]){
        new signup();
    }

    
}
