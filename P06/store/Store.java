package store;

// Copyright 2024 by Professor George F. Rice, modifications copyright 2024 by Alan Santoyo-Pina
// This program is free software: you can redistribute it and/or modify it under the terms 
// of the GNU General Public License as published by the Free Software Foundation, either 
// version 3 of the License, or (at your option) any later version.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
    public Store(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.products  = new ArrayList<>();
        this.orders    = new ArrayList<>();
    }
    public Store(BufferedReader br) throws IOException {
        customers = new ArrayList<>();
        int numCustomers = Integer.parseInt(br.readLine());
        for(int i = 0; i < numCustomers; i++) {
            Customer customer = new Customer(br);
            customers.add(customer);
        }
/*        
        orders = new ArrayList<>();
        int numOrders = Integer.parseInt(br.readLine());
        for(int i = 0; i < numOrders; i++) {
            Order order = new Order(br);
            orders.add(order);
        }
*/
    }
    public void save(BufferedWriter bw) throws IOException {
        bw.write(  name + "\n");
        bw.write(  customers.size() + "\n");
        

        for(Customer customer : customers) {
            customer.save(bw);
        }
    }
    public String getName() {
        return name;
    }
    // Customers
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    /*
    public int getNumberOfCustomers() {
        return customers.size();
    }
    public String getCustomerString(int index) {
        return customers.get(index).toString();
    }
    */
    public String getCustomerList() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<customers.size(); ++i) 
            sb.append(String.format("%3d] %s\n", i, customers.get(i)));
        return sb.toString();
    }
    
    // Products
    public void addProduct(Product product) {
        products.add(product);
    }
    /*
    public int getNumberOfProducts() {
        return products.size();
    }
    public String getProductString(int index) {
        return products.get(index).toString();
    }
    */
    public String getProductList() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<products.size(); ++i) 
            sb.append(String.format("%3d] %s\n", i, products.get(i)));
        return sb.toString();
    }
    
    // Orders
    public int newOrder(int customer) {
        orders.add(new Order(customers.get(customer)));
        return orders.size() - 1;
    }
    public void addToOrder(int order, int product, int quantity) {
        orders.get(order).addItem(new Item(products.get(product), quantity));
    }
    /*
    public int getNumberOfOrders() {
        return orders.size();
    }
    public String getOrderString(int index) {
        return orders.get(index).toString();
    }
    */
    public String getOrderList() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<orders.size(); ++i) 
            sb.append(String.format("\n%s\n", orders.get(i)));
        return sb.toString();
    }
   
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
}
