import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class App extends JFrame implements ActionListener {
    JTextField jt1, jt2, jt3, jt4;
    App() {
        setSize(500, 600);
        setVisible(true);
        setLayout(null);
        JLabel l1, l2, l4;
        JButton jb1;
        jb1 = new JButton("Insert Value");
        jb1.setBounds(100, 150, 100, 40);

        jb1.addActionListener(this);
        add(jb1);

        l1 = new JLabel("Username   :");
        l2 = new JLabel("Password    :");
        jt1 = new JTextField();
        jt2 = new JTextField();
        l1.setBounds(50, 50, 200, 40);
        l2.setBounds(50, 100, 200, 40);
        add(l1);
        add(l2);
        jt1.setBounds(150, 50, 250, 40);
        jt2.setBounds(150, 100, 250, 40);
        add(jt1);
        add(jt2);

    }

    public void actionPerformed(ActionEvent e) {
        String user1=jt1.getText();
        String pass1 = jt2.getText();
        String user = "root";
        String pass = "mysql";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/hemil", user, pass);
            String a = "insert into login1 values(?,?)";
            PreparedStatement ps = con.prepareStatement(a);
            ps.setString(1, user1);
            ps.setString(2, pass1);
            int rs=ps.executeUpdate();
            if(rs==1)
            {
            JOptionPane.showMessageDialog(this, "Hi,"+user1+","+pass1+"  your data inserted successfully");
            System.out.println("Hemil ");
            }
            else{
                JOptionPane.showMessageDialog(this, "Hi,your data not inserted successfully");
            }
            con.close();
        } catch (Exception c) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}