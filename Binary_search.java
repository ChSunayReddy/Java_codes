import java.util.*;
public class Binary_search {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
        }
        Arrays.sort(arr);
        int key=sc.nextInt();
        int l=0;
        int r=n-1;
        int result=bs(arr,l,r,key);
        System.out.println(result);
        }
        public static int bs(int[] arr,int l,int r,int key){
            if (l>r){
              return -1;
            }
            int mid=(l+r)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key){
                return bs(arr,mid+1,r,key);
            }
            else {
                return bs(arr,l,mid-1,key);
            }
           
        
    }
}
