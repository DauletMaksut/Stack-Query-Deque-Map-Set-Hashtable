package csci152.adt;

/**
 * Created by Даулет on 22.02.2017.
 */
public interface StoreLane{
    /**
     * Give information about Customer, is
     * Customer in line or is Customer is first
     * @param c
     */
    public void addNewCustomer(Customer c);

    /**
     * Scan one item of Customer until it have nothing to scan
     * after that goes to the next Customer
     */
    public void scanOneItem() throws Exception;
}
