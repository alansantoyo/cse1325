package store;

/**
 * Models a product as a plant with the price and exposure type.
 *
 * @author              Alan Santoyo-Pina
 * @version             0.2
 * @since               0.2
 * @license.agreement   Gnu General Public License 3.0
 */
public class Plant extends Product {
    private Exposure exposure;
   /**
     * Creates a Plant instance.
     *
     * @param species    string representation of the plant species
     * @param price      integer representation of the price of the plant
     * @param exposure   enum representing how exposed to the sun the plant should be
     * @since            0.2
     */
    public Plant(String species, int price, Exposure exposure) {
        super("Plant: " + species,price);
        this.exposure = exposure;
    }
   /**
     * Returns the exposure level of the current plant.
     *
     * @return the recommended sun exposure for the plant
     * @since   0.2
     */
    public Exposure getExposure() {
        return this.exposure;    
    }
}
