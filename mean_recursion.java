import java.util.*;
public class mean_recursion {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        
        double mean=Meanarray(arr,n);
        String num= String.format("%.2f", mean);
        //double round1=Math.round(mean*100.0)/100.0;
        System.out.println(num);
        }
        public static double Meanarray(int[] arr,int n){
            if (n==1){
                return arr[0];
            }
            double summinus1=sum(arr,n-1);
            return ((summinus1+arr[n-1])/n);
        }
        public static double sum(int[] arr, int n) {
            
            if (n == 1) {
                return arr[0];
            }
            return sum(arr, n - 1) + arr[n - 1];
            
        }
}
