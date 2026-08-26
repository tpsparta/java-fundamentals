package com.sparta.staticfinal;

public class Customer {

    private String name;
    private int id;
    private static int nextId = 1000;

    public Customer(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    @Override public String toString() {
        return name + " Id:" + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
