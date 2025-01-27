import java.util.*;
public class Leaders_in_array {
    public static List<Integer> findLeaders(int[] arr) {
            int n = arr.length;
            List<Integer> leaders = new ArrayList<>();
            
            if (n == 0) {
                return leaders;
            }
            
            int maxFromRight = arr[n - 1];
            leaders.add(maxFromRight);
    
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] >= maxFromRight) {
                    leaders.add(arr[i]);
                    maxFromRight = arr[i];
                }
            }
    
            Collections.reverse(leaders);
            return leaders;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            scanner.nextLine();  
            String[] input = scanner.nextLine().split(", ");
            int[] arr = new int[input.length];
            
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            List<Integer> leaders = findLeaders(arr);
            for (int i = 0; i < leaders.size(); i++) {
                System.out.print(leaders.get(i));
                if (i < leaders.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
}
