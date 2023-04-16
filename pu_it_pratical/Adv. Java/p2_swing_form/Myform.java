import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;



public class Myform extends JFrame
{
    public  Myform()
   {   
      
       
       setSize(800,800);
       setVisible(true);
       setLayout(null);
       
       JLabel n=new JLabel("Hemil Chovatiya Registration Form");
       n.setBounds(200,45,400,20);
       n.setFont(new Font("arial",Font.PLAIN,20));
       JLabel n1=new JLabel("Name");
       n1.setFont(new Font("arial",Font.PLAIN,15));
       n1.setBounds(20,105,110,20);       

       JTextField na=new JTextField(20);
       na.setBounds(140,105,200,20);
       
       JLabel n2=new JLabel("Enrollment No.");
       n2.setFont(new Font("arial",Font.PLAIN,15));
       n2.setBounds(20,140,110,20);       

       JTextField naa=new JTextField(20);
       naa.setBounds(140,140,200,20);

       JLabel g=new JLabel("Sem");
       g.setFont(new Font("arial",Font.PLAIN,15));
       g.setBounds(20,175,110,20);

       JComboBox c=new JComboBox<>();
       c.setModel(new DefaultComboBoxModel<>(new String[] { "Sem-3", "Sem-5", "Sem-7" }));
       c.setFont(new Font("arial",Font.PLAIN,15));
       c.setBounds(140,175,200,20);
       
      // c.add("3");
      // c.add("5");
      // c.add("7");

       JLabel n3=new JLabel("Gender");
       n3.setFont(new Font("arial",Font.PLAIN,15));
       n3.setBounds(20,210,110,20); 
       
       
     //  jCheckboxGroup cbg =new jCheckboxGroup();
           JRadioButton r1=new JRadioButton("Male",false);
           r1.setFont(new Font("arial",Font.PLAIN,15));
           
           
           ButtonGroup cbg=new ButtonGroup();
           r1.setBounds(140,210,70,20);
           JRadioButton r2=new JRadioButton("Female",false);
           r2.setFont(new Font("arial",Font.PLAIN,15));
           r2.setBounds(210,210,70,20);
           cbg.add(r1);
           cbg.add(r2);
    //   jCheckbox r1=new jCheckbox("Male",cbg,false);
    //   r1.setBounds(140,210,50,20);

    //   jCheckbox r2=new jCheckbox("female",cbg,false);
    //   r2.setBounds(200,210,70,20);

       JLabel n4=new JLabel("Subject");
       n4.setFont(new Font("arial",Font.PLAIN,15));
       n4.setBounds(20,245,110,20);

       JRadioButton x=new JRadioButton();
      
       JCheckBox c1=new JCheckBox("php");
       c1.setFont(new Font("arial",Font.PLAIN,15));
       c1.setBounds(140,245,60,20);
       
       JCheckBox c2=new JCheckBox("Android");
       c2.setFont(new Font("arial",Font.PLAIN,15));
       c2.setBounds(200,245,83,20);
       
       JCheckBox c3=new JCheckBox("C++");
       c3.setFont(new Font("arial",Font.PLAIN,15));
       c3.setBounds(280,245,60,20);

       JCheckBox c4=new JCheckBox("Swift");
       c4.setFont(new Font("arial",Font.PLAIN,15));
       c4.setBounds(340,245,70,20);

       JLabel n6=new JLabel("Password ");
       n6.setFont(new Font("arial",Font.PLAIN,15));
       n6.setBounds(20,280,110,20);
       
       JPasswordField pf=new JPasswordField("Enter Password");
       pf.setFont(new Font("arial",Font.PLAIN,15));
       pf.setBounds(140,280,200,20);
   
       JLabel n5=new JLabel("Suggestion ");
       n5.setFont(new Font("arial",Font.PLAIN,15));
       n5.setBounds(20,315,110,20);       

       JTextArea na1=new JTextArea();
       na1.setBounds(140,315,300,80);

       JButton b1=new JButton("Submit");
       b1.setFont(new Font("arial",Font.PLAIN,15));
       b1.setBounds(140,410,110,25);

       JButton b2=new JButton("Cancel");
       b2.setFont(new Font("arial",Font.PLAIN,15));
       b2.setBounds(260,410,110,25);
       
       add(pf);
       add(n6);
       add(b1);
       add(b2);
       add(n5);
       add(na1);
       add(r1);
       add(r2);
       add(g);
       add(n);
       add(naa);
       add(na);
       add(n1);
       add(n2);
       add(n3);
       add(n4);
       add(c);
       add(c1);
       add(c2);
       add(c3);
       add(c4);   
      }
      
      
      public static void main(String args[])
      {
         Myform mf=new Myform();  
      }
}
