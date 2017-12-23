package csci152.impl;
import csci152.adt.Set;
/**
 * Created by Даулет on 14.03.2017.
 */
public class RunBSTSet {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(12);
        System.out.println(node);
        Integer tester1 = 25;
        Integer tester2 = 25;
        System.out.println(tester1.equals(tester2));
        Set<Integer> test2 = new BSTSet<>();
        System.out.println(test2.getSize());
        test2.add(5);
        System.out.println(test2.getSize());
        System.out.println(test2.remove(5));
        System.out.println(test2);
        test2.add(5);
        test2.add(1);
        test2.add(10);
        System.out.println(test2);
        System.out.println(test2.remove(1));
        System.out.println(test2);
    }
}
