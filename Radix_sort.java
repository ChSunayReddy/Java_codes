import java.util.*;
public class Radix_sort {
    static int getMax(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countingsort(int[] arr,int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++)   count[(arr[i]/exp)%10]++;
        for (int i=1;i<10;i++) count[i]+=count[i-1];
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }
    static void radixsort(int[] arr){
        int max=getMax(arr);
        for(int exp=1;max/exp>0;exp*=10){
            countingsort(arr, exp);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            radixsort(arr);

            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
            sc.close();
    }
}
