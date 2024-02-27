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
        for(
    }

    public int newOrder(int customerIndex) {

    }
    public void addToOrder(int orderIndex, int productIndex, int quantity) {

    }
    public String getOrderList() {

    }

}
