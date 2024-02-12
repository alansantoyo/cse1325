package store;

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
        String formattedPrice = String.format("%5d.%02d", getPrice()/100, getPrice()%100);

        String formattedQuantity = String.format("%3d", this.quantity);
        String formattedProduct = String.format("%-40s", this.product.toString());

        String itemString = String.format("%s %s $%s", formattedQuantity, formattedProduct, formattedPrice);
        return itemString;
    }
}
