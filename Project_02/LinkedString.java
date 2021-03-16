/**
 * Implementations of operations of a Doubly LinkedString
 * 
 * @author Adam Khoukhi
 * @version 1.0
 */
public class LinkedString {
    /**
     * A reference to the head of a linked list
     */
    private Node<Character> head;
    /**
     * Keeps count of the number of nodes in a linked list
     */
    private int count;

    /**
     * Constructs an empty linked list
     */
    public LinkedString() {
        this("".toCharArray()); // Calls the second constructor with an empty char array
    }

    /**
     * Returns the number of nodes in the linked list
     * 
     * @return count the number of nodes in the linked list
     */
    public int getCount() {
        return count; // Getter
    }

    /**
     * Modifies and updates the number of nodes in the linked list
     * 
     * @param count the updated number of nodes in the linked list
     */
    public void setCount(int count) {
        this.count = count; // Setter
    }

    /**
     * Constructs a linked list from an array of char
     * @param data An array of chars
     */
    public LinkedString(char[] data) {
        /**
         * If the array is empty, then return
         */
        if (data.length == 0)
            return;
        this.head = new Node<Character>(data[0]);
        this.setCount(this.getCount() + 1);
        Node<Character> current = head;

        /**
         * Loop over the each index in the data array and create a new node for each character
         */
        for (int i = 1; i < data.length; i++) {
            current.setNext(new Node<Character>(data[i]));
            current.getNext().setPrev(current);
            current = current.getNext();
            this.setCount(this.getCount() + 1);
        }
    }

    /**
     * Constructs a linked list from a String
     * @param data String used as the data for the Nodes
     */
    public LinkedString(String data) {
        this(data.toCharArray()); // Calls the second constructor by converting the String to a char array
    }

    /**
     * Returns the character from the LinkedString at a given index
     * @param index The integer position of the obtained char
     * @return A char at the given index position
     * @throws IndexOutOfBoundsException
     */
    public char charAt(int index) throws IndexOutOfBoundsException {
        if (index > this.getCount() || index < 0) {
            throw new IndexOutOfBoundsException(
                    "Invalid index, please input an index between 0 and " + this.getCount());
        } else {
            Node<Character> current = head;
            for (int i = 0; i < this.getCount(); i++) {
                if (i == index) {
                    return current.getData();
                }
                current = current.getNext();
            }
        }
        return (char) -1;
    }

    /**
     * Concatenates 2 linkedStrings and returns a new concatenated linkedString
     * @param list A given LinkedString to be concatenated
     * @return A new LinkedString from the concatenation of the current and the given LinkedString
     */
    public LinkedString concat(LinkedString list) {
        return new LinkedString(this.toString() + list.toString());
    }

    /**
     * Determines whether a LinkedString is empty or not.
     * @return A boolean value specifying if a linkedString is empty or not
     */
    public boolean isEmpty() {
        return this.getCount() == 0;
    }

    /**
     * Returns the length of a linkedString.
     * @return An integer specifying the length of a linkedString
     */
    public int length() {
        return this.getCount();
    }

    /**
     * Extracts the characters from a linkedString between 2 specified indices and returns a new linkedString
     * @param start The index integer for the inital position to be extracted
     * @param end The index integer for the final position to be extracted
     * @return A new linkedString which is a specified substring of the original linkedString
     * @throws IndexOutOfBoundsException If the start or end values exceed the length of the linkedString
     */
    public LinkedString substring(int start, int end) throws IndexOutOfBoundsException {
        if (start > this.getCount() || end > this.getCount() || 0 > start || 0 > end) {
            throw new IndexOutOfBoundsException("Invalid range, please input a range from 0 and  " + this.getCount());
        } else {
            String list = "";
            for (int i = start; i < end; i++) {
                list += this.toString().charAt(i);
            }
            return new LinkedString(list);
        }
    }

    /**
     * Returns a string representation of the LinkedString
     * @return A string representation of the LinkedString
     */
    public String toString() {
        Node<Character> current = head;
        String link = "";
        while (current != null) {
            link += current.toString();
            current = current.getNext();
        }
        return link;

    }
    /**
     * Compares the values of two LinkedStrings 
     * @param linkedString A linkedString to compared to with
     * @return A boolean value of whether the two LinkedStrings are equal
     */
    public boolean equals(LinkedString linkedString){
        return this.toString().equals(linkedString.toString());
    }
}
