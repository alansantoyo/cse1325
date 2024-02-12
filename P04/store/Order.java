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
    public void addItem(Item item) {
        items.add(item);    
    }
    public int getPrice() {
        int totalPrice;
        for(Item item : items) {
            totalPrice += item;
        }
    }
    @Override
    public String toString() {
    
    }
}
