package ProjectPhase1.concrete;

public class Customer {
    private int customerID;
    private String name;

    public Customer(int id, String name) {
        this.customerID = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
