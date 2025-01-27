public class Add_digits {
    public static int addDigits(int num) {
        int sum=0;
        while(num>9){
            int a=num;
            sum=0;
            while(a>0){
                sum=sum+a%10;
                a/=10;
            }
            num=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=38;
        System.out.println(addDigits(n));
    }
}