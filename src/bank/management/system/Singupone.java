package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class Singupone  extends JFrame {
    Singupone(){
        setLayout(null);
        Random rand = new Random();
        long random = Math.abs((rand.nextLong() % 9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        JTextField nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nametextfield.setBounds(300,140,400,30);
        add(nametextfield);

        JLabel fname = new JLabel("father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Raleway", Font.BOLD,14));
        fnametextfield.setBounds(300,190,400,30);
        add(fnametextfield);

        JLabel DOB = new JLabel("Date of birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,240,200,30);
        add(DOB);
        JDateChooser  dob = new JDateChooser();
        dob.setBounds(300,240,400,30);
        dob.setForeground(new Color(105,105,105));
        add(dob);



        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,100,30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,90,30);
        add(male);
        JRadioButton Female = new JRadioButton("Female");
        Female.setBounds(450,290,120,30);
        add(Female);

        ButtonGroup btngrp = new ButtonGroup();
        btngrp.add(male);
        btngrp.add(Female);

        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,100,30);
        add(email);

        JTextField emailtext = new JTextField();
        emailtext.setFont(new Font("Raleway",Font.BOLD,14));
        emailtext.setBounds(300,340,400,30);
        add(emailtext);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        add(unmarried);

        JRadioButton Other = new JRadioButton("Other");
        Other.setBounds(630,390,100,30);
        add(Other);

         ButtonGroup maritalgroup = new ButtonGroup();
         maritalgroup.add(married);
         maritalgroup.add(unmarried);
         maritalgroup.add(Other);

        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD,20));
        Address.setBounds(100,440,100,30);
        add(Address);

        JTextField addresstext = new JTextField();
        addresstext.setFont(new Font("Raleway",Font.BOLD,14));
        addresstext.setBounds(300,440,400,30);
        add(addresstext);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,100,30);
        add(city);

        JTextField citytext = new JTextField();
        citytext.setFont(new Font("Raleway",Font.BOLD,14));
        citytext.setBounds(300,490,400,30);
        add(citytext);




        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,100,30);
        add(state);
        JTextField statetext = new JTextField();
        statetext.setFont(new Font("Raleway",Font.BOLD,14));
        statetext.setBounds(300,540,400,30);
        add(statetext);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,100,30);
        add(pincode);
        JTextField pincodetext = new JTextField();
        pincodetext.setFont(new Font("Raleway",Font.BOLD,14));
        pincodetext.setBounds(300,590,400,30);
        add(pincodetext);

        JButton next = new JButton("Next");
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);



        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args) {
    new Singupone();
    }
}
