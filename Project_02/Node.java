/**
 * Represents a node in a linked list.
 * @author Adam Khoukhi
 * @version 1.0
 */

public class Node<E>{
    /**
     * The data stored in the node
     */
    private E data;
    /**
     * The link to the next node
     */
    private Node<E> next;
    /**
     * The link to the previous node 
     */
    private Node<E> prev;

    /**
     * Constructs a node with data and a link to both: the next and previous node
     * @param data A reference to the data of this node 
     */
    public Node(E data){
        this.setData(data);
        this.setNext(null);
        this.setPrev(null);
    }

    /**
     * Returns the data of a node
     * @return data the generic data of a node
     */
    public E getData() {
        return data;
    }

    /**
     * sets the data of a node
     * @param data the generic value to be given to a node
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Returns the reference of the next node
     * @return next the reference of the next node
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Sets the reference of the next node
     * @param next the successor node of the current node
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Returns the reference of the previous node
     * @return prev the reference of the previous node
     */
    public Node<E> getPrev() {
        return prev;
    }

    /**
     * Sets the reference of the previous node
     * @param prev the predecessor node of the current node
     */
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
    
    /**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
    public String toString(){
        return String.valueOf(this.data);
    }

    /**
	 * Compares the values of two nodes 
	 * @return A boolean value of whether the two nodes are equal
	 */
    public boolean equals(Node<E> node){
        return this.getData() == node.getData();
    }
}