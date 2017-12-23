
package csci152.impl;

import csci152.adt.IntStack;

/**
 *
 * @author daulet.maksut
 */
public class ArrayIntStack implements IntStack{

    private int[] values;
    private int size;
    private int result;

    public ArrayIntStack(){
        values = new int[10];
        size = 0;
    }

    @Override
    public void push(int value) {

        if(size == values.length){
            int[] tmp = new int[(values.length)*2];
            int count = 0;
            for(count = 0; count < 10; count++){
                tmp[count] = values[count];
            }
            values = tmp;
        }
        values[size] = value;
        size++;

    }

    @Override
    public int pop() throws Exception {
        if(size ==0){
            throw new Exception("There nothing in the stack");
        }
        else{
            int result = values[size-1];
            size--;
            return result;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    public String toString(){
        String str1="Botton[";
        String str2 = "]top";
        int i = 0;
        for(;i<size;i++){
            str1+= values[i]+",";
        }
        return str1+str2;

    }
}