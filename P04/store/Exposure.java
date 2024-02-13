package store;
/**
 * Models an exposure enum
 *
 * @author            Alan Santoyo-Pina
 * @version           0.2
 * @since             0.2
 * @license.agreement Gnu General Public License 3.0
 */
public enum Exposure {
   /**
     * Shade plant
     */
    SHADE,
   /**
     * PartSun plant
     */ 
    PARTSUN,
   /** 
     * Sun plant
     */ 
    SUN;
   /**
     * Gives back the chose enum as a string
     *
     * @returns the desired string corresponding to the current exposure
     * @since   0.2
     */
    @Override
    public String toString() {
        if(this == PARTSUN) {
            return "part sun / part shade";
        }
        else if(this == SUN) {
            return "full sun";
        }
        else if(this == SHADE) {
            return "full shade";
        }
        else {
            return "N/A";
        }
    }
}
