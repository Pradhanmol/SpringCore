package com.springCore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee2 {
    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee2(Address address) {
        this.address = address;
        System.out.println("Calling the depedencies");
    }

    public Employee2() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
