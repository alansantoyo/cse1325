package store;
/**
 * Models a product.
 *
 * @author              Alan Santoyo-Pina
 * @version             0.2
 * @since               0.2
 * @license.agreement   Gnu General Public License 3.0
 */
public abstract class Product {
    private static int nextStockNumber = 0;
    private int stockNumber;
    private String name;
    private int price;
   /**
     * Creates a Product instance.
     *
     * @param name   name of the product
     * @param price  price of the product
     * @since        0.2 
     */
    public Product(String name, int price) {
        if(price < 0) {
            throw new IllegalArgumentException("Invalid price of " + name + ": " + price);
        }
        else {
            this.stockNumber = nextStockNumber++;
            this.name = name;
            this.price = price;
        }
    }
   /**
     * Gets the stock number of the product.
     *
     * @return the stock number
     * @since  0.2
     */
    public int getStockNumber() {
        return this.stockNumber;
    }
   /**
     * Gets price of the product.
     *
     * @return the price of the product
     * @since  0.2
     */
    public int getPrice() {
        return this.price;
    }
   /**
     * Formats the name and price of the product.
     *
     * @return  the formatted name and price of the product in dollars and cents
     * @since   0.2
     */
    @Override
    public String toString() {
        int dollars = this.price/100;
        int cents = this.price%100;
        
        return String.format("%-30s $%5d.%02d", this.name, dollars, cents);
    }    
}
