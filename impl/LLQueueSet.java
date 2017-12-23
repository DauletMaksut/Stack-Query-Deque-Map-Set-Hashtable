package csci152.impl;
import csci152.adt.Queue;
import csci152.adt.Set;
import java.util.Random;

/**
 * Created by Даулет on 09.03.2017.
 */
public class LLQueueSet<T> implements Set<T>{
    Queue<T> collector;

    public LLQueueSet(){
    collector = new LinkedListQueue<T>();
    }
    @Override
    public void add(T value){
        if(!contains(value)){
            collector.enqueue(value);
        }
    }

    @Override
    public boolean contains(T value) {
        if(value instanceof Student){
            try{
                for(int j =0; j < collector.getSize(); j++){
                    T x = collector.dequeue();
                    collector.enqueue(x);
                    if(x.equals(value)){
                        return true;
                    }
                }
            }catch (Exception ex){}}
        T checker;
        try {
            for (int i=0;i< collector.getSize();i++){
                checker = collector.dequeue();
                collector.enqueue(checker);
                if(checker == value){
                    return true;
                }
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
                    tmp = collector.dequeue();
                    if(tmp == value){
                        return true;
                    }
                    collector.enqueue(tmp);
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
            return collector.dequeue();
        }else {
            Queue<T> trash = new LinkedListQueue<T>();
            Random rn = new Random();
            int num = rn.nextInt(collector.getSize() - 1) + 1;
            for (int i = 0; i < num; i++) {
                trash.enqueue(collector.dequeue());
            }
            while (trash.getSize() != 1) {
                collector.enqueue(trash.dequeue());
            }
            return trash.dequeue();
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
