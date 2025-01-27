import java.util.*;
public class fibonacci_search {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int key = sc.nextInt(); 
            int[] fib = new int[n * 2]; 
            fib[0] = 0;
            fib[1] = 1;
            
            for (int i = 2; i < n * 2; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            int k = 0;
            while (fib[k] < n)  k++;
    
            int result = fibSearch(arr, fib, n, key, k);
            System.out.println(result);
            
        }
        
        public static int fibSearch(int[] arr, int[] fib, int n, int key, int k) {
            int offset = -1;
            while (k > 1) {
                int i = Math.min(offset + fib[k - 2], n - 1);
    
                if (i < n && arr[i] == key) {
                    return i;
                } else if (i < n && arr[i] < key) {
                    k--; 
                    offset = i; 
                } else {
                    k -= 2;
                }
            }
    
    
            // if (k == 1 && offset + 1 < n && arr[offset + 1] == key) {
            //     return offset + 1; 
            // }
    
            return -1;
        }
    }
