package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Signup02 extends JFrame implements ActionListener
{
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    JTextField textPAN,textAad;

    JRadioButton r1,r2,e1,e2;

    JButton next;

    String formno;

    Signup02(String formno)
    {
        super("APPLICATO FORM");

        // Bank ICON PNG ADD ----->
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(150,10,100,100);
        add(image1);


        // Page 2 Top Label
        JLabel l1 = new JLabel("Page 2 ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(390,20,600,40);
        add(l1);

        // Additional Details :
        JLabel l2 = new JLabel("Additional Details : ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(330,60,600,40);
        add(l2);

        // Religion label
        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,600,40);
        add(l3);

        // Reliigion Dropdown Menu
        String religion[] = {"Hindu","Muslim","Sikh","Christain","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(204, 159, 108));
        comboBox.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox.setBounds(350,140,320,25);
        add(comboBox);

        //category label
        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,190,200,30);
        add(l4);

        // category Dropdown menu
        String category [] = {"General","OBC","ST","SC","Other"};
        comboBox2 = new JComboBox(category);
        comboBox.setBackground(new Color(204, 159, 108));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox2.setBounds(350,190,320,25);
        add(comboBox2);

        //income label
        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,240,200,30);
        add(l5);

        // Income Dropdown menu
        String income [] = {"Null","Up to 1,00,000","Up to 2,50,000","Up to 5,00,000","Up to 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox.setBackground(new Color(204, 159, 108));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox3.setBounds(350,240,320,25);
        add(comboBox3);

        //Qualification label
        JLabel l6 = new JLabel("Education : ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,290,200,30);
        add(l6);

        // qualification Dropdown menu
        String qualification [] = {"Graduate","Post-Graduate","P.H.D","Other","None"};
        comboBox4 = new JComboBox(qualification);
        comboBox.setBackground(new Color(204, 159, 108));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox4.setBounds(350,290,320,25);
        add(comboBox4);

        //Ocupation label
        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,200,30);
        add(l7);

        // Ocupation Dropdown menu
        String occupation [] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox.setBackground(new Color(204, 159, 108));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox5.setBounds(350,340,320,25);
        add(comboBox5);


        //PAN label
        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,200,30);
        add(l8);
        // Pan Text Field
        textPAN = new JTextField();
        textPAN.setFont(new Font("Raleway",Font.BOLD,16));
        textPAN.setBounds(350,390,320,25);
        add(textPAN);

        //Aadhar label
        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,200,30);
        add(l9);
        // aadhar Text Field
        textAad = new JTextField();
        textAad.setFont(new Font("Raleway",Font.BOLD,16));
        textAad.setBounds(350,440,320,25);
        add(textAad);

        // senior citizen label
        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);
//        sennior citizen radio button
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(204, 159, 108));
        r1.setBounds(350,490,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(204, 159, 108));
        r2.setBounds(460,490,100,30);
        add(r2);


        // Existing Account
        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,540,200,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(204, 159, 108));
        e1.setBounds(350,540,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(204, 159, 108));
        e2.setBounds(460,540,100,30);
        add(e2);


        // Form No :

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);




        this.formno = formno;

        // Signup page 2 layout set ----->
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(204, 159, 108));

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // String Names
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPAN.getText();
        String addhar = textAad.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }

        try {
            if (textPAN.getText().equals("") || textAad.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Con c = new Con();
                String q = "INSERT INTO signuptwo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = c.connection.prepareStatement(q);
                pstmt.setString(1, formno);
                pstmt.setString(2, rel);
                pstmt.setString(3, cate);
                pstmt.setString(4, inc);
                pstmt.setString(5, edu);
                pstmt.setString(6, occ);
                pstmt.setString(7, pan);
                pstmt.setString(8, addhar);
                pstmt.setString(9, scitizen);
                pstmt.setString(10, eAccount);
                pstmt.executeUpdate();
                new Signup03(formno);
                setVisible(false);
            }
        } catch (SQLException sqlEx) {
            JOptionPane.showMessageDialog(null, "Database error: " + sqlEx.getMessage());
            sqlEx.printStackTrace();
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage());
            E.printStackTrace();
        }
    }


    public static void main(String[] args)
    {
        new Signup02("");
    }
}
