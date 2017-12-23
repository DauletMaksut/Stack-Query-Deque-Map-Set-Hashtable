package csci152.impl;

import csci152.adt.Queue;
import csci152.impl.LinkedListStack;

/**
 * Created by Даулет on 14.02.2017.
 */
public class LinkedListQueue<T> implements Queue<T> {
    private Node<T> back;
    private Node<T> front;
    private int size;
    public LinkedListQueue(){
        size = 0;
        front = null;
        back = null;
    }
    public void enqueue(T value) {
        Node<T> tmp;
        if(size == 0){
            back = new Node<T>(value);
            back.setLink(null);
            front=back;
            size++;
        }
        else {
            tmp = new Node<T>(value);
            tmp.setLink(null);
            back.setLink(tmp);
            back = tmp;
            size++;
        }

    }

    @Override
    public T dequeue() throws Exception {
        if(size == 0){
            throw new Exception("There nothing to dequeue");
        }
        T garbage;
        garbage = front.getValue();
        front = front.getLink();
        size--;
        if(size == 0){
            back = back.getLink();
        }
        return garbage;
    }

    @Override
    public int getSize() {

        return size;
    }



    @Override
    public void clear() {
        back = null;
        front = null;
        size = 0;
    }
    public String toString(){
        String result = "front[";
        Node<T> garbege = front;
        int i;
        for(i=0;i<size;i++){
             result += garbege.getValue() + ",";
            garbege = garbege.getLink();
        }
        return result + "] back";
    }
}
/*class Node<T>{
    private T value;
    private Node<T> link;
    public Node(T val){
        value = val;
    }
    public T getValue(){
        return value;
    }
    public void setValue( T value ){
        this.value = value;
    }
    public Node<T> getLink(){
        return link;
    }
    public void setLink(Node<T> link){
        this.link = link;
    }
    public String toString(){
        return value.toString();
    }


}*/
