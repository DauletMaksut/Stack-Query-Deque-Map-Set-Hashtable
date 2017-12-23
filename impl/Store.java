package csci152.impl;
import csci152.adt.Customer;
import csci152.impl.StoreLane;


/**
 * Created by Даулет on 22.02.2017.
 */
public class Store implements csci152.adt.Store {
    private StoreLane lanes;

    public Store(){
        for(int i=0;i<3;i++){
        lanes = new StoreLane(i);
        }
    }



    public void addCustomerToLane(Customer c, int laneNum) throws Exception{
        if(laneNum>=1 &&laneNum <= 3){
            lanes.addNewCustomer(c);
        }else{
            throw new Exception("Sorry you out of lane");
        }
    }

    @Override
    public void allLinesScanOneItem() throws Exception {
        for(int i =0; i<3;i++){
        lanes.scanOneItem();}
    }
}
