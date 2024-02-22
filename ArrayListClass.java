// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {

    // Make a collection
    @SuppressWarnings("rawtypes")
    ArrayList cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}