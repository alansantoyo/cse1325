package store;
/**
 * Models an Item.
 *
 * @author            Alan Santoyo-Pina
 * @version           0.2
 * @since             0.2
 * @license.agreement Gnu General Public License 3.0
 */
public class Item {
    private Product product;
    private int quantity;
   /**
     * Creates an Item instance.
     * 
     * @param product   the current product
     * @param quantity  the amount of items for this product
     * @since           0.2
     */
    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
   /**
     * Gets the price for the Item
     *
     * @return the total price for the quantity of this product
     * @since   0.2
     */
    public int getPrice() {
        return (this.quantity * product.getPrice());    
    }
   /**
     * Formats the quantity, product and price.
     *
     * @return the formatted quantity, product and price of the Item
     * @since   0.2
     */
    @Override
    public String toString() {
        String formattedPrice = String.format("%5d.%02d", getPrice()/100, getPrice()%100);

        String formattedQuantity = String.format("%3d", this.quantity);
        String formattedProduct = String.format("%-40s", this.product.toString());

        String itemString = String.format("%s %s $%s", formattedQuantity, formattedProduct, formattedPrice);
        return itemString;
    }
}
