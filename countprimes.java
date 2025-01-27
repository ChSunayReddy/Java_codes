public class countprimes {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0; 
        }

        int[] prime = new int[n];
        int count = 0;

        for (int i = 2; i * i < n; i++) {
            if (prime[i] == 0) { 
                for (int j = i * i; j < n; j += i) {
                    prime[j] = 1; 
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i] == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("Number of primes less than " + n + " is: " + countPrimes(n));
    }
}
