package csci152.impl;

import csci152.adt.Queue;
import csci152.adt.Stack;


/**
 * Created by Даулет on 14.02.2017.
 */
public class RunLinkedListQueue {
    public static void reverseQueue(Queue<Character> q) throws Exception {
        int i;
        char garbage;
        int tt = q.getSize();
        Stack<Character> tmp = new LinkedListStack<Character>();
        for (i = 0; i < tt; i++) {
            garbage = q.dequeue();
            tmp.push(garbage);
        }
        for (i = 0; i < tt; i++) {
            q.enqueue(tmp.pop());
        }
    }

    public static boolean isPalindrome(Queue<Character> q) throws Exception {
        Stack<Character> inverse = new LinkedListStack();
        char garbage;
        int i;
        int check = 0;
        char tester;
        if (q.getSize() == 0) {
            return true;
        }
        while (inverse.getSize() != q.getSize()) {
            garbage = q.dequeue();
            inverse.push(garbage);
            q.enqueue(garbage);
        }
        while (inverse.getSize() > 0) {
            tester = q.dequeue();
            garbage = inverse.pop();
            if (tester != garbage) {
                check++;
            }
            q.enqueue(tester);
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isBalanced(Queue<Character> q) throws Exception{
        Stack<Character> comp = new LinkedListStack();
        char sure;
        Character tmp;
        int i = 0;
        int check = 0;
        for(;i<q.getSize();i++){
            tmp = q.dequeue();
            if(tmp == '[' || tmp == '{' || tmp == '(' ){
                comp.push(tmp);
            }
            if(tmp == ']' || tmp == '}' || tmp == ')' ){
                if(comp.getSize() > 0 ){
                    sure = comp.pop();
                    if((tmp == ']' && sure == '[') || (tmp == '}' && sure == '{') || (tmp == ')' && sure == '(') ){
                    }else{
                        check++;
                    }
                }
            }
            q.enqueue(tmp);
        }
        if(comp.getSize() == 0 && check ==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Queue test = new LinkedListQueue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);

        System.out.println(test);
        Queue test1 = new LinkedListQueue();
        try {
            test.dequeue();
            System.out.println(test.dequeue());
            System.out.println(test);
            System.out.println(test.getSize());


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
