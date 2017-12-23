/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

/**
 *
 * @author daulet.maksut
 */
public class Employee implements Comparable<Employee> {
    private long taxiID;
    private int monthlyPay;
    private String name;
    public Employee(long id, int money, String name){
    this.name = name;
    taxiID = id;
    monthlyPay = money;
    }
    /**
     * @return the taxiID
     */
    public long getTaxiID() {
        return taxiID;
    }

    /**
     * @return the monthlyPay
     */
    public int getMonthlyPay() {
        return monthlyPay;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public int compareTo(Employee person){
            if(taxiID == person.getTaxiID()){
            return 0;
            }else if(taxiID < person.getTaxiID()){
                return -1;
            }else{
                return 1;
            }
    }
    
    @Override
    public String toString(){
    return "[" + taxiID+" " + name+" "
            + monthlyPay+"]";
}
}
