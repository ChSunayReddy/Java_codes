import java.util.*;
public class Selection_sort {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
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
