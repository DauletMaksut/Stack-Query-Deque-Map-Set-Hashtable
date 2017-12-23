package csci152.adt;

/**
 * Created by Даулет on 19.02.2017.
 */
public interface SortedQueue<T extends Comparable> {

    /**
     * Adds an element to the queue in a position that
     * preserves the ordering of the elements
     *
     * @param value element to be added to the queue
     */
    public void insert(T value);

    /**
     * Removes and returns the front most element of the queue
     *
     * @return the front most element of the queue
     * @throws Exception if the queue is empty
     */
    public T dequeue() throws Exception;

    /**
     * @return the size of the queue
     */
    public int getSize();

    /**
     * Removes all elements from the queue
     */
    public void clear();

    /**
     * @return a String representation of the queue
     */
    @Override
    public String toString();
}
