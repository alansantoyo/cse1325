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
            int nextNum = 0;
            this.name = name;
            this.price = price;
        }
    }
    public int getstockNumber() {

    }
    public int getPrice() {

    }

    @Override
    public String toString() {

    }    
}
