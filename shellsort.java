import java.util.*;
class Shellsort{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Shellsort(arr);
        for(int i=0; i<n;i++){
            if(i == n-1){
            System.out.print(arr[i]);
            }
            else{
            System.out.print(arr[i] + ", ");}
        }
    }
    public static void Shellsort(int[] arr){
        int n=arr.length;
        for (int gap=n/2;gap>0;gap/=2){
            for (int i=gap;i<n;i++){
                int temp=arr[i];
                int j;
                for (j=i;j>=gap && arr[j-gap]>temp;j-=gap){
                arr[j]=arr[j-gap];
                }
                    arr[j]=temp;
                
            }
        }
    }
}