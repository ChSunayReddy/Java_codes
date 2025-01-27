import java.util.*;
public class num_raised_to_its_reverse {
    private static final int MOD = 1000000007;
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            int N = Integer.parseInt(parts[0]);
            int R = Integer.parseInt(parts[1]);
            long result = modularExponentiation(N, R, MOD);
            System.out.println(result);
            scanner.close();
        }
        private static long modularExponentiation(int base, int exponent, int mod) {
            long result = 1;
            long baseLong = base % mod;
            
            while (exponent > 0) {
                if ((exponent % 2) == 1) { 
                    result = (result * baseLong) % mod;
                }
                baseLong = (baseLong * baseLong) % mod; 
                exponent /= 2; 
            }
            
            return result;
        }
    
}
