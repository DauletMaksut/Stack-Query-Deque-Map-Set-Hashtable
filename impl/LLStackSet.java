package csci152.impl;

import csci152.adt.Queue;
import csci152.adt.Set;
import csci152.adt.Stack;

import java.util.Random;

/**
 * Created by Даулет on 14.03.2017.
 */
public class LLStackSet<T> implements Set<T> {
    Stack collector;

    public LLStackSet(){
        collector = new LinkedListStack();
    }

    @Override
    public void add(T value){
        if(!contains(value)){
            collector.push(value);
        }
    }

    @Override
    public boolean contains(T value) {
        int l = collector.getSize();
        Stack trash = new LinkedListStack();
        int count = 0;
        if(value instanceof Student){
            try{
                for(int j =0; j < l; j++){
                    T x = (T) collector.pop();
                    trash.push(x);
                    if(x.equals(value)){
                        count++;
                    }
                }
                collector = trash;
                if(count != 0){
                    return true;
                }
            }catch (Exception ex){}}
        T checker;

        try {
            for (int i=0;i< l;i++){
                checker = (T)collector.pop();
                trash.push(checker);
                if(checker == value){
                    count++;
                }
            }
            collector = trash;
            if(count != 0){
                return true;
            }
        }catch (Exception ex){

        }
        return false;
    }

    @Override
    public boolean remove(T value) {
        T tmp = null;
        try {
            if (contains(value)) {
                while (tmp != value) {
                    tmp = (T)collector.pop();
                    if(tmp == value){
                        return true;
                    }
                    collector.push(tmp);
                }
            }
        }catch (Exception ex){}
        return false;
    }

    @Override
    public T removeAny() throws Exception {
        if(collector.getSize() == 0){
            throw new Exception("Hmmm no no empty");
        }
        if(getSize()== 1){
            return (T)collector.pop();
        }else {
            Stack<T> trash = new LinkedListStack<T>();
            Random rn = new Random();
            int num = rn.nextInt(collector.getSize() - 1) + 1;
            for (int i = 0; i < num; i++) {
                trash.push((T)collector.pop());
            }
            while (trash.getSize() != 1) {
                collector.push(trash.pop());
            }
            return trash.pop();
        }
    }

    @Override
    public int getSize() {
        return collector.getSize();
    }

    @Override
    public void clear() {
        collector.clear();
    }
    public String toString(){
        return collector.toString();
    }

}
