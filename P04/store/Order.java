package store;
import java.util.ArrayList;

public class Order {
    private static int nextOrderkNumber = 0;
    private int orderNumber;
    private ArrayList<Item> items;
    private Customer customer;
    
    public Order(Customer customer) {
        this.customer = customer;
        this.orderNumber = nextOrderkNumber++;
        this.items = new ArrayList<>();
    }
    public addItem(Item item) {
    
    }
    public int getPrice() {
    
    }
    @Override
    public String toString() {
    
    }
}
