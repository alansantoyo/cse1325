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

    public void addCustomer(Customer customers) {

    }
    public String getCustomerList() {

    }

    public void addProduct(Product products) {

    }
    public String getProductList() {

    }

    public int newOrder(int customerIndex) {

    }
    public void addToOrder(int orderIndex, int productIndex, int quantity) {

    }
    public String getOrderList() {

    }

}
