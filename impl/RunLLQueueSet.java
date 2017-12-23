package csci152.impl;

import csci152.adt.Set;

/**
 * Created by Даулет on 14.03.2017.
 */
public class RunLLQueueSet {
    public static void main(String[] args) {
        Set test1 = new LLQueueSet();
        test1.add(18);
        test1.add(15);
        test1.add(24);
        test1.add(31);
        test1.add(9);
        test1.add(16);
        test1.add(22);
        System.out.println(test1);
        Set test2 = new BSTSet();
        test2.add(18);
        test2.add(15);
        test2.add(24);
        test2.add(31);
        test2.add(9);
        test2.add(16);
        test2.add(22);
        System.out.println(test2);
    }
}
