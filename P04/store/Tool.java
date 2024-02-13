package store;

/**
 * Models a tool as a product with the name and price.
 *
 * @author             Alan Santoyo-Pina
 * @version            0.2
 * @since              0.2
 * @license.agreement  Gnu General Public License 3.0
 */
public class Tool extends Product {
   /**
     * Creates a Tool instance.
     *
     * @param name    the name of the tool as a string
     * @param price   the price of the tool as an integer
     * @since         0.2
     */
    public Tool(String name, int price) {
        super(name,price);
    }
}
