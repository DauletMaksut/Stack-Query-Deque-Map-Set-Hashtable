package csci152.impl;

import csci152.adt.Deque;

/**
 * Created by Даулет on 19.02.2017.
 */
public class LinkedListDeque<T> implements Deque<T> {
    private int size;
    private DoublyLinkedNode<T> front;
    private DoublyLinkedNode<T> back;

    public LinkedListDeque(){
        size = 0;
        front = null;
        back = null;
    }
    @Override
    public void pushToFront(T value) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(value);
        if(size == 0){
            back = newNode;
            front = newNode;
            back.setNext(null);
            front.setNext(null);
            back.setPrev(null);
            front.setPrev(null);
            size++;
        }else{
            newNode.setPrev(null);
            newNode.setNext(front);
            front.setPrev(newNode);
            front = newNode;
            size++;
        }
    }

    @Override
    public void pushToBack(T value) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(value);
        if(size == 0){
            back = newNode;
            front = newNode;
            back.setNext(null);
            front.setNext(null);
            back.setPrev(null);
            front.setPrev(null);
            size++;
        }else{
            newNode.setPrev(back);
            newNode.setNext(null);
            back.setNext(newNode);
            back = newNode;
            size++;
        }
    }

    @Override
    public T popFromFront() throws Exception {
        if(size == 0){
            throw new Exception("There nothing to remove");
        }
        T garbage;
        garbage = front.getValue();
        front = front.getNext();
        if(size != 1){
            front.setPrev(null);}
        size--;
        return garbage;
    }

    @Override
    public T popFromBack() throws Exception {
        if(size == 0){
            throw new Exception("There nothing to remove");
        }
        T garbage;
        garbage = back.getValue();
        back = back.getPrev();
        if(size != 1){
            back.setNext(null);}
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
        back = null;
    }
    public String toString(){
        String result = "front[";
        DoublyLinkedNode<T> garbege = front;
        int i;
        for(i=0;i<size;i++){
            result += garbege.getValue() + ",";
            garbege = garbege.getNext();
        }
        return result + "] back";
    }
}
class DoublyLinkedNode<T>{
    private T value;
    private DoublyLinkedNode<T> prev;
    private DoublyLinkedNode<T> next;
    public DoublyLinkedNode(T val){
        value = val;
    }

    public T getValue(){
        return value;
    }
    public void setValue( T value ){
        this.value = value;
    }

    public String toString(){
        return value.toString();
    }

    public DoublyLinkedNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode<T> prev) {
        this.prev = prev;
    }

    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }
}

