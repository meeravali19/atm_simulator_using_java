
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class signup1 extends JFrame implements ActionListener {
    
            JRadioButton yes,no,yes1,no1;
            JTextField tpan,taa;
            JButton next;
            JComboBox re,ca,jin,jqu,joc;
            String formno;
    public signup1(String formno){
        this.formno=formno;
        setTitle("New Account Application form page-2");
        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        //title
        JLabel title=new JLabel("Page 2:Additional Details");
        title.setFont(new Font("osward",Font.BOLD,38));
        title.setBounds(200,40,650,55);
        add(title);
        
        
        //details
        JLabel religion=new JLabel("Religion :");
        religion.setFont(new Font("Raleway",Font.BOLD,18));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String are[]={"Hindu","Muslim","sikh","Christian","Others"};
         re=new JComboBox(are);
        re.setBounds(250,140,400,30);
        re.setBackground(Color.WHITE);
        add(re);
        
        JLabel cat=new JLabel("Category :");
        cat.setFont(new Font("Raleway",Font.BOLD,18));
        cat.setBounds(100,190,100,30);
        add(cat);
        
        String acat[]={"General","OBC","SC","ST","Others"};
         ca=new JComboBox(acat);
        ca.setBounds(250,190,400,30);
        ca.setBackground(Color.WHITE);
        add(ca);
        
        JLabel inc=new JLabel("InCome :");
        inc.setFont(new Font("Raleway",Font.BOLD,18));
       inc.setBounds(100,240,100,30);
        add(inc);
        
        String ain[]={"NULL","< 1,50,00","<2,50,000","<3,50,000","<5,00,000","uptp 10,00,000"};
        jin=new JComboBox(ain);
        jin.setBounds(250,240,400,30);
        jin.setBackground(Color.WHITE);
        add(jin);
        
        JLabel eq=new JLabel("Educational");
        eq.setFont(new Font("Raleway",Font.BOLD,18));
       eq.setBounds(100,290,150,30);
        add(eq);
        
        
        
        
        JLabel qu=new JLabel("Qualification:");
        qu.setFont(new Font("Raleway",Font.BOLD,18));
       qu.setBounds(100,310,150,30);
        add(qu);
        
        String aqu[]={"Non-Graduation","Graduation","<Post-Graduation","PHD","Others"};
         jqu=new JComboBox(aqu);
        jqu.setBounds(250,300,400,30);
        jqu.setBackground(Color.WHITE);
        add(jqu);
        
        JLabel oc=new JLabel("Occupation:");
        oc.setFont(new Font("Raleway",Font.BOLD,18));
       oc.setBounds(100,360,150,30);
        add(oc);
        
        String aoc[]={"Salaried","Self-Employed","Bussiness","Student","Retired"};
         joc=new JComboBox(aoc);
        joc.setBounds(250,360,400,30);
        joc.setBackground(Color.WHITE);
        add(joc);
        
        JLabel pan=new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,18));
       pan.setBounds(100,410,150,30);
        add(pan);
        
         tpan=new JTextField();
        tpan.setFont(new Font("Raleway",Font.BOLD,14));
        tpan.setBounds(250,410,400,30);
        add(tpan);
        
        JLabel aa=new JLabel("Aadhar Number:");
        aa.setFont(new Font("Raleway",Font.BOLD,18));
       aa.setBounds(100,460,150,30);
        add(aa);
        
        taa=new JTextField();
        taa.setFont(new Font("Raleway",Font.BOLD,14));
        taa.setBounds(250,460,400,30);
        add(taa);
        
        JLabel sc=new JLabel("Senior Citizen:");
        sc.setFont(new Font("Raleway",Font.BOLD,18));
       sc.setBounds(100,510,150,30);
        add(sc);
        
        yes1=new JRadioButton("Yes");
        yes1.setFont(new Font("Raleway",Font.BOLD,18));
       yes1.setBounds(400,510,150,30);
       yes1.setBackground(Color.white);
        add(yes1);
        
         no1=new JRadioButton("No");
        no1.setFont(new Font("Raleway",Font.BOLD,18));
       no1.setBounds(600,510,150,30);
       no1.setBackground(Color.white);
        add(no1);
        
        ButtonGroup gsc= new ButtonGroup();
        gsc.add(yes1);
        gsc.add(no1);
        
        JLabel ex=new JLabel("Existing user:");
        ex.setFont(new Font("Raleway",Font.BOLD,18));
       ex.setBounds(100,560,150,30);
        add(ex);
        
        yes=new JRadioButton("Yes");
        yes.setFont(new Font("Raleway",Font.BOLD,18));
       yes.setBounds(400,560,150,30);
       yes.setBackground(Color.white);
        add(yes);
        
         no=new JRadioButton("No");
        no.setFont(new Font("Raleway",Font.BOLD,18));
       no.setBounds(600,560,150,30);
       no.setBackground(Color.white);
        add(no);
        
        ButtonGroup gex= new ButtonGroup();
        gex.add(yes);
        gex.add(no);
        
        
        next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
      setLayout(null);
      getContentPane().setBackground(Color.WHITE);
    setSize(800,800);
    setVisible(true);
    setLocation(350, 10);
    
}
    public void actionPerformed(ActionEvent ae){
        String sreligion=(String)re.getSelectedItem();
        String scategory=(String)ca.getSelectedItem();
        String sincome=(String)jin.getSelectedItem();
        String seducation=(String)jqu.getSelectedItem();
        String soccupation=(String)joc.getSelectedItem();
        String senior=null;
        if (yes1.isSelected()){
            senior="Yes";
        }else if(no1.isSelected()){
            senior="NO";
        }
        String exist=null;
        if(yes.isSelected()){
            exist="Yes";
           
        }else if(no.isSelected()){
            exist="No";
        }
        String pan=tpan.getText();
        String aadhar=taa.getText();
        
        try{
            if (sreligion.equals("")){
               JOptionPane.showMessageDialog(null,"name is required");
           }else{
               conn c =new conn();
               String Query="insert into signup1 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+senior+"','"+exist+"');";
               c.s.executeUpdate(Query);
               
               setVisible(false);
               new signup2(formno).setVisible(true);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    public static void main(String args[]){
        
        new signup1("");
    }
    
}
