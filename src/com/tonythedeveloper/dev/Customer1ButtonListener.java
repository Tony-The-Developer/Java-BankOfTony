package com.tonythedeveloper.dev;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Customer1ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Customer 1");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Customer ID:"+ Customer.customerID);
        l1.addElement("Customer Type:"+ Customer.customerAccountType);
        JList<String> list = new JList<>(l1);
        list.setBounds(40,10, 250,140);
        frame.add(list);
        frame.setSize(400,400);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(panel);
        frame.setSize(330, 200);
        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
