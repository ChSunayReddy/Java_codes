
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Third_max {
    public static int thirdMax(int[] nums) {
        if(nums.length<=2){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        return max;
        }
        else{
            HashSet<Integer> a=new HashSet<>();
            for(int i:nums){
                a.add(i);
            }
            List<Integer> l=new ArrayList<>(a);
            Collections.sort(l,Collections.reverseOrder());
            if(l.size()>=3) return l.get(2);
            else return l.get(0);
        }
    }
    public static void main(String[] args) {
        int[] n={3,2,2,1};
        System.out.println(thirdMax(n));
    }
}
