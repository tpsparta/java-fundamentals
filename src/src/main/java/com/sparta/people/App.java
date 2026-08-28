package com.sparta.people;

public class App {

    public  static void main(String[] args) {

        Customer c1 = new Customer("Nish", "Mandal");
        Customer c2 = new Customer("Nish", "Mandal");
        Customer c3 = new Customer("Nish", "Mandal");
        
        
        // testing the equals() contract:
        
        // reflexive - should return true
        System.out.println(c1.equals(c1));
        
        // symmetric - both should return true
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        
        // transitive - both should return true
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c3));
	
    }
}
