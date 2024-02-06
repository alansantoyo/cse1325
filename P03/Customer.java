public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        int i = email.indexOf('@');
        if(i==-1 || (email.indexOf('@',i))==-1) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }    
}
