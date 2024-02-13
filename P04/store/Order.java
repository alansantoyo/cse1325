package store;
import java.util.ArrayList;

/**
 * Models the customers' order.
 *
 * @author            Alan Santoyo-Pina
 * @version           1.0
 * @since             1.0
 * @license.agreement Gnu General Public License 3.0
 */

public class Order {
    private static int nextOrderkNumber = 1;
    private int orderNumber;
    private ArrayList<Item> items;
    private Customer customer;
   /**
     * Constructs a new order.
     *
     * @param customer the customer's name and email address
     * @since          1.0
     */ 
    public Order(Customer customer) {
        this.customer = customer;
        this.orderNumber = nextOrderkNumber++;
        this.items = new ArrayList<>();
    }
   /**
     * Adds an item to the items ArrayList.
     * 
     * @param the Item Arraylist
     * @since 1.0
     */
    public void addItem(Item item) {
        items.add(item);    
    }
   /**
     * Gets the price of the items in the order.
     *
     * @returns the total price.
     * @since   1.0
     */
    public int getPrice() {
        int totalPrice = 0;
        for(Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
   /**
     * Prints out the order similar to a receipt
     *
     * @returns the order in a formatted String with all the information given to it
     * @since   1.0
     */
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
