package store;
import java.util.ArrayList;

public class Order {
    private static int nextOrderkNumber = 1;
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
        int totalPrice = 0;
        for(Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Order #").append(orderNumber).append(" for ")
            .append(customer.toString()).append("\n");

        int ordrTot = 0;
        int num = items.size();
        for(int i = num; i > 0; i--) {
            Item item = items.get(num-i);
            receipt.append(i).append(" ").append(item.toString())
                .append("\n");
            ordrTot += item.getPrice();
        }
        receipt.append("Order total $ ").append(ordrTot/100).append(".").append(ordrTot%100);
        return receipt.toString();
    }
}
