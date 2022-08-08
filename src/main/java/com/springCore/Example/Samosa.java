package com.springCore.Example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean, DisposableBean {
    private String Price;

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Samosa() {
        super();
        System.out.println("Setting the value of property");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "Price='" + Price + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        //init
        System.out.println("Rejecting the pepsi after bad taste");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //destroy
        System.out.println("Taking Pepsi with right price");
    }
}
