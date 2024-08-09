package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener
{
    // jlabel for text
    JLabel label1,label2,label3;
    // for text
    JTextField textField2;
    // for password
    JPasswordField passwordField3;
    // to add Buttons
    JButton button1,button2,button3;

    Login()
    {
        super("Bank Management System");

        // Bank ICON PNG ADD ----->
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(350,10,100,100);
        add(image1);

        // ATM CARD PNG ADD ----->
        ImageIcon icn1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image icn2 = icn1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon icn3 = new ImageIcon(icn2);
        JLabel image2 = new JLabel(icn3);
        image2.setBounds(650,370,100,100);
        add(image2);


        // WELCOME : Label for the application
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        // Card no label --->
        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        // card no textfield :
        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        // PIN LABEL
        label3 = new JLabel("PIN : ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        //Password Field
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        // Sign IN - Button created
        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(325,300,100,30);
        button1.addActionListener(this);
        add(button1);


        // Clear Button ---->
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(455,300,100,30);
        button2.addActionListener(this);
        add(button2);


        //Sign UP Button --->
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(325,350,230,30);
        button3.addActionListener(this);
        add(button3);



        // BG PNG ADD ----->
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
        Image icon2 = icon1.getImage().getScaledInstance(850,500,Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel image3 = new JLabel(icon3);
        image3.setBounds(0,0,850,480);
        add(image3);



        // programme window created
        setLayout(null);
        setSize(850,500);
        setLocation(450,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if(e.getSource()==button1)
            {

            }
            else if(e.getSource()==button2)
            {
                textField2.setText("");
                passwordField3.setText("");
            }
            else if(e.getSource()==button3)
            {

            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Login();

    }
}
