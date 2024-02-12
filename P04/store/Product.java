package store;

public class Product {
    private static int nextStockNumber = 0;
    private int stockNumber;
    private String name;
    private int price;

    public Product(String name, int price) {
        if(price < 0) {
            throw new IllegalArgumentException("Invalid price of " + name + ": " + price);
        }
        else {
            this.stockNumber = nextStockNumber++;
            this.name = name;
            this.price = price;
        }
    }
    public int getStockNumber() {
        return this.stockNumber;
    }
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        int dollars = this.price/100;
        int cents = this.price%100;
        
        return String.format("%-30s $%5d.%02d", this.name, dollars, cents);
    }    
}
