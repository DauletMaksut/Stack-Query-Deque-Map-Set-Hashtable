package csci152.impl;

import csci152.adt.*;
import csci152.adt.Customer;

/**
 * Created by Даулет on 22.02.2017.
 */
public class StoreLane implements csci152.adt.StoreLane {
    private int laneNumber;
    private Queue<Customer> line;
    private Customer beingServed;

    public StoreLane(int laneNumber){
        this.laneNumber = laneNumber;
        beingServed = null;
        line = new LinkedListQueue();
    }

    @Override
    public void addNewCustomer(Customer c) {
        if(beingServed == null){
            beingServed = c;
        }else {
            line.enqueue(c);

        }
    }
    public void scanOneItem() throws Exception{
        if(beingServed!= null){
            beingServed.scanOneItem();
            if(beingServed.noItemsLeft()){
                System.out.println(beingServed.getName()+" was served");
            }
        }
        if(beingServed == null) {
            beingServed = null;
        }else if(beingServed.noItemsLeft()){
            if(line.getSize() == 0){
                beingServed = null;
            }else{
                beingServed = line.dequeue();
                System.out.println(beingServed.getName()+" will be served");
            }
        }


    }



    public int getLaneNumber() {
        return laneNumber;
    }

}
