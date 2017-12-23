
package csci152.impl;

import csci152.adt.IntStack;

/**
 *
 * @author daulet.maksut
 */
public class RunArrayIntStack {

    public static int evenCount(IntStack stk){
        IntStack garbage = new ArrayIntStack();
        int count = 0;
        int tmp = 0;
        while(stk.getSize() > 0){
            try {
                garbage.push(stk.pop());
            }catch(Exception ex){
                System.out.print(ex.getMessage());
            }
        }
        while(garbage.getSize() > 0){
            try {
                tmp = garbage.pop();
            }catch (Exception ex){
                System.out.print(ex.getMessage());
            }
            if(tmp % 2 == 0 && tmp != 0){
                count++;
            }
            stk.push(tmp);
        }
        return count;
    }



    public static void repeater(IntStack stk) throws Exception {
        IntStack temp = new ArrayIntStack();
        IntStack result = new ArrayIntStack();
        int size = stk.getSize();
        int tmp;
        while (stk.getSize() > 0) {
            temp.push(stk.pop());
        }
        while (temp.getSize() != 0) {
            tmp = temp.pop();
            stk.push(tmp);
            result.push(tmp);
            result.push(tmp);
        }
        System.out.println(result);
    }

    public static IntStack copy(IntStack stk) {
        IntStack garbage = new ArrayIntStack();
        IntStack result = new ArrayIntStack();
        int size = stk.getSize();
        int tmp;
        while (stk.getSize() > 0) {
            try {
                garbage.push(stk.pop());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        while (garbage.getSize() > 0) {
            try {
                tmp = garbage.pop();
                result.push(tmp);
                stk.push(tmp);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }


        return result;
//        System.out.println(result);
    }


    public static IntStack reverseStack(IntStack stk){
        IntStack result = new ArrayIntStack();
        IntStack garbage = new ArrayIntStack();
        int tmp = 0;
        while(stk.getSize()>0){
            try {
                tmp = stk.pop();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            result.push(tmp);
            garbage.push(tmp);
        }
        while(garbage.getSize() > 0){
            try {
                stk.push(garbage.pop());
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return result;
    }


    public static IntStack merge(IntStack s1, IntStack s2){
        int size;
        int i = 0;
        int max = 0;
        int j = 0;
        IntStack result = new ArrayIntStack();
        if(s1.getSize()> s2.getSize()){
            size = s1.getSize();
        }
        else {
            size = s2.getSize();
        }
        int[] tmp = new int[size*2];
        while(s1.getSize()>0){
            try {
            tmp[i]= s1.pop();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            i++;
        }
        while(s2.getSize()>0){
            try {
                tmp[i] = s2.pop();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            i++;
        }
        max = i;
        i = 0;
        for(i=0;i < max - 1;i++){
            for(j=0;j < max - 1 - i;j++){
                if(tmp[j] > tmp[j+1]){
                    int nomean = tmp[j+1];
                    tmp[j+1] = tmp[j];
                    tmp[j] = nomean;
                    }
                }
            }
        for (i=0; i < max; i++){
            result.push(tmp[i]);
        }
        return result;
    }



    public static void main(String[] args) {
        ArrayIntStack test1 = new ArrayIntStack();


        int i = 0;
        for (; i < 9; i++) {
            test1.push(i);
        }
        try {
            repeater(test1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(test1);


        ArrayIntStack test2 = new ArrayIntStack();
        for (i = 0; i < 9; i++) {
            test2.push(i);
        }
        try {
            IntStack res = copy(test2);
            System.out.println(res);
            System.out.println(test2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        int num = evenCount(test2);
        System.out.println(num);
        System.out.println(test2);
        IntStack rev = new ArrayIntStack();
        rev = reverseStack(test2);
        System.out.println(rev);

        IntStack s1 = new ArrayIntStack();
        IntStack s2 = new ArrayIntStack();
        s1.push(11);
        s1.push(44);
        s1.push(77);
        s2.push(22);
        s2.push(55);
        s2.push(88);
        System.out.println(s1);
        System.out.println(s2);
        IntStack oof = new ArrayIntStack();
        oof = merge(s1, s2);
        System.out.println(oof);

    }
}