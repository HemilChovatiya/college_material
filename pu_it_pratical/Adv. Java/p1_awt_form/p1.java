import java.awt.*;





class MyForm extends Frame
{
   MyForm()
   {   
       Frame fm=new Frame();
       setSize(800,800);
       setVisible(true);
       setLayout(null);

       Label n=new Label("Hemil Chovatiya");
       n.setBounds(200,45,200,30);
       
       Label n1=new Label("Name");
       n1.setBounds(20,105,110,20);       

       TextField na=new TextField(20);
       na.setBounds(140,105,200,20);
       
       Label n2=new Label("Enrollment No.");
       n2.setBounds(20,140,110,20);       

       TextField naa=new TextField(20);
       naa.setBounds(140,140,200,20);

       Label g=new Label("Sem");
       g.setBounds(20,175,110,20);

       Choice c=new Choice();
       c.setBounds(140,175,200,20);
       c.add("3");
       c.add("5");
       c.add("7");

       Label n3=new Label("Gender");
       n3.setBounds(20,210,110,20); 
       
       CheckboxGroup cbg =new CheckboxGroup();

       Checkbox r1=new Checkbox("Male",cbg,false);
       r1.setBounds(140,210,50,20);

       Checkbox r2=new Checkbox("female",cbg,false);
       r2.setBounds(200,210,70,20);

       Label n4=new Label("Subject");
       n4.setBounds(20,245,110,20);
       
       Checkbox c1=new Checkbox("php");
       c1.setBounds(140,245,50,20);
       
       Checkbox c2=new Checkbox("Android");
       c2.setBounds(200,245,70,20);
       
       Checkbox c3=new Checkbox("C++");
       c3.setBounds(280,245,50,20);

       Checkbox c4=new Checkbox("Swift");
       c4.setBounds(340,245,50,20);
   
       Label n5=new Label("Suggestion ");
       n5.setBounds(20,280,110,20);       

       TextArea na1=new TextArea();
       na1.setBounds(140,277,300,80);

       Button b1=new Button("Submit");
       b1.setBounds(140,380,110,25);

       Button b2=new Button("cancel");
       b2.setBounds(260,380,110,25);
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
         MyForm mf=new MyForm();  
      }
}
