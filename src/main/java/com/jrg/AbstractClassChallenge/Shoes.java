package com.jrg.AbstractClassChallenge;

public class Shoes extends ProductForSale{
    public Shoes(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        String details = "This " + type + " shoes are " + description + " and costs $" + price;
        System.out.println(details);
    }
}
