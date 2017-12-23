package csci152.impl;

import com.sun.org.apache.regexp.internal.RE;
import csci152.adt.IntStack;
import csci152.impl.LLStackSet;
import csci152.impl.LLQueueSet;
import csci152.adt.Set;

/**
 * Created by Даулет on 14.03.2017.
 */
public class RunLLSet {
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) throws Exception{
        Set<Integer> Result = new LLQueueSet<>();
        Set<Integer> Trash = new LLQueueSet<>();
        int tmp;
        int loop = set1.getSize();
        for(int i=0;i<loop;i++){
            tmp = set1.removeAny();
            Trash.add(tmp);
            if(set2.contains(tmp)){
                Result.add(tmp);
            }
        }
        for (int i=0;i<loop;i++){
            set1.add(Trash.removeAny());
        }
        return Result;
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) throws Exception{
        Set<String> Result = new LLQueueSet<>();
        Set<String> Trash = new LLQueueSet<>();
        String tmp;
        int max = set1.getSize();
        for(int i =0; i<max; i++){
            tmp = set1.removeAny();
            Result.add(tmp);
            Trash.add(tmp);
        }
        for(int i =0; i<max; i++){
            tmp = Trash.removeAny();
            set1.add(tmp);
        }
        Trash.clear();
        max = set2.getSize();
        for(int i =0; i<max; i++){
            tmp = set2.removeAny();
            Result.add(tmp);
            Trash.add(tmp);
        }
        for(int i =0; i<max; i++){
            tmp = Trash.removeAny();
            set2.add(tmp);
        }
        return Result;
    }


    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2)throws Exception{
        int count = 0;
        Set<Integer> trash = new LLQueueSet();
        int tmp1;
        int tmp = set1.getSize();

        if(set1.getSize() ==0){
            return true;
        }
        if(set1.getSize()>set2.getSize()){
            return false;
        }
        for(int i=0;i<tmp; i++){
            tmp1 = set1.removeAny();
            trash.add(tmp1);
            if(set2.contains(tmp1)){
                count++;
            }
        }
        for (int i=0;i<tmp;i++){
            set1.add(trash.removeAny());
        }
        if(count == tmp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        /*Set test1 =  new LLStackSet();
        int t1 = 11;
        int t2 = 22;
        int t3 = 33;
        int t4 = 44;
        int t5 = 55;
        int t6 = 66;
        int t7 = 77;
        test1.add(t1);
        test1.add(t2);
        test1.add(t3);
        test1.add(t4);
        test1.add(t5);
        test1.add(t6);
        System.out.println(test1);
        System.out.println(test1.contains(11));
        System.out.println(test1.getSize());
        test1.add(t1);
        System.out.println(test1);
        System.out.println(test1.getSize());
        test1.add(t1);
        System.out.println(test1);
        System.out.println(test1.getSize());
        test1.add(t1);
        System.out.println(test1);
        System.out.println(test1);
        System.out.println(test1);
        Student p1 = new Student(2000,"Dauka");
        Student p2 = new Student(2010,"Madinka");
        Student p3 = new Student(2020,"Proga");
        Student p4 = new Student(2030,"BMO");
        Student p5 = new Student(2040,"Infin");
        Set test2 = new LLStackSet();
        test2.add(p1);
        test2.add(p2);
        test2.add(p3);
        test2.add(p4);
        test2.add(p5);
        test2.add(p1);
        System.out.println(test2);

        test1.add(1);
        test1.add(1);
        test1.add(1);
        test1.add(2);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test1.add(1);
        System.out.println(test1.contains(6));
        System.out.println(test1);
        System.out.println(test1.removeAny());
        System.out.println(test1);
        System.out.println(test1.removeAny());
        System.out.println(test1);
        System.out.println(test1.removeAny());
        System.out.println(test1);
        System.out.println(test1.removeAny());
        System.out.println(test1);
        System.out.println(test1.removeAny());
        System.out.println(test1);

        test1.add(1);
        test1.add(1);
        test1.add(1);
        test1.add(2);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test1.add(1);
        System.out.println(test1);
        System.out.println(test1.remove(1));
        System.out.println(test1);
        System.out.println(test1.remove(1));
        System.out.println(test1);
        System.out.println(test1.remove(2));
        System.out.println(test1);
        System.out.println(test1.remove(3));
        System.out.println(test1);
        System.out.println(test1.remove(4));
        System.out.println(test1);
        System.out.println(test1.remove(5));
        System.out.println(test1);
        System.out.println(test1.remove(1));
        System.out.println(test1);

        Set test3 = new LLQueueSet();
        test3.add(p1);
        test3.add(p2);
        test3.add(p3);
        test3.add(p4);
        test3.add(p5);
        test3.add(p1);
        System.out.println(test3);
        test3.removeAny();
        System.out.println(test3);
        test3.removeAny();
        System.out.println(test3);
        test3.removeAny();
        System.out.println(test3);
        test3.removeAny();
        System.out.println(test3);
        test3.removeAny();
        System.out.println(test3);*/
        Set test1 = new LLQueueSet();
        test1.add(1);
        test1.add(3);
        test1.add(5);
        test1.add(7);
        test1.add(9);
        test1.add(11);
        test1.add(13);
        test1.add(15);

        Set test2 = new LLQueueSet();
        test2.add(1);
        test2.add(3);
        test2.add(10);

        System.out.println(isSubset(test2, test1));

        Set test3 = new LLQueueSet();
        Set test4 = new LLStackSet();
        test3.add("Larry");
        test3.add("Moe");
        test3.add("Curly");
        test4.add("Shemp");
        test4.add("Larry");
        test4.add("Joe");
        System.out.println(test3);
        System.out.println(test4);
        Set test5 = union(test3,test4);
        System.out.println(test5);

        Set test6;
        test6 = intersection(test1, test2);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test6);
        System.out.println(test1);
        System.out.println(test2);

    }
}
