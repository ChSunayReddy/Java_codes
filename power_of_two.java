public class power_of_two {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n<=2) return true;
        if(n%2!=0) return false;
        else if(n%2==0){
            while(n!=2){
                n/=2;
                if(n%2!=0) return false;
            }
        }
        return n==2;
    }
    public static void main(String[] args) {
        int n=2048;
        System.out.println(isPowerOfTwo(n));
    }
}
