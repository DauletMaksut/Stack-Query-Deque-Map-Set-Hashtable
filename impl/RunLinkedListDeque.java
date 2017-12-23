package csci152.impl;

import csci152.adt.Deque;
import csci152.adt.IntStack;

/**
 * Created by Даулет on 19.02.2017.
 */
public class RunLinkedListDeque {

    public static Deque<Integer> copyDeque(Deque<Integer> deq) throws Exception{
        Deque<Integer> newDeq = new LinkedListDeque();
        int tmp;
        for(int i =0;i<deq.getSize();i++){
            tmp = deq.popFromBack();
            newDeq.pushToFront(tmp);
            deq.pushToFront(tmp);
        }
        return newDeq;
    }

    public static boolean areEqual(Deque<Integer> deq1, Deque<Integer> deq2) throws Exception{
        int tmp1;
        int tmp2;
        int counter = 0;
        if( deq1.getSize()== deq2.getSize()){
            for(int i=0;i<deq1.getSize();i++){
                tmp1 = deq1.popFromBack();
                tmp2 = deq2.popFromBack();
                if(tmp1 != tmp2){
                    counter++;
                }
                deq1.pushToFront(tmp1);
                deq2.pushToFront(tmp2);
            }

        }
        else{
            return false;
        }

        if(counter>0){
            return false;
        }else{
            return true;
        }
    }
    

    public static void shuffle(Deque<Integer> deq)throws Exception{
        Deque<Integer> tmp = new LinkedListDeque();
        int t1;
        int t2;
        int size = deq.getSize();
        for(int i=0; i< (size/2);i++){
            t1 = deq.popFromFront();
            t2 = deq.popFromBack();
            tmp.pushToBack(t1);
            tmp.pushToBack(t2);
        }
        for(int j=0; j < size;j++ ){
            deq.pushToFront(tmp.popFromBack());
        }
    }
    public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) throws Exception {
        Deque<Integer> newNode = new LinkedListDeque();
        Deque<Integer> result;
        int i;
        Integer garbage;
        if(d1.getSize() == 0 && d2.getSize() == 0){
            return newNode;
        }else if(d1.getSize() == 0){
            for(i=0;i<d2.getSize();i++){
                garbage = d2.popFromFront();
                newNode.pushToBack(garbage);
                d2.pushToBack(garbage);
            }
            return newNode;
        }else if(d2.getSize() == 0){
            for(i=0;i<d1.getSize();i++){
                garbage = d1.popFromFront();
                newNode.pushToBack(garbage);
                d1.pushToBack(garbage);
            }
            return newNode;
        }else{
            for(i=0;i<d2.getSize();i++){
                garbage = d2.popFromFront();
                newNode.pushToBack(garbage);
                d2.pushToBack(garbage);
            }
            for(i=0;i<d1.getSize();i++){
                garbage = d1.popFromFront();
                newNode.pushToBack(garbage);
                d1.pushToBack(garbage);
            }
            result = mergeSort(newNode);
            return result;
        }
    }


    public static Deque<Integer> mergeSort(Deque<Integer> deq) throws Exception {
        Deque newNode1 = new LinkedListDeque();
        Integer[] tmp = new Integer[deq.getSize()];
        Integer garbage1;
        int i;
        int j;
        int z = deq.getSize();
        if(z==0){
            return newNode1;
        }
        for(i=0;i<deq.getSize();i++){
            garbage1 = deq.popFromFront();
            tmp[i] = garbage1;
            deq.pushToBack(garbage1);
        }
        for(i=0;i<z-1;i++) {
            for (j = 0; j < (z - i - 1); j++) {
                if(tmp[j] > tmp[j+1]){
                    garbage1 = tmp[j];
                    tmp[j] = tmp[j+1];
                    tmp[j+1] = garbage1;
                }
            }
        }
        for(i=0;i<z;i++){
            newNode1.pushToBack(tmp[i]);
        }
        return newNode1;
    }
    public static void main(String[] args) throws Exception {
        Deque test = new LinkedListDeque();
        try {
            test.popFromBack();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            test.popFromFront();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        int i;
        for(i=0;i<10;i++){
            test.pushToFront(i);
            System.out.println(test);
        }
        for(i=0;i<5;i++){
            test.popFromFront();
            System.out.println(test);
        }
        test.clear();
        for(i=0;i<10;i++){
            test.pushToBack(i);
            System.out.println(test);
        }
        for(i=0;i<5;i++){
            test.popFromFront() ;
            System.out.println(test);
        }

        test.clear();
        test.pushToBack(11);
        test.pushToBack(55);
        test.pushToBack(22);
        test.pushToBack(44);
        test.pushToBack(99);
        test.pushToBack(88);
        System.out.println(mergeSort(test));

        Deque test1 = new LinkedListDeque();
        test1.pushToBack(1);
        test1.pushToBack(16);
        test1.pushToBack(26);
        test1.pushToBack(55);
        test1.pushToBack(66);
        test1.pushToBack(122);
        System.out.println(mergeSort(test1));

        System.out.println(merge(test,test1));
    }
}
