
import java.util.LinkedList;

public class RemoveLL {
    
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 6, 4, 5, 6, 7};
        LinkedList<Integer> li = new LinkedList<>(); // Create a LinkedList of integers
        
        // Populate the LinkedList with elements from the array
        for (int i = 0; i < a.length; i++) {
            li.add(a[i]);
        }

        
        
        // Print the elements of the LinkedList to the console
        for (int i = 0; i < li.size(); i++) {
            
            System.out.print(li.get(i) + " ");
        }
    }
}
