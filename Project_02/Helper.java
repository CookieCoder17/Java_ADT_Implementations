import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Contains the helper methods for the LinkedString class
 * @author Adam Khoukhi
 * @version 1.0
 */

public class Helper {

    /**
     * Displays and tests the linkedString.
     * @throws FileNotFoundException If file is not found
     */
    public static void start() throws FileNotFoundException {
        ArrayList<LinkedString> mylist = new ArrayList<LinkedString>();
        create(mylist); // adds a list of LinkedString objects into the array list
        displayAndMore(mylist); // displayAndMore uses the list to test other methods
    }

    /**
     * Adds the LinkedString from the text file into an ArrayList
     * @param list A reference to an Array List
     * @throws FileNotFoundException If file is not found
     */
    public static void create(ArrayList<LinkedString> list) throws FileNotFoundException {
        File myFile = new File("datalist.txt");
        Scanner input = new Scanner(myFile);
        int i = 0;
        while (input.hasNextLine()) {
            if (i % 2 == 0) {
                LinkedString myLinkedString = new LinkedString(input.nextLine());
                list.add(myLinkedString);
            } else {
                LinkedString myLinkedString = new LinkedString(input.nextLine().toCharArray());
                list.add(myLinkedString);
            }
            i++;
        }
        input.close();
    }

    /**
     * Tests the methods implemented in the LinkedString class
     * @param list A reference to an Array List
     */
    public static void displayAndMore(ArrayList<LinkedString> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i).isEmpty() && list.get(i + 1).isEmpty()); // Tests the isEmpty method
            System.out.println(list.get(i).length() + " " + list.get(i + 1).length()); // Tests the length method
            System.out.println(list.get(i).charAt(0) + " " + list.get(i + 1).charAt(0)); // Tests the charAt method
            System.out.println(list.get(i).substring(0, 1) + " " + list.get(i + 1).substring(0, 1)); // Tests the substring method
            System.out.println(list.get(i).equals(list.get(i+1))); // Tests the equals method
            System.out.println(list.get(i).concat(list.get(i + 1))); // Tests the concat method
        }
    }
}
