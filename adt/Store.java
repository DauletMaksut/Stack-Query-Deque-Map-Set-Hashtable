package csci152.adt;

/**
 * Created by Даулет on 22.02.2017.
 */
public interface Store {
    /**
     * adds Customers to the chosen line, also there will
     * message if customer do not choose correct line
     */
    public void addCustomerToLane(Customer c, int laneNum) throws Exception;

    /**
     * All three lines scan one item
     */
    public void allLinesScanOneItem() throws Exception;
}
