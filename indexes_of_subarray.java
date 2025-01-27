// Given an unsorted array arr of size n that contains only non negative integers, find a sub-array (continuous elements) that has sum equal to s. You mainly need to return the left and right indexes(1-based indexing) of that subarray.

// In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.

// Examples:

// Input: arr[] = [1,2,3,7,5], n = 5, s = 12
// Output: 2 4
// Explanation: The sum of elements from 2nd to 4th position is 12.


import java.util.*;
public class indexes_of_subarray{
    public static int sum(List<Integer> arr){
        int c=0;
        for (int i=0;i<arr.size();i++){
            c+=arr.get(i);
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        boolean found=false;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                List<Integer> l=new ArrayList<>();
                for (int k=i;k<j;k++){
                    l.add(a[k]);
                }
                // System.out.println(l);
                if(sum(l)==s){
                    System.out.println(i+1+" "+j);
                    found=true;
                    break;
                }
                
        
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
        sc.close();
    }
}
// import java.io.*;
// import java.util.*;

// class IntArray {
//     public static int[] input(BufferedReader br, int n) throws IOException {
//         String[] s = br.readLine().trim().split(" ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

//         return a;
//     }

//     public static void print(int[] a) {
//         for (int e : a) System.out.print(e + " ");
//         System.out.println();
//     }

//     public static void print(ArrayList<Integer> a) {
//         StringBuilder sb = new StringBuilder();
//         for (int e : a) sb.append(e + " ");
//         System.out.println(sb);
//     }
// }

// class GFG {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int t;
//         t = Integer.parseInt(br.readLine());
//         while (t-- > 0) {
//             String str[] = br.readLine().trim().split(" ");

//             int n = Integer.parseInt(str[0]);
//             int s = Integer.parseInt(str[1]);

//             int[] arr = IntArray.input(br, n);

//             Solution obj = new Solution();
//             ArrayList<Integer> res = obj.subarraySum(arr, n, s);

//             IntArray.print(res);
//         }
//     }
// }
// class Solution {
//     public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
//         // code here 
//         int last = 0;
//         int start = 0;
//         long currsum = 0;
//         boolean flag = false;
//         ArrayList<Integer> res = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             currsum += arr[i];
//             if (currsum >= s) {
//                 last = i;
//                 while (s < currsum && start < last) {
//                     currsum -= arr[start];
//                     ++start;
//                 }

//                 if (currsum == s) {
//                     res.add(start + 1);
//                     res.add(last + 1);
//                     flag = true;
//                     break;
//                 }
//             }
//         }
//         if (!flag)
//             res.add(-1);
//         return res;
//     }
//     }
