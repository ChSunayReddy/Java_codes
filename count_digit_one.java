public class count_digit_one {
    public static  int countDigitOne(int n) {
        int c=0;
        if(n==0) return n;
        for(int i=1;i<=n;i++){
            String a=Integer.toString(i);
            for(char s:a.toCharArray()){
                if(s=='1'){
                    c++;
                }
            }
            // int a=i;
            // while(a>0){
            //     int rem=a%10;
            //     if(rem==1) c++;
            //     a/=10;
            // }
        // int count = 0;
        // for (long i = 1; i <= n; i *= 10) {
        //     long div = i * 10;
        //     long quotient = n / div;
        //     long remainder = n % div;
        //     count += quotient * i + Math.min(Math.max(remainder - i + 1, 0), i);
        // }
        // return count;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(countDigitOne(n));
    }
}