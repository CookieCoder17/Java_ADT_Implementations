
/**
 * Specifications on the desgin of operations of an ADT Bag 
 * @author Adam Khoukhi
 * @version 1.0
 */
public interface MyBagInterface{
    /**
     * Adds an item to the end of the list of this bag.
     * @param item A reference to this added item
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public void insert(Object item) throws MyBagRuntimeException;

    /**
     * Removes the most recent item that was added.
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public void removeLast() throws MyBagRuntimeException;
    
    /**
     * Removes a random item from the bag.
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public void removeRandom() throws MyBagRuntimeException;

    /**
     * Returns the first occurrence of an item in the bag.
     * @param data A reference to the obtanied item
     * @return An integer specifying the position of the first occurrence of an item
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public int getFirstOccurrence(Object item) throws MyBagRuntimeException;

    /**
     * Returns the item at a specified index.
     * @param index An integer specifying the index of the obtanied item
     * @return An object specifying the retrieved item
     * @throws MyBagIndexOutOfBoundsException If index < 0 or index > size()
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public Object getAtSpecifiedIndex(int index) throws MyBagIndexOutOfBoundsException, MyBagRuntimeException;

    /**
     * Returns the length of a list.
     * @return An integer specifying the length of a list
     */
    public int size();

    /**
     * Determines whether a list is empty or not.
     * @return A boolean value specifying if a list is empty or not
     */
    public boolean isEmpty();

    /**
     * Removes all items in a list.
     */
    public void makeEmpty();
}
