package com.jrg.AbstractClassChallenge;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Store {
    private static ArrayList<ProductForSale> inventory = new ArrayList<>();

    public static void main(String[] args) {
        inventory.add(new Shirt("Abercrombie", 25.99, "Comfortable shirt with a collar."));
        inventory.add(new Shirt("American Eagle", 30.99, "High quality common t-shirt"));
        inventory.add(new Shoes("Nike", 45.99, "Sports shoes ideal for Basketball"));
        inventory.add(new Shoes("Adidas", 55.99, "Sports shoes ideal for Football"));

        listProducts();

        ArrayList<OrderItem> order = new ArrayList<>();

        addItemToOrder(order, 0, 3);
        addItemToOrder(order, 2, 4);
        addItemToOrder(order, 3, 2);
        addItemToOrder(order, 1, 1);

        printOrder(order);
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int inventoryItem, int quantity){
        order.add(new OrderItem(quantity, inventory.get(inventoryItem)));
    }

    public static void listProducts(){
        for(ProductForSale product : inventory){
            product.showDetails();
        }
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double total = 0;
        for(OrderItem item : order){
            item.getProduct().printPricedItem(item.getQuantity());
            total += item.getProduct().getSalesPrice(item.getQuantity());
        }

        System.out.printf("The total for this order is $%.2f%n", total);
    }
}