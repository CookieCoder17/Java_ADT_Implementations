import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

    /**
     * Displays and tests the ADT Address Book.
     * 
     * @throws FileNotFoundException If file is not found
     */
    public static void start() throws FileNotFoundException {
        // Test Case 1
        AddressBook book1 = new AddressBook(); // Test Case 1
        Address address = new Address("6649 N Blue Gum St", "New Orleans", "LA", "70116");
        Contact contact = new Contact("Adam Khoukhi", address, "518-553-4434");
        System.out.println("TestCase 1:");
        book1.insert(contact); // Insert method
        System.out.println("Size: " + book1.size()); // Sie method
        System.out.println("Contains: " + book1.contains("Adam Khoukhi")); // contains method
        System.out.println("Get: " + book1.get("Adam Khoukhi")); // get method
        System.out.println("Remove: Adam Khoukhi");
        book1.remove("Adam Khoukhi"); // Remove method
        System.out.println("Size: " + book1.size()); // Sie method
        book1.insert(contact); // Insert method
        System.out.println(book1.isEmpty()); // isEmpty method
        book1.makeEmpty(); // make empty method
        System.out.println(book1.isEmpty()); // isEmpty method

        // Test Case 2
        AddressBook book2 = new AddressBook(); // Test Case 2
        fill(book2); // Fills the Address book with contacts
        System.out.println("\nTestCase 2:");
        // Tests the Size method
        System.out.println("size " + book2.size());
        // Tests the Contains method
        System.out.println(book2.contains("Yuki Whobrey"));
        // Tests the Remove method
        System.out.println("Remove: Yuki Whobrey");
        book2.remove("Yuki Whobrey");
        // Tests the Contains method
        System.out.println("Contains: " + book2.contains("Yuki Whobrey"));
        // Tests the Size method
        System.out.println(book2.size());
        // Tests the Get Method
        System.out.println(book2.get("Arlette Honeywell"));
        // Tests the isEmpty method
        System.out.println("isEmpty: " + book2.isEmpty());
        // Tests the makeEmpty method
        System.out.println("Remove All");
        book2.makeEmpty();
        // Tests the isEmpty method
        System.out.println("isEmpty: " + book2.isEmpty());

        // Test Case 3
        AddressBook book3 = new AddressBook(); // Test Case 3
        System.out.println("\nTestCase 3:");
        fill(book3); // Fills the Address book with contacts
        display(book3); // Displays all the contacts in the AddressBook
    }

    /**
     * Inserts Contacts from a txt file into the AddressBook
     * 
     * @param book A reference to AddressBook of Contacts
     * @throws FileNotFoundException thrown if the file is not found
     */
    public static void fill(AddressBook book) throws FileNotFoundException {
        File file = new File("contacts.txt"); // Data file
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while (scanner.hasNext()) {
            ArrayList<String> segments = new ArrayList<String>(); // To store the parameters of a contact and address
            String[] tokens = scanner.nextLine().split("\t"); // Split by tab
            // Remove the empty tokens since the data file is messy
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].trim().equals("")) {
                    continue;
                } else {
                    segments.add(tokens[i]); // add the non empty tokens
                }
            }
            String name = segments.get(0) + " " + segments.get(1); // Name is the first two columns
            Address address = new Address(segments.get(2), segments.get(3), segments.get(4), segments.get(5));
            Contact contact = new Contact(name, address, segments.get(6)); // Last column
            book.insert(contact); // Add the contact to the Address book
        }
        scanner.close(); // Close scanner
    }

    /**
     * Displays the contacts in the AddressBook
     * 
     * @param testBag A reference to a bag of items
     */
    public static void display(AddressBook book) {
        TreeIterator<Contact> iterator = book.getTree().iterator(); // Create iterator
        int i = 1; // Contact count
        // 3 Traversals
        iterator.setPreorder(); // Preorder Traversal
        System.out.println("Preorder:");
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            System.out.println("Contact #" + i);
            System.out.println(contact + "\n");
            i++; // Increment
        }
        i = 1; // reset count
        iterator.setInorder(); // Inorder Traversal
        System.out.println("Inorder:");
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            System.out.println("Contact #" + i);
            System.out.println(contact + "\n");
            i++; // Increment
        }
        i = 1; // reset count
        iterator.setPostorder(); // Postorder Traversal
        System.out.println("Postorder:");
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            System.out.println("Contact #" + i);
            System.out.println(contact + "\n");
            i++; // Increment
        }
    }
}
