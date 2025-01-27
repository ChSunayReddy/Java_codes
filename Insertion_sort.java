import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            int x=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>x){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
        for (int i=0;i<n;i++){
            if (i==n-1){
            System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}
