package csci152.impl;

import csci152.adt.SortedQueue;

/**
 * Created by Даулет on 19.02.2017.
 */
public class RunLinkedListSortedQueue {
    public static void main(String[] args) {
        SortedQueue test = new LinkedListSortedQueue();
        test.insert(90);
        test.insert(80);
        test.insert(70);
        test.insert(60);
        test.insert(50);
        test.insert(40);
        test.insert(30);
        test.insert(20);
        test.insert(10);
        test.insert(0);
        System.out.println(test);
        try {
            test.dequeue();
            test.dequeue();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(test);
        test.clear();
        System.out.println(test);
        test.insert(50);
        test.insert(40);
        test.insert(30);
        test.insert(20);
        System.out.println(test);
        test.clear();
        test.insert("albert aitstain");
        test.insert("daulet");
        test.insert("merlin monro");
        test.insert("skripi");
        System.out.println(test);
        test.clear();
        System.out.println(test);
        Student adil = new Student(201411 , "Adil");
        Student marat = new Student(201433 , "Marat");
        Student dinara = new Student(201477 , "Dinara");
        Student zarina = new Student(201455 , "Zarina");
        test.insert(adil.getID());
        test.insert(marat.getID());
        test.insert(dinara.getID());
        test.insert(zarina.getID());
        System.out.println(test);
        test.clear();
        test.insert(adil.getName());
        test.insert(marat.getName());
        test.insert(dinara.getName());
        test.insert(zarina.getName());
        System.out.println(test);

    }
}
