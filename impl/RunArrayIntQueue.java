package csci152.impl;

import csci152.adt.IntQueue;
import csci152.adt.IntStack;

/**
 * Created by Даулет on 08.02.2017.
 */
public class RunArrayIntQueue {
    public static IntQueue copyQueue(IntQueue stk){
        int i = 0;
        int tmp = stk.getSize();
        IntQueue result = new ArrayIntQueue();
        int[] garbage = new int[stk.getSize()];
        for(;i<tmp;i++){
            try {
                garbage[i] = stk.dequeue();
            }catch (Exception ex){
                System.out.print(ex.getMessage());
            }
        }
        i = 0;
        for(i=0;i<tmp;i++){
            stk.enqueue(garbage[i]);
            result.enqueue(garbage[i]);
        }
        return result;
    }


    public static void reverseQueue(IntQueue toRev){
        IntQueue garbage = new ArrayIntQueue();
        IntStack result = new ArrayIntStack();
        IntStack result1 = new ArrayIntStack();
        int tmp = 0;
        while(toRev.getSize()>0){
            try {
                tmp = toRev.dequeue();
            }catch (Exception ex){
                System.out.print(ex.getMessage());
            }
            garbage.enqueue(tmp);
            result.push(tmp);
        }
        while(garbage.getSize()>0){
            try {
                toRev.enqueue(garbage.dequeue());
            }catch (Exception ex){
                System.out.print(ex.getMessage());
            }
        }
        while(result.getSize()>0){
            try {
                result1.push(result.pop());
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(result1);
    }


    public static boolean isPalindrome(IntQueue q){
        int begin = 0;
        int end = q.getSize()-1;
        int[] tmp = new int[q.getSize()];
        int i = 0;
        while(q.getSize()>0){
            try {
                tmp[i] = q.dequeue();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            i++;
        }
        for(i=0;i<end+1;i++){
            q.enqueue(tmp[i]);
        }
        i = 0;
        while(begin < end){
            if(tmp[begin] != tmp[end]){
                i++;
            }
            begin++;
            end--;
        }
        if(i==0){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args){
        IntQueue test1 = new ArrayIntQueue();
        try {
            test1.dequeue();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        test1.enqueue(11);
        test1.enqueue(22);
        test1.enqueue(33);
        test1.enqueue(44);
        test1.enqueue(55);

         try {
            test1.dequeue();
            test1.dequeue();
            test1.dequeue();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        test1.enqueue(66);
        test1.enqueue(77);
        test1.enqueue(88);
        test1.enqueue(99);
        test1.enqueue(101);
        System.out.println(test1);
        IntQueue test2 = new ArrayIntQueue();
        test2 = copyQueue(test1);
        System.out.println(test2);
        reverseQueue(test2);
        System.out.println(test2);
        System.out.println(isPalindrome(test2));
        IntQueue test3 = new ArrayIntQueue();
        test3.enqueue(11);
        test3.enqueue(11);
        test3.enqueue(11);
        test3.enqueue(11);
        test3.enqueue(11);
        System.out.println(test3.getSize());
        System.out.println(test3);

        System.out.println(isPalindrome(test3));
        System.out.println(test3);


    }
}
