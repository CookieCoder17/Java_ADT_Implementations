/**
 * Contains the main method to test the GenericStack and GenericQueue
 * 
 * @author Adam Khoukhi
 * @version 1.0
 */
public class Test {

  /**
   * Tests the GenericQueue class
   */
  public static void testQueue() {
    String[] names = { "Adam", "Melika", "John", "Jack", "Bryan" };
    GenericQueue<String> queue = new GenericQueue<String>(names, true);
    System.out.println(queue.length());
    queue.enqueue("Fred");
    System.out.println(queue.peek());
    System.out.println(queue.dequeue());
    System.out.println(queue.clear());
    System.out.println(queue.isEmpty());
  }

  /**
   * Tests the GenericStack class
   */
  public static void testStack() {
    Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    GenericStack<Integer> stack = new GenericStack<Integer>(nums, false);
    System.out.println(stack.length());
    stack.push(11);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    stack.clear();
    System.out.println(stack.isEmpty());
  }

  /**
   * Tests the two Generic classes
   * 
   * @param args A reference to a string array that can store command-line
   *             arguments
   */
  public static void main(String[] args) {
    System.out.println("\nQueue Test:");
    testQueue(); // Calls the testQueue method
    System.out.println("\nStack Test:");
    testStack(); // Calls the testStack method
  }
}
