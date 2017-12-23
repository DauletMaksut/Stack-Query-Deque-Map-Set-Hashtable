package csci152.impl;

import csci152.adt.Stack;

import javax.sound.midi.Soundbank;

/**
 * Created by Даулет on 13.02.2017.
 */
public class RunLinkedListStack{
    public static boolean isIncreasing(Stack<Double> st) throws Exception {
        Stack<Double> tmp1 = st;
        Stack<Double> tmp2 = st;
        tmp2.pop();
        double t1 = tmp1.pop();
        double t2 = tmp2.pop();
        int i = 0;
        int j = 0;
        if (st.getSize() > 1) {

            for (; i < (st.getSize() - 2); i++) {
                if (t1 <= t2) {
                    j++;
                }
                t1 = tmp1.pop();
                t2 = tmp2.pop();
            }
        }else{
            throw new Exception("You need to provide stack with size more than 1");
        }

        if (j > 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Stack test1 = new LinkedListStack();
        test1.push("JIc");
        test1.push(95);
        test1.push("SS");
        test1.push(152);

        System.out.println(test1);
        try {
            System.out.println(test1.pop());
            System.out.println(test1.pop());
            System.out.println(test1.pop());
            System.out.println(test1.pop());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        Stack<Double> test2 = new LinkedListStack();
        test2.push(1.1);
        test2.push(1.1);
        test2.push(1.1);
        test2.push(1.1);
        test2.push(1.1);
        try {
            boolean i = isIncreasing(test2);
            System.out.println(i);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}