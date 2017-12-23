package csci152.adt;

/**
 * Created by Даулет on 22.02.2017.
 */
public interface Customer {
    /**
     * adds the name of item that Customer wants to buy
     * @param itemName
     */
    public void pickUpItemToBuy(String itemName);

    /**
     * It give name of item ordered by Customer and remove
     * it name from list
     */
    public void scanOneItem() throws Exception;

    /**
     * Give information about the item of Customer to scan.
     * There are nothing to scan
     * @return
     */
    public boolean noItemsLeft();

    /**
     * give name of Customer
     * @return name
     */
    public String getName();
}
