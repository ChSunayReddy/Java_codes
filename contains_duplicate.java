import java.util.HashSet;

public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n=new HashSet<>();
        for(int i:nums){
            if(n.contains(i)){
                return true;
            }
            n.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,5};
        System.out.println(containsDuplicate(nums));
    }
}
