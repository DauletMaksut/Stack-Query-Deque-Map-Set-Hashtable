package csci152.impl;

/**
 * Created by Даулет on 14.03.2017.
 */
public class TreeNode<T> {
    private T value;

    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value){
        this.value = value;
        setLeft(null);
        setRight(null);
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public String toString(){
        return value.toString();
    }
}
