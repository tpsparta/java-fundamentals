package com.sparta.people;

public class Customer extends Person {

    private String deliveryAddress;

    public Customer(String deliveryAddress, String firstName, String lastName) {
        this.deliveryAddress = deliveryAddress;
        super(firstName, lastName);
    }
}
