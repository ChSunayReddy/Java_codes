import java.util.*;

    public class Desend_insert_sort {
    
        public static void main(String[] args) {
            // Original list of integers
            int[] arr = {12, 9, 3, 14, 5, 66, 7, 80, 9, 10};
    
            // Perform Insertion Sort in descending order
            insertionSortDescending(arr);
    
            // Print the sorted array
            System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
        }
    
        // Insertion Sort function to sort in descending order
        public static void insertionSortDescending(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];  // Element to be inserted
                int j = i - 1;
    
                // Shift elements of arr[0..i-1] that are smaller than key to the right
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                } 
    
                // Insert the key at the correct position
                arr[j + 1] = key;
            }
        }
    }