package com.sparta.people;

public class Customer extends Person {

    //private String deliveryAddress;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        //this.deliveryAddress = deliveryAddress;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }

        if (this.toString().equals(anObject.toString())) {
             {
            return true;
             }
        }
        return false;

    }

    // private boolean equalsStrings(String str) {

    //     if (this.getFirstName().equals(anObject.getFirstName()) && this.getLastName().equals(anObject.getLastName())) {
    //         return true;
    //     }
    //     return false;

    // }

    @Override
    public void delete() {

    }
}
