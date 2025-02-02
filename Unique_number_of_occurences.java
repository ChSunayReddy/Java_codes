import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unique_number_of_occurences {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,2,2,1,1,3};
        System.out.println(s.uniqueOccurrences(arr));
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(Integer i:h.values()){
            if(l.contains(i)){
                return false;
            }
            else{
                l.add(i);
            }
        }
        return true;
    }
}