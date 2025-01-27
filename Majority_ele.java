import java.util.Arrays;

public class Majority_ele {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
        
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,5,5,5};
        System.out.println(majorityElement(a));
    }
}
