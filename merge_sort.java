import java.util.*;
public class merge_sort {
    public static void ms(int[] a,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            ms(a,left,mid);
            ms(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }
    public static void merge(int[] a,int low,int mid,int high){
        int[] b=new int[a.length];
        int k=low,i=low,j=mid+1;
        while(i<=mid && j<=high){
            if(a[i]<=a[j]) b[k++]=a[i++];
            else if(a[i]>a[j]) b[k++]=a[j++];
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=high){
            b[k++]=a[j++];
        }
        for(int x=low;x<=high;x++){
            a[x]=b[x];
        }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
                ms(arr, 0, arr.length - 1);
        
                System.out.println("Sorted array:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
    }

