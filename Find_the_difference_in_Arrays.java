import java.util.*;
public class Find_the_difference_in_Arrays {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a={1,2,3};
        int[] b={2,4,6};
        System.out.println(s.findDifference(a, b));
    }
}
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i:nums1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        for(int i:map1.keySet()){
            if(!map2.containsKey(i)){
                l1.add(i);
            }
        }
        List<Integer> l2=new ArrayList<>();
        for(int i:map2.keySet()){
            if(!map1.containsKey(i)){
                l2.add(i);
            }
        }
        return Arrays.asList(l1,l2);
    }
}