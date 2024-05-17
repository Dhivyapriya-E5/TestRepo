import java.util.HashSet;
import java.util.Set;

public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9};

        // Create a set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Add each element to the set
        for (int element : inputArray) {
            uniqueElements.add(element);
        }

        // Print the unique elements
        for (int uniqueElement : uniqueElements) {
            System.out.print(uniqueElement + " ");
        }
    }
}
