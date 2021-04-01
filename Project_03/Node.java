/**
 * Represents a node in a Queue and Stack
 * 
 * @author Adam Khoukhi
 * @version 1.0
 */
public class Node<E> {
    /**
     * The data stored in the node
     */
    private E data;

    /**
     * The pointer to the next node
     */
    private Node<E> next;

    /**
     * Constructs a node with data and a link to the next node
     * 
     * @param data A reference to the data of this node
     */
    public Node(E data) {
        this.setData(data);
        this.setNext(null);
    }

    /**
     * Returns the reference of the next node
     * 
     * @return next the reference of the next node
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Returns the data of a node
     * 
     * @return data the generic data of a node
     */
    public E getData() {
        return data;
    }

    /**
     * sets the data of a node
     * 
     * @param data the generic value to be given to a node
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Sets the reference of the next node
     * 
     * @param next the successor node of the current node
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Returns whether or not the next node is null
     * 
     * @return Boolean of whether the node has a next node
     */
    public boolean hasNext() {
        return this.getNext() == null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getData());
    }

    /**
     * Compares two nodes and retuns if they are equals
     * 
     * @param node Node to be compared to
     * @return A boolean of whether the two nodes are equal
     */
    public boolean equals(Node<E> node) {
        return this.toString().equals(node.toString());
    }
}
