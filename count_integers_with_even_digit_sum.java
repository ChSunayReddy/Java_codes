public class count_integers_with_even_digit_sum {
    public static void main(String[] args) {
        int n=4;
        int c=0;
        while(n>0){
            if(n<=9){
                if(n%2==0) c++;
            }
            else {
                int a=n;
                int s=0;
                while(a>=1){
                    int r=a%10;
                    s+=r;
                    a=a/10;
                }
                if(s%2==0) c++;
            }
            n-=1;
        }
        System.out.println(c);
    }
}
