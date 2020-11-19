package com.tonythedeveloper.dev;

class CustomerList {
    public static void main(String[] args) {
        Customer Tony = new Customer(1, "Basic", "Tony", "A", "tony@tonythedeveloper.com", "555-555-5555", "1 Tony Drive", "00001", 55, 5454544);
        Tony.printCustomerDetails();

        Customer Bob = new Customer(2, "Premium", "Tony", "A", "tony@tonythedeveloper.com", "555-555-5555", "1 Tony Drive", "00001", 55, 254545545);
        Bob.printCustomerDetails();

        Customer Tony1 = new Customer(3, "Platinum", "Tony", "A", "tony@tonythedeveloper.com", "555-555-5555", "1 Tony Drive", "00001", 55, 1587521458);
        Tony1.printCustomerDetails();

    }
}