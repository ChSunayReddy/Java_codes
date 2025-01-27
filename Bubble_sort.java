import java.util.*;
public class Bubble_sort {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n-1;i++){
                for (int j=0;j<n-i-1;j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
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
