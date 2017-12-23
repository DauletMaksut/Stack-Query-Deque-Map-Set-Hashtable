package csci152.impl;

import csci152.adt.Stack;

/**
 * Created by Даулет on 13.02.2017.
 */
public class LinkedListStack<T> implements Stack<T> {
    private int size;
    private Node<T> top;
    public LinkedListStack(){
        size = 0;
        top = null;
    }

    @Override
    public void push(T value) {
        Node<T> tmp = top;
        top = new Node<T>(value);
        if(size == 0 ){
            top.setLink(null);
        }
        else{
            top.setLink(tmp);
        }
        size++;
    }

    @Override
    public T pop() throws Exception {
        if(size == 0){
            throw new Exception("Sorry there are nothing to pop");
        }
        else {
            T garbage = top.getValue();
            top = top.getLink();
            size--;
            return garbage;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }
    public String toString(){
        int i =0;
        Node<T> tmp = top;
        String textb = "top[";
        for(;i<size;i++){
            textb += tmp.getValue()+",";
            tmp = tmp.getLink();
        }
        return textb + "]bottom";

    }



}
    class Node<T>{
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


