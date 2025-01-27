// Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive), find the missing element. The array is a permutation of size n with one element missing. Return the missing element.

// Examples:

// Input: n = 5, arr[] = [1,2,3,5]
// Output: 4
// Explanation : All the numbers from 1 to 5 are present except 4.
import java.util.*;
public class Missing_in_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n-1];
        for (int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int res=0;
        int arrsum=0;
        for (int i=1;i<=n;i++){
            res+=i;
        }
            for(int j:a){
                arrsum+=j;
            }
        System.out.println(res-arrsum);
    }
}
