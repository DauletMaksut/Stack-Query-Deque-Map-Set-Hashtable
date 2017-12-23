package csci152.impl;

import csci152.adt.*;
import csci152.impl.Customer;

/**
 * Created by Даулет on 22.02.2017.
 */
public class StoreTest {
    public static void main(String[] args) throws Exception {
   /*     Customer p1 = new Customer("Madina");
        Customer p2 = new Customer("Daulet");
        Customer p3 = new Customer("Ily");
        Customer p4 = new Customer("Bima");
        Customer p5 = new Customer("Aian");

        p1.pickUpItemToBuy("White T-shirt");
        p1.pickUpItemToBuy("Black pants");
        p1.pickUpItemToBuy("Black glasses");
        p2.pickUpItemToBuy("Green socks");
        p2.pickUpItemToBuy("White trousers");
        p2.pickUpItemToBuy("Yellow polo");
        p2.pickUpItemToBuy("Red trousers");
        p3.pickUpItemToBuy("Pink soft shirt");
        p3.pickUpItemToBuy("Pair of gloves");
        p4.pickUpItemToBuy("White pillow");
        p5.pickUpItemToBuy("Black pillow");
      //  p1.scanOneItem();
      //  p1.scanOneItem();
      //  p1.scanOneItem();
      //  p1.scanOneItem();
      //  p1.scanOneItem();
      //  p1.scanOneItem();
      //  System.out.println(p1.noItemsLeft());

        StoreLane l1 = new StoreLane(1);
        l1.addNewCustomer(p1);
        l1.addNewCustomer(p2);
        l1.addNewCustomer(p3);
        l1.addNewCustomer(p4);
        l1.addNewCustomer(p5);

        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();

        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
        l1.scanOneItem();
*/
        Store galmart = new Store();
        Customer p1 = new Customer("Madina");
        Customer p2 = new Customer("Daulet");
        Customer p3 = new Customer("Ily");
        Customer p4 = new Customer("Bima");
        Customer p5 = new Customer("Aian");

        p1.pickUpItemToBuy("White T-shirt");
        p1.pickUpItemToBuy("Black pants");
        p1.pickUpItemToBuy("Black glasses");
        p2.pickUpItemToBuy("Green socks");
        p2.pickUpItemToBuy("White trousers");
        p2.pickUpItemToBuy("Yellow polo");
        p2.pickUpItemToBuy("Red trousers");
        p3.pickUpItemToBuy("Pink soft shirt");
        p3.pickUpItemToBuy("Pair of gloves");
        p4.pickUpItemToBuy("White pillow");
        p5.pickUpItemToBuy("Black pillow");
        galmart.addCustomerToLane(p1, 1);
        galmart.addCustomerToLane(p2, 2);
        galmart.addCustomerToLane(p3, 3);
        galmart.addCustomerToLane(p4, 1);
        galmart.addCustomerToLane(p5, 2);
        galmart.addCustomerToLane(p5, 4);


        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();
        galmart.allLinesScanOneItem();


    }
}
