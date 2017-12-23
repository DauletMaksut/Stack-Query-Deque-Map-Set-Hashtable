package csci152.impl;
import csci152.adt.Queue;
/**
 * Created by Даулет on 09.02.2017.
 */
public class RunArrayQueue {
    public static void main(String[] args){
        Queue<Integer> test1 = new ArrayQueue();

        test1.enqueue(11);
        test1.enqueue(22);
        test1.enqueue(33);
        test1.enqueue(44);
        test1.enqueue(55);
        test1.enqueue(66);
        test1.enqueue(77);
        test1.enqueue(88);
        test1.enqueue(99);
        test1.enqueue(110);
        test1.enqueue(120);
        test1.enqueue(130);
        test1.enqueue(140);
        System.out.println(test1);
    }
}
