import java.util.*;
public class Interpolation_search {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
        }
        int key=sc.nextInt();
        int result=is(arr,0,n-1,key);
        System.out.println(result);
        }
        public static int is(int[] arr,int l,int h,int key){
            if (l <= h && key >= arr[l] && key <= arr[h]) {
            int i=l+((key-arr[l])*(h-l))/(arr[h]-arr[l]);
            if (arr[i]==key){
                return i;
            }
            else if (arr[i]>key){
                return is(arr,l,i-1,key);
            }
            else{
                return is(arr,i+1,h,key);
            }
            }
            return -1;
        }
}
