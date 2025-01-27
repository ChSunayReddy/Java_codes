public class can_array_sorted {
    public static void main(String[] args) {
    int[] nums={8,4,2,30,15};
    int prevMax = Integer.MIN_VALUE;
    int currMax = nums[0];
    int currMin = nums[0];
    int setBits = Integer.bitCount(nums[0]);
    for(int i=1; i<nums.length; i++)
    {
     if(setBits==Integer.bitCount(nums[i]))
     {
       currMax = Math.max(currMax, nums[i]);
       currMin = Math.min(currMin, nums[i]);   
     }
     else{
           if(currMin<prevMax)
           System.out.println(false);
           prevMax = currMax;
           setBits = Integer.bitCount(nums[i]);
           currMin = nums[i];
           currMax = nums[i];
     }
     
    }
      System.out.println(currMin>prevMax);
      System.out.println(currMax+" "+ currMin+" "+ prevMax);
    //     int cnt=0;
    //     for(int i=0;i<a.length;i++){
    //         for (int j=i+1;j<a.length-1;j++){
    //         if(Integer.bitCount(a[i])==Integer.bitCount(a[i+1])){
    //             if(a[i]>a[j]){
    //             int temp=a[i];
    //             a[i]=a[j];
    //             a[j]=temp;
    //             cnt++;
    //             }
    //             else continue;
    //         }
    //         else{ 
    //         System.out.println(false);
    //          break;
    //         }
    //     }
    // }
        }
}
