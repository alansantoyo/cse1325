package store;

/**
 * Models a customer by name and email address.
 *
 * @author            Alan Santoyo-Pina
 * @version           0.2
 * @since             0.2
 * @license.agreement Gnu General Public License 3.0
 */
public class Customer {
    private String name;
    private String email;
   /**
    * Creates a Customer instance
    * 
    * @param name  the customer's name
    * @param email the customer's email
    * @since       0.2 
    */
    public Customer(String name, String email) {
        int i = email.indexOf('@');
        if(i==-1 || (email.indexOf('@',i))==-1) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        else {
            this.name = name;
            this.email = email;
        }
    }
   /**
    * Returns the formatted name and email
    *
    * @return the name and email as one string
    * since    0.2
    */
    @Override
    public String toString() {
        return "" + this.name + " (" + this.email + ")";
    }    
}
