package csci152.impl;

/**
 * Created by Даулет on 19.02.2017.
 */
public class Student<T extends Comparable> {

        private int ID;
        private String name;
        public Student(int ID, String name){
            this.ID = ID;
            this.name = name;
        }

        public int getID() {
            return ID;
        }

        public boolean equal(Object obj){
            if(obj instanceof Student){
                Student sobj = (Student) obj;
                return this.ID == ID && name.equals(sobj.getName());
            }
            return false;
        }
        public String getName() {
            return name;
        }
        public String toString(){
            return "\n"+"ID is: "+ID+"; "+"Student name: "+name;
        }
    }

