package store;
import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public Store(String name) {
        this.name = name;
        this.customers = customers;
        this.products = products;
        this.orders = orders;
    }
    public String getName() {
        return this.name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public String getCustomerList() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < customers.size(); i++) {
            sb.append(i++).append(". ").append(customers.get(i).getName()).append("\n");
        }
        return sb.toString();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public String getProductList() {
        StringBuilder sbr = new StringBuilder();
        for(int i = 0; i < products.size(); i++) {
            sbr.append(i++).append(". ").append(products.get(i).getName()).append("\n");
        }
        return sbr.toString();
    }

    public int newOrder(int customerIndex) {
        Order order = new Order(customer);
        orders.add(order);
        return (orders.size() - 1);
    }
    public void addToOrder(int orderIndex, int productIndex, int quantity) {
        Order order = orders.get(orderIndex);
        Item item = new Item(productIndex, quantity);
        order.addItem(item);
    }
    public String getOrderList() {
        StringBuilder sber = new StringBuilder();
        for(int i = 0; i < orders.size(); i++) {
            sber.append(i++).append(". ").append(orders.get(i).getName()).append("\n");
        }
        return sber.toString();
    }

}
