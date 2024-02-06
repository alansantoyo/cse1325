public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {

    }
    public int getPrice() {
        return (this.quantity * product.getPrice());    
    }

    @Override
    public String toString() {
        return this.quantity + " " + this.product + " " + "$ " + product.getPrice(); 
    }
}
