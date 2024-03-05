package store;

// Copyright 2024 by Professor George F. Rice, modifications copyright 2024 by Alan Santoyo-Pina
// This program is free software: you can redistribute it and/or modify it under the terms 
// of the GNU General Public License as published by the Free Software Foundation, either 
// version 3 of the License, or (at your option) any later version.

public class Item {
    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public int getPrice() {
        return product.getPrice() * quantity;
    }
    @Override
    public String toString() {
        int price = getPrice();
        return String.format("%3d %-50s $ %5d.%02d", quantity, product, price/100, price%100);
    }
    private Product product;
    private int quantity;
}
