import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * Contains the helper methods for the array-based ADT Bag.
 * @author Adam Khoukhi
 * @version 1.0
 */
public class Helper {
    /**
     * Displays and tests the array-based ADT Bag. 
     * @throws FileNotFoundException If file is not found 
     */
    public static void start() throws FileNotFoundException{
        MyBagClass testBag = new MyBagClass();
        // Create a fill the testBag
            fillBag(testBag);
        
        //  Display the items in the bag
            displayBag(testBag);

            // Tests method insert: inserts an item
            testBag.insert("Cheese");

            // Tests method removeLast: removes the last an item
            testBag.removeLast();

            // Tests method removeRandom: removes a random an item
            testBag.removeRandom();  
            
            // Tests method getFirstOccurrence: gets first occurrence an item
            System.out.println(testBag.getFirstOccurrence("Pizza")); 

            // Tests method getAtSpecifiedIndex: gets item at specified index
            System.out.println(testBag.getAtSpecifiedIndex(3));

            // Tests method size: returns the size the bag
            System.out.println("There are " + testBag.size() + " items in the bag.");

            // Tests method isEmpty: returns whether the list is Empty or not
            System.out.println(testBag.isEmpty());

            // Tests method makeEmpty: removes all the items in the bsg
            testBag.makeEmpty();
            System.out.println("There are " + testBag.size() + " items in the bag.");
    }

    /**
     * Creates a bag of items.
     * @param testBag A reference to a bag of items 
     * @throws FileNotFoundException
     */

    private static void fillBag(MyBagClass testBag) throws FileNotFoundException{
        // Reads the txt file in
        File dataTest = new File("datalist.txt");
        Scanner input = new Scanner(dataTest);
        while(input.hasNext() && testBag.size() < 100){
            testBag.insert(input.nextLine());
        }
        input.close();
    }

    /**
     * Displays the items in the bag in order.
     * @param testBag A reference to a bag of items 
     */
    private static void displayBag(MyBagClass testBag){
        // Goes through the bag and outputs each item
        for(int i = 0; i< testBag.size(); i++){
            testBag.getAtSpecifiedIndex(i);
        }

    }
    
}
