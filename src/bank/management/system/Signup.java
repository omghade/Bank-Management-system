package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame
{
    JTextField textname,textFname,textEmail,textMS;

    JDateChooser dateChooser;

    JRadioButton r1,r2,r3;


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
        labelFatherName.setBounds(100,240,200,30);
        add(labelFatherName);

        // Father's Name TextField --->
        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        // DOB Label --->
        JLabel DOB = new JLabel("Date Of Birth : ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        // added date chooser from external JAR file --->
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        // Gender Label --->
        JLabel labelGender = new JLabel("Gender : ");
        labelGender.setFont(new Font("Raleway",Font.BOLD,20));
        labelGender.setBounds(100,340,200,30);
        add(labelGender);

        // Male Button created
        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(186, 166, 160));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,340,90,30);
        add(r1);

        // Female Button Created
        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(186, 166, 160));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(440,340,90,30);
        add(r2);

        // Non-Binary Button Created
        r3 = new JRadioButton("Non-Binary");
        r3.setBackground(new Color(186, 166, 160));
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(580,340,120,30);
        add(r3);


        //Button Group--->
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        // Email Label --->
        JLabel labelEmail = new JLabel("Email ID : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);


        // Email TextField --->
        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        // Marital Status Label --->
        JLabel labelMS = new JLabel("Marital Status : ");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);


        // Marital Status TextField --->
        textMS = new JTextField();
        textMS.setFont(new Font("Raleway",Font.BOLD,14));
        textMS.setBounds(300,440,400,30);
        add(textMS);







        // created signup page
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
