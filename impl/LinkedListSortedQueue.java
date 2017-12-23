package csci152.impl;

import csci152.adt.SortedQueue;

/**
 * Created by Даулет on 19.02.2017.
 */
public class LinkedListSortedQueue<T extends Comparable> implements SortedQueue<T> {
    private Node<T> front;
    private int size;


    public LinkedListSortedQueue(){
        size = 0;
        front = null;
    }
    @Override
    public void insert(T value) {
        Node<T> newNode = new Node(value);
        newNode.setLink(null);
        Node<T> traveller1 = front;
        Node<T> traveller2 = front;
        if (size ==0){
            front = newNode;
        }else {
            if (value.compareTo(front.getValue()) <= 0) {
                newNode.setLink(front);
                front = newNode;
            }else{
            while(traveller1 != null && value.compareTo(traveller1.getValue()) > 0){
                traveller1 = traveller1.getLink();
            }
            while( traveller2.getLink() != traveller1){
                traveller2 = traveller2.getLink();
            }
            if(traveller1 == null){
                traveller2.setLink(newNode);
            }else{
                newNode.setLink(traveller1);
                traveller2.setLink(newNode);
            }
        }
        }
        size++;
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
        return garbage;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        front = null;
    }
    public String toString(){
        String result = "front[";
        Node<T> garbege = front;
        while (garbege != null){
            result += garbege.getValue() + ",";
            garbege = garbege.getLink();
        }
        return result + "] back" + "\n" + "Size is: " + size;
    }
    }

/*    class Node<T>{
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


}
}*/
