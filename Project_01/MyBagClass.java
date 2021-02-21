/**
 * Implementations of the operations of an ADT bag.
 * @author Adam Khoukhi
 * @version 1.0
 */
public class MyBagClass implements MyBagInterface{
    /**
     * Defines the capacity of an ADT bag.
     */
    private static final int CAPACITY = 100;

    /**
     * A reference to the array used to store in the bag.
     */
    private Object[] myBag;
    
    /**
     * Keeps track of the number of items in the bag.
     */
    private int numberOfItems;

    /**
     * Creates an empty ADT bag whose capacity is 100.
     */
    public MyBagClass(){
        this.myBag = new Object[CAPACITY];
        this.numberOfItems = 0;
    }

    /**
     * Adds an item to the end of the Array Bag.
     * @param item A reference to this added item
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public void insert(Object item) throws MyBagRuntimeException{
        if(this.numberOfItems >= this.myBag.length){
            throw new MyBagRuntimeException("You have reached the maximum capacity of this bag: " + this.myBag.length + ". Either remove an item, or empty the bag to add more items.");
        }else{
            // add the item at the end of the list
            this.myBag[this.numberOfItems] = item;
            // Inform the user that the item has been added
            System.out.println("Item: " + item + " has successfully been added!");
            // Increment the number of items by one
            this.numberOfItems++;
        }

        }
    /**
     * Removes the most recent item that was added.
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public void removeLast() throws MyBagRuntimeException{
        if(this.size() == 0){
            throw new MyBagRuntimeException("The list is empty. Add an item to enable this operation.");
        }else{
             // Remove the item at the end of the list
             this.myBag[this.numberOfItems] = null;
             // Inform the user that the item has been removed
             System.out.println("The item " + this.myBag[this.size()-1] + " has successfully been removed!");
             // Decrement the number of items by one
             this.numberOfItems--;           
        }
    }

    /**
     * Removes a random item from the bag.
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public void removeRandom() throws MyBagRuntimeException{
        if(this.size() == 0){
            throw new MyBagRuntimeException("The list is empty. There are no items to remove.");
        }else{
            // Generates a random number from 0 to the number of items in the bag
            int randomIndex = (int) (Math.random() * this.numberOfItems);
            // Stores the item to be removed inorder to inform the user
            Object itemRemoved = this.myBag[randomIndex];
            // Removes the item at the given index
            this.myBag[randomIndex] = null;
            
            for(int i=randomIndex; i<this.size();i++){
                // Shifts the items ahead to the left by one
                this.myBag[i] = this.myBag[i+1];
            }
            // Decrements the number of items by one
            this.numberOfItems--;
            // Informs the user of the item that was randomly removed
            System.out.println("The item that was randomly removed is: " + itemRemoved);
        }
    }

    /**
     * Returns the first occurrence of an item in the bag.
     * @param data A reference to the obtanied item
     * @return An integer specifying the position of the first occurrence of an item
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public int getFirstOccurrence(Object item) throws MyBagRuntimeException{
        if(this.size() == 0){
            throw new MyBagRuntimeException("The list is empty. There are no items to remove.");
        }else{
            for(int i=0;i<this.size();i++){
                if(this.myBag[i].equals(item)){
                    return i;
                }
            } 
            System.out.println("The item you entered is not in list");   
            return -1;
        }
    }

    /**
     * Returns the item at a specified index.
     * @param index An integer specifying the index of the obtanied item
     * @return An object specifying the retrieved item
     * @throws MyBagIndexOutOfBoundsException If index < 0 or index > size()
     * @throws MyBagRuntimeException If size() is 0 or size is >= Capacity
     */
    public Object getAtSpecifiedIndex(int index) throws MyBagIndexOutOfBoundsException, MyBagRuntimeException{
        if(this.size() == 0){
            throw new MyBagRuntimeException("The list is empty. No items to be retrieved");
        } else if (index < 0 || index > this.size()){
            throw new MyBagIndexOutOfBoundsException("Invalid index nubmer! The index number must be between 0 and " + (this.size()));
        } else{
            //return the item at the specified index
            return this.myBag[index];
        }
    }

    /**
     * Returns the length of a list.
     * @return An integer specifying the length of a list
     */
    public int size(){
        return this.numberOfItems;
    }

    /**
     * Determines whether a list is empty or not.
     * @return A boolean value specifying if a list is empty or not
     */
    public boolean isEmpty(){
        return this.numberOfItems == 0;
    }

    /**
     * Removes all items in a list.
     */
    public void makeEmpty(){
        this.myBag = new Object[CAPACITY];
        this.numberOfItems = 0;
    }

    }