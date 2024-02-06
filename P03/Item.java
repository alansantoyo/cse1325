public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public int getPrice() {
        return (this.quantity * product.getPrice());    
    }

    @Override
    public String toString() {
        return String.format("%3d %-40s $%5d.%.02d", this.quantity, this.product.toString(),
            product.getPrice()/100, product.getPrice()%100); 
    }
}
