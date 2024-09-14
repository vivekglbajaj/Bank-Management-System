package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo  extends JFrame implements ActionListener {

    JTextField nametextfield,fnametextfield,emailtext,addresstext,citytext,statetext,pincodetext;

    JButton next;
    JRadioButton male ,Female, Other,married, unmarried;

    JRadioButton syes, sno,eyes,eno;
    JComboBox religion, category, occupation, income,education;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("Application Page- 2 ");

        JLabel additionDetails = new JLabel("Page 2: Addtional Details");
        additionDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionDetails.setBounds(290,80,400,30);
        add(additionDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valreligion[] ={"Hindu","Muslim","Sikh","Other"};
        religion = new JComboBox(valreligion);
        religion.setBounds(300,140,400,30);
        add(religion);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valcategory[] = {"General","OBC","SC","ST","Other"};
         category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        add(category);

        JLabel incmo = new JLabel("Income:");
        incmo.setFont(new Font("Raleway",Font.BOLD,20));
        incmo.setBounds(100,240,100,30);
        add(incmo);

        String valIncome[] = {"<1,50,000","< 2,00,000","< 5,00,000","Upto 10,00,000"};
         income = new JComboBox<>(valIncome);
        income.setBounds(300,240,400,30);
        add(income);

        JLabel gender = new JLabel("Education &");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,15);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String valeducation[] = {"Non Graduate","Graduate","Post Graduate","Doctrate"};
         education = new JComboBox<>(valeducation);
        education.setBounds(300,315,400,30);
        add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String accupationvalue[] = {"Salaried","Self Employed","Bussiness","Student","Other"};
        occupation = new JComboBox<>(accupationvalue);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        addresstext = new JTextField();
        addresstext.setFont(new Font("Raleway",Font.BOLD,14));
        addresstext.setBounds(300,390,400,30);
        add(addresstext);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        addresstext = new JTextField();
        addresstext.setFont(new Font("Raleway",Font.BOLD,14));
        addresstext.setBounds(300,440,400,30);
        add(addresstext);

        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        citytext = new JTextField();
        citytext.setFont(new Font("Raleway",Font.BOLD,14));
        citytext.setBounds(300,490,400,30);
        add(citytext);




        JLabel state = new JLabel("Senier Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);


        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        add(sno);



        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);


        JLabel pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);


        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        add(eno);



        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
       emaritalgroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    public  void actionPerformed(ActionEvent ae){

        String sreligion = (String)  religion.getSelectedItem();
        String scotagory = (String)  category.getSelectedItem();
        String sincome = (String)  income.getSelectedItem();
        String seducation = (String)  education.getSelectedItem();
        String soccupation = (String)  occupation.getSelectedItem();



        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(Female.isSelected()){
            seniorcitizen = "No";
        }

        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount = "Yes";

        }
        else if(unmarried.isSelected()){
            exisitingaccount = "No";
        }

        String span = addresstext.getText();
        String sadhar = citytext.getText();


//        try {
//            if(name.equals(" ")){
//                JOptionPane.showMessageDialog(null,"Name is requere");
//            }
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
        try{
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null," Name is require");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scotagory+"','"+sincome+"','"+seducation+"', '"+soccupation+"','"+span+"','"+sadhar+"','"+exisitingaccount+"','"+seniorcitizen+"')";
                c.s.executeUpdate(query);
            }
        }catch (Exception e){
            System.out.println(e);
        }
//        try{
//            if(email.equals("")){
//                JOptionPane.showMessageDialog(null,"Email id is required");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }



    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
