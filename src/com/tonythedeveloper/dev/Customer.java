package com.tonythedeveloper.dev;
import javax.swing.*;
import java.awt.*;

public class Customer {
    public static int customerID;
    public static String customerAccountType;
    public static String customerName;
    public static String customerLastName;
    public static String customerEmail;
    public static String customerPhoneNumber;
    public static String customerAddress;
    public static String customerZipCode;
    public static int customerAge;
    public static int customerSSN;

    public Customer(int ID, String Type, String Name, String LastName, String Email, String PhoneNumber, String Address, String ZipCode, int Age, int SSN) {
        customerID = ID;
        customerAccountType = Type;
        customerName = Name;
        customerLastName = LastName;
        customerEmail = Email;
        customerPhoneNumber = PhoneNumber;
        customerAddress = Address;
        customerZipCode = ZipCode;
        customerAge = Age;
        customerSSN = SSN;
    }

    public String getName() {
        return customerAccountType;
    }

    public void printCustomerDetails() {
        System.out.println("Here are all of the customer's.");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Account Type:" + customerAccountType);
        System.out.println("Customer Name:" + customerName);
        System.out.println("Customer Last Name:" + customerLastName);
        System.out.println("Customer Email Address:" + customerEmail);
        System.out.println("Customer Phone Number:" + customerPhoneNumber);
        System.out.println("Customer Address:" + customerAddress);
        System.out.println("Customer Zip Code:" + customerZipCode);
        System.out.println("Customer Age:" + customerAge);
        System.out.println("Customer SSN:" + customerSSN);

//        Gui Pop Up Info Dialogs
        JFrame frame = new JFrame("Customer " + Customer.customerID);
        JPanel customer = new JPanel();
        customer.setLayout(new FlowLayout());
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Customer ID:" + Customer.customerID);
        l1.addElement("Customer Type:" + Customer.customerAccountType);
        l1.addElement("Customer Name:" + Customer.customerName);
        l1.addElement("Customer Last Name:" + Customer.customerLastName);
        l1.addElement("Customer Email Address:" + Customer.customerEmail);
        l1.addElement("Customer Phone Number:" + Customer.customerPhoneNumber);
        l1.addElement("Customer Address:" + customerAddress);
        l1.addElement("Customer Zip Code:" + customerZipCode);
        l1.addElement("Customer Age:" + customerAge);
        l1.addElement("Customer SSN:" + customerSSN);
        JList<String> list = new JList<>(l1);
        list.setBackground(Color.WHITE);
        list.setBounds(40, 10, 250, 140);
        frame.add(list);
        frame.setSize(400, 400);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(customer);
        frame.setSize(330, 230);
        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

//    public void printCustomerInfo() {
//        JFrame frame = new JFrame("Bank Of Tony");
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//        JButton button = new JButton();
//        button.setText("Customer 1");
//        panel.add(button);
//        JButton button1 = new JButton();
//        button1.setText("Customer 2");
//        panel.add(button1);
//        ActionListener Customer2ButtonListener = new Customer2ButtonListener();
//        button1.addActionListener(Customer2ButtonListener);
//        ActionListener Customer1ButtonListener = new Customer1ButtonListener();
//        button.addActionListener(Customer1ButtonListener);
//        frame.add(panel);
//        frame.setSize(720, 320);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//
//    }
}





