import java.util.*;
public class Linear_search {
     public static int linears(int[] arr,int key,int i){
            if (i>arr.length-1) return -1; 
            if(arr[i]==key)  return i;
            return  linears(arr,key,i+1);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int c=0;
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
            int key=sc.nextInt();
            int s=linears(arr,key,0);
            System.out.println(s);
        }
}
