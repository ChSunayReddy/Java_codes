import java.util.*;

class Quick_sort {
    static void QS(int[] arr, int l, int h) {
        if (l<h) {
            int j = Partition(arr, l, h);
            QS(arr, l, j - 1); // Sort left side of pivot
            QS(arr, j + 1, h); // Sort right side of pivot
        }
    }

    static int Partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l + 1; // Start from the next element after pivot
        int j = h;

        while (i <= j) {
            // Find the first element greater than the pivot
            while (i <= h && arr[i] <= pivot) {
                i++;
            }
            // Find the first element less than or equal to the pivot
            while (j > l && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j); // Swap elements out of order
            }
        }
        swap(arr, l, j); // Place pivot in the correct position
        return j; // Return pivot index
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        QS(arr, 0, n - 1);
        
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        sc.close();
    }
}