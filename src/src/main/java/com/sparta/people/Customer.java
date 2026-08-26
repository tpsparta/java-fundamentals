package com.sparta.people;

public class Customer extends Person {

    private String deliveryAddress;

    public Customer(String deliveryAddress, String firstName, String lastName) {
        super(firstName, lastName);
        this.deliveryAddress = deliveryAddress;
    }
}
