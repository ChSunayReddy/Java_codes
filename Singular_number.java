public class Singular_number {
    public static int singleNumber(int[] nums) {
        //HashSet<Integer> n=new HashSet<>();
        int r=0;
        for(int i:nums){
            r^=i;   //XOR series
        }
        return r;
    }
    public static void main(String[] args) {
        int[] n={1,1,4,5,4};
        System.out.println(singleNumber(n));
    }
}
