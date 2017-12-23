package csci152.impl;

import csci152.adt.Set;
import sun.reflect.generics.tree.Tree;

/**
 * Created by Даулет on 14.03.2017.
 */
public class BSTSet<T extends Comparable> implements Set<T> {
    private TreeNode<T> root;
    private int size;

    public BSTSet(){
        root = null;
        size = 0;
    }

    @Override
    public void add(T value) {
        TreeNode<T> num = new TreeNode<T>(value);
        if(size == 0){
            size++;
            root = num;
        }else{
            addHelper(root, num);
        }

    }

    private void addHelper(TreeNode<T> node, TreeNode val){
        if(node.getRight()==null&&node.getValue().compareTo(val.getValue()) < 0){
            node.setRight(val);
            size++;
        }else if(node.getLeft()==null&&node.getValue().compareTo(val.getValue()) > 0){
            node.setLeft(val);
            size++;
        }else if(node.getValue().compareTo(val.getValue())>0){
            node = node.getLeft();
            addHelper(node, val);
        }else if(node.getValue().compareTo(val.getValue())<0){
            node = node.getRight();
            addHelper(node, val);
        }
    }



    @Override
    public boolean contains(T value){
        return containHelper(root, value);
    }

    private boolean containHelper(TreeNode<T> node, T value){
        if(node == null){
            return false;
        }else if(node.getValue().compareTo(value) <0){
            node = node.getRight();
            return containHelper(node, value);
        }else if(node.getValue().compareTo(value) >0){
            node = node.getLeft();
            return containHelper(node, value);
        }else if(node.getValue().compareTo(value)==0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean remove(T value){
        if(contains(value)){
            size--;
        removeHelper(root, value);
            return true;
    }else{
            return false;
        }
    }

    private void removeHelper(TreeNode<T> node, T value){
        if(node.getLeft()==null && node.getRight()==null && node.getValue() == value) {
            node.setValue(null);
            node = null;
            return;
        }else if(node.getRight().getValue()==value){
            TreeNode<T> tmp = node.getRight().getLeft();
            TreeNode<T> trash = node.getRight().getRight();
            node.setRight(trash);
            node = node.getRight();
            if(node != null || node.getLeft() != null){
            while(node.getLeft()==null){
                node = node.getLeft();
            }
            }
            node.setLeft(tmp);
            return;
        }else if(node.getLeft().getValue()==value){
            TreeNode<T> tmp = node.getLeft().getLeft();
            node.setLeft(node.getLeft().getRight());
            node = node.getLeft();
            if(node != null || node.getLeft() != null){
            while(node.getLeft()==null){
                node = node.getLeft();
            }
            }
            node.setLeft(tmp);
            return;
        }/*else if(node.getRight().getLeft()==null&&node.getRight().getValue()==value&&node.getRight().getRight()!=null){
            node.setRight(node.getRight().getRight());
            return;
        }else if(node.getRight().getRight()==null&&node.getRight().getValue()==value&&node.getRight().getLeft()!=null){
            node.setRight(node.getRight().getLeft());
            return;
        }else if(node.getLeft().getLeft()==null&&node.getLeft().getValue()== value&&node.getLeft().getRight()!=null){
            node.setLeft(node.getLeft().getRight());
            return;
        }else if(node.getLeft().getLeft()!=null&&node.getLeft().getValue()== value&&node.getLeft().getRight()==null){
            node.setLeft(node.getLeft().getLeft());
            return;
        }*/else if(node.getValue().compareTo(value)>0){
            node = node.getLeft();
            removeHelper(node, value);
        }else if(node.getValue().compareTo(value)<0){
            node = node.getRight();
            removeHelper(node, value);
        }
        else{
            return;
        }

    }

    @Override
    public T removeAny() throws Exception {
        return null;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    public String toString() {
        return toStringHelper(root);
    }

    private String toStringHelper(TreeNode<T> Node){
        if(Node == null){
            return " ";
        }

        return toStringHelper(Node.getLeft())+Node.getValue()+toStringHelper(Node.getRight());
    }

}
