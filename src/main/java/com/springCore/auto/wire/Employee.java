package com.springCore.auto.wire;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
        System.out.println("Calling the depedencies");
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
