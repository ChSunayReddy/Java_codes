class Check_if_Array_sorted_and_Rotated{
    public static void main(String[] args) {
        int[] a={3,4,5,1,2};
        System.out.println(check(a));
    }
    public static boolean check(int[] nums) {
        int i=0;
        int c=0;
        while(i<nums.length){
            if(nums[i]>nums[(i+1)%nums.length]){
                c++;
            }
            i++;
        }
        return c<=1;
    }
}