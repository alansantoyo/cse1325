public class Product {
    private int nextStockNumber;
    private int stockNumber;
    private String name;
    private int price;

    public Product(String name, int price) {
        if(price < 0) {
            throw new IllegalArgumentException("Invalid price of " + name + ": " + price);
        }
        else {
            this.nextStockNumber = nextStockNumber;
            this.nextStockNumber = this.stockNumber+1;
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
        return this.name + "
    }    
}
