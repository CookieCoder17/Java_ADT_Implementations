/**
 * Implementations of the operations of a Queue
 * 
 * @author Adam Khoukhi
 * @version 1.0
 */

public class GenericQueue<E> {

    /**
     * A pointer for the front of the queue to dequeue from
     */
    private Node<E> head;

    /**
     * A pointer for the end of the queue to enqueue to
     */
    private Node<E> tail;

    /**
     * Keeps count of the number of nodes in a stack
     */
    private int count;

    /**
     * Constructs a new generic queue with 1 node
     * 
     * @param object A reference to the first node in the queue
     */
    public GenericQueue(E object) {
        head = new Node<E>(object);
        tail = head;
        this.setCount(this.getCount() + 1);
    }

    /**
     * Constructs an empty genericQueue
     */
    public GenericQueue() {

    }

    /**
     * Constructs a genericqueue from an array of objects
     * 
     * @param objects  A reference to the data of the new node
     * @param inverted A boolean of whether to implement the array normally or
     *                 inverted
     */
    public GenericQueue(E[] objects, boolean inverted) {
        if (inverted == false) {
            head = new Node<E>(objects[0]);
            this.setCount(this.getCount() + 1);
            tail = head;
            for (int i = 1; i < objects.length; i++) {
                tail.setNext(new Node<E>(objects[i]));
                tail = tail.getNext();
                this.setCount(this.getCount() + 1);
            }
        } else {
            head = new Node<E>(objects[objects.length - 1]);
            this.setCount(this.getCount() + 1);
            tail = head;
            for (int i = objects.length - 2; i >= 0; i--) {
                tail.setNext(new Node<E>(objects[i]));
                tail = tail.getNext();
                this.setCount(this.getCount() + 1);
            }
        }
    }

    /**
     * Returns the number of nodes in the queue
     * 
     * @return count the number of nodes in the queue
     */
    public int getCount() {
        return count;
    }

    /**
     * Modifies and updates the number of nodes in the queue
     * 
     * @param count the updated number of nodes in the queue
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Adds a new node to the end of the queue
     * 
     * @param object A reference to the new node added
     */
    public void enqueue(E object) {
        if (head == null) {
            head = new Node<E>(object);
            tail = head;
        } else {
            tail.setNext(new Node<E>(object));
            tail = tail.getNext();
        }
        this.setCount(this.getCount() + 1);
    }

    /**
     * Removes a node from the front of the queue
     * 
     * @return E a reference to the node that was removed
     * @throws QueueException Exception incase the queue is empty
     */
    public E dequeue() throws QueueException {
        if (head == null) {
            throw new QueueException("The queue is empty!");
        } else {
            E data = head.getData();
            head = head.getNext();
            this.setCount(this.getCount() - 1);
            return data;
        }
    }

    /**
     * Returns a reference to the node to be removed
     * 
     * @return A reference to the head node
     * @throws QueueException Exception incase the queue is empty
     */
    public E peek() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Nothing to peek at, the queue is empty!");
        return head.getData();
    }

    /**
     * Returns the length of the queue
     * 
     * @return Integer denoting the length of the queue
     */
    public int length() {
        return this.getCount();
    }

    /**
     * Retuns whether the queue is empty
     * 
     * @return A boolean value of whether the queue is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Clears the queue by removing all the nodes
     * 
     * @return A boolean of whether the queue was successfully cleared
     * @throws QueueException Exception incase the queue is empty
     */
    public boolean clear() throws QueueException {
        if (head == null) {
            throw new QueueException("Can not clear an empty queue");
        } else {
            while (!isEmpty()) {
                this.dequeue();
            }
            if (this.isEmpty()) {
                return true;
            } else
                return false;
        }
    }
}
