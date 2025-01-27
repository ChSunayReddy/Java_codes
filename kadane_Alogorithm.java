import java.util.*;
public class kadane_Alogorithm {
    // public static int maxSubarraySum(int[] arr) {
    //     int maxTill = arr[0], currentmax = 0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         currentmax+=arr[i];
    //         if(currentmax>maxTill)
    //         {
    //             maxTill = currentmax;
    //         }
    //         if(currentmax<0) currentmax=0;
    //     }
    //     return maxTill;
    //     // Your code here
    // }
    public static int sum(List<Integer> arr){
        int c=0;
        for (int i=0;i<arr.size();i++){
            c+=arr.get(i);
        }
        return c;
    }
    public static int maxnum(List<Integer> arr){
        int k=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>k){
                k=arr.get(i);
            }
        }
        return k;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // System.out.println(maxSubarraySum(a));
        ArrayList<Integer> max1=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                ArrayList<Integer> l=new ArrayList<>();
                
                for (int k=i;k<j;k++){
                    l.add(a[k]);
                }
                max1.add(sum(l));
        }
        }
        System.out.println(maxnum(max1));
    sc.close();
    }
}

