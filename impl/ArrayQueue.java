package csci152.impl;

import csci152.adt.Queue;

/**
 * Created by Даулет on 09.02.2017.
 */
public class ArrayQueue<T> implements Queue<T> {
    private T[] values;
    private int size;
    private int front;
    private int back;

    public ArrayQueue(){
        values = (T[])new Object[5];
        size = 0;
        front = 0;
        back = 0;
    }
    @Override
    public void enqueue(T value) {
        if(size != values.length) {
            if (back == values.length) {
                back = 0;
            }
            // else {
            values[back] = value;
            size++;
            back++;
            //}
        }
        else{
            T[] tmp = (T[]) new Object[values.length*2];
            int index = 0;
            while(index != values.length){
                tmp[index] = values[front];
                index++;
                front++;
                if( front == values.length){
                    front = 0;
                }
            }
            tmp[values.length] = value;
            back = values.length + 1;
            front = 0;
            values = tmp;
            size++;
        }
    }

    @Override
    public T dequeue() throws Exception {
        T result;
        if (size == 0) {
            throw new Exception("There are nothing in the Queue");
        } else {
            if(front == values.length){
                front = 0;
            }
            result = values[front];
            values[front] = null;
            front++;
            size--;
        }
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        back = 0;
        size = 0;
        front = 0;

    }
    public String toString(){
        String str1="Front[";
        String str2 = "]back";
        int i = 0;
        int j = front;
        for(;i<size;i++,j++){
            if(j == values.length){
                j = 0;
            }
            str1+= values[j]+",";
        }
        return str1+str2;

    }
}
