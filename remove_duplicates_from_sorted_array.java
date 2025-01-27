
import java.util.Scanner;

public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        remove_duplicates_from_sorted_array l=new remove_duplicates_from_sorted_array();
        System.out.println(l.removeDuplicates(a));
    }
}
