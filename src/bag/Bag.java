package bag;

/**
 * A collection where removing items is not supported. A bag's purpose
 * is to collect items and provide the ability to iterate through them.
 * The order of iteration is unspecified.
 *
 * @param <E> the type of elements in this bag
 */
public interface Bag<E> {

    /**
     * Add an element.
     */
    void add(E element);

    /**
     * Is the bag empty? Returns true if so, false otherwise.
     */
    boolean isEmpty();

    /**
     * Number of elements in the bag.
     */
    int size();
}