import java.util.Scanner;
public class sort_colors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] nums=new int[a];
        for (int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]>nums[j]){
                    int c=nums[i];
                    nums[i]=nums[j];
                    nums[j]=c;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
