import java.util.*;
public class odd_pattern {
    public static void main(String[] args) {
        int numRows = 4; 
        generatePrimePattern(numRows);
    }

    public static void generatePrimePattern(int numRows) {
        List<Integer> primes = new ArrayList<>();
        int primesNeeded = numRows * (numRows + 1) / 2; 
        int num = 2;
        while (primes.size() < primesNeeded) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        int index = 0; 
        for (int row = 1; row <= numRows; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(primes.get(index) + " ");
                index++;
            }
            System.out.println(); 
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}