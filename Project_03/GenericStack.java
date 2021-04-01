/**
 * Implementations of the operations of a Stack
 * 
 * @author Adam Khoukhi
 * @version 1.0
 */
public class GenericStack<E> {

    /**
     * A reference to the top node in the stack
     */
    private Node<E> top;

    /**
     * Keeps count of the number of nodes in a stack
     */
    private int count;

    /**
     * Constructs an empty stack
     */
    public GenericStack() {

    }

    /**
     * Constructs a stack with only one string
     * 
     * @param name A string which is the data for the first node
     */
    public GenericStack(E name) {
        this.top = new Node<E>(name);
        this.setCount(1);
    }

    /**
     * Constructs a stack through a generic array
     * 
     * @param names    A String array for the data of the nodes
     * @param inverted Boolean, If fase the data will start from index 0 to
     *                 length-1, otherwise reversed
     */
    public GenericStack(E[] names, boolean inverted) {
        if (inverted == false) {
            this.top = new Node<E>(names[0]);
            this.setCount(1);
            Node<E> current = top;
            for (int i = 1; i < names.length; i++) {
                current.setNext(new Node<E>(names[i]));
                this.setCount(this.getCount() + 1);
                current = current.getNext();
            }
        } else {
            this.top = new Node<E>(names[names.length - 1]);
            this.setCount(1);
            Node<E> current = top;
            for (int i = names.length - 2; i >= 0; i--) {
                current.setNext(new Node<E>(names[i]));
                this.setCount(this.getCount() + 1);
                current = current.getNext();
            }
        }
    }

    /**
     * Returns the number of nodes in the stack
     * 
     * @return count the number of nodes in the stack
     */
    public int getCount() {
        return count;
    }

    /**
     * Modifies and updates the number of nodes in the stack
     * 
     * @param count the updated number of nodes in the stack
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Returns the length of a stack.
     * 
     * @return An integer specifying the length of a stack
     */
    public int length() {
        return this.getCount();
    }

    /**
     * Returns whether the stack is empty
     * 
     * @return A Boolean value of whether the stack is empty
     */
    public boolean isEmpty() {
        return this.length() == 0;
    }

    /**
     * Returns the data of the node at the top of the stack
     * 
     * @return E A reference to the data of the node
     * @throws StackException Exception incase the stack is empty
     */
    public E peek() throws StackException {
        if (this.isEmpty()) {
            throw new StackException("The stack is empty");
        } else {
            return this.top.getData();
        }
    }

    /**
     * Pushes a new Node with the given data onto the stack
     * 
     * @param data E the value data for the new node
     */
    public void push(E data) {
        Node<E> newNode = new Node<E>(data);
        newNode.setNext(this.top);
        this.top = newNode;
        this.setCount(this.getCount() + 1);
    }

    /**
     * Removes the node at the top of the stack
     * 
     * @return E A reference to the data of the node that was removed
     * @throws StackException Exception incase the stack is empty
     */
    public E pop() throws StackException {
        if (this.isEmpty()) {
            throw new StackException("The stack is empty");
        } else {
            E data = this.top.getData();
            this.top = this.top.getNext();
            this.setCount(this.getCount() - 1);
            return data;
        }
    }

    /**
     * Clears a stack by removing all the nodes
     * 
     * @throws StackException Exception incase the stack is empty
     */
    public void clear() throws StackException {
        if (this.isEmpty()) {
            throw new StackException("The stack is already empty");
        } else {
            Node<E> current = this.top;
            while (!isEmpty()) {
                this.pop();
                this.setCount(this.getCount() - 1);
                current = current.getNext();
            }
        }
    }
}
