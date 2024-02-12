package store;

public class Order {
    private static int nextOrderkNumber = 0;
    private int orderNumber;
    private Item[] items;
    private Customer customer;
    
    public Order(Customer customer) {
        this.orderNumber = nextOrderkNumber++;
    }
    public addItem(Item item) {
    
    }
    public int getPrice() {
    
    }
    @Override
    public String toString() {
    
    }
}
