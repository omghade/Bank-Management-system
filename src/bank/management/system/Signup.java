package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame
{
    JTextField textname,textFname;


    // Global var rand to generate the Random Digit as a forn number --->
    Random rand = new Random();
    long first4 = (rand.nextLong() % 90L) + 10L;
    String first  = " "+Math.abs(first4);


    // Constructor
    Signup ()
    {
        // Application Form Created --->
        super("APPLICATION FORM");
        // Bank ICON PNG ADD ----->
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(10,10,100,100);
        add(image1);

        // APPLICATION FORM LABEL
        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,34);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        // PAGE 01 LABEL
        JLabel label2 = new JLabel("Page 01");
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        label2.setBounds(330,70,600,30);
        add(label2);

        // Personal Details Label
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,30));
        label3.setBounds(265,100,600,30);
        add(label3);

        // Name Label
        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        // Name TextField --->
        textname = new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);


        // father''s Name Label
        JLabel labelFatherName = new JLabel("Father's Name : ");
        labelFatherName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFatherName.setBounds(100,235,200,30);
        add(labelFatherName);

        // Father's Name TextField --->
        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,235,400,30);
        add(textFname);






        getContentPane().setBackground(new Color(186, 166, 160));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    public static void main(String[] args)
    {
//        Signup signup =
        new Signup();
    }
}
