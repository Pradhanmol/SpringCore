package com.springCore.Example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pepsi {
    //implement bean lifecycle using annotations @PostConstruct @PreDestroy
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Pepsi() {
        System.out.println("Setting the value of property ");
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price='" + price + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("intializing the bean");
    }
    @PreDestroy
    public void end(){
        System.out.println("Destroying the bean");
    }
}
