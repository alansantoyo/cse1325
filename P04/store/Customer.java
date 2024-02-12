package store;

public class Customer {
    private String name;
    private String email;

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

    @Override
    public String toString() {
        return "" + this.name + " (" + this.email + ")";
    }    
}
