package csci152.impl;

import csci152.adt.Queue;

/**
 * Created by Даулет on 22.02.2017.
 */
public class Customer implements csci152.adt.Customer {
    private String name;
    private Queue<String> itemToScan;

    public Customer(String name){
        this.name = name;
        itemToScan = new LinkedListQueue();
        }
    @Override
    public void pickUpItemToBuy(String itemName) {
        itemToScan.enqueue(itemName);
    }

    @Override
    public void scanOneItem() throws Exception {
        if(itemToScan.getSize() == 0){
            System.out.println(name + " has nothing to scan");
        }else {
        System.out.println(name + " wanted " + itemToScan.dequeue());
    }
    }

    @Override
    public boolean noItemsLeft() {
        if(itemToScan.getSize() == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
