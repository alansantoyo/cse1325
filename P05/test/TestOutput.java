package test;
import store.Customer;
import store.Product;
import store.Item;
import store.Exposure;
import store.Plant;
import store.Tool;
import store.Order;

public class TestOutput {
    public static void main(String[] args) {
        try {
            Customer c1 = new Customer("Prof Rice", "george.rice@uta.edu");
            Customer c2 = new Customer("President Joe Biden", "president@whitehouse.gov");
            Customer c3 = new Customer("The Late Queen Elizabeth II", "queen@royal.gov.uk");
            Customer c4 = new Customer("Mark Zuckerberg", "mark.zuckerberg@facebook.com");

            Plant p1 = new Plant("Cactus Cereus Peruvianus", 4990, Exposure.SUN);
            Plant p2 = new Plant("'White Princess' Philodendron", 5500, Exposure.SHADE);
            Tool t3 = new Tool("Bypass Pruners", 2999);
            Tool t4 = new Tool("Large Gardener's Cart", 34900);

            Item i1 = new Item(p1, 4);
            Item i2 = new Item(p2, 3);
            Item i3 = new Item(t3, 2);
            Item i4 = new Item(t4, 1);

            Order o1 = new Order(c1);
            o1.addItem(i1);
            o1.addItem(i2);
            o1.addItem(i3);
            o1.addItem(i4);
            System.out.println(o1.toString());

        } catch(Exception e) {
            System.err.println("Failed to create and print objects: \n" + e);
        }
    }
}
