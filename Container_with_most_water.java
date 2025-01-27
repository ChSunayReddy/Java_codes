import java.util.Scanner;
public class Container_with_most_water {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=0;
        while(l<r){
            int a=r-l;
            int min=Math.min(height[l],height[r]);
            int currentArea=a*min;
            
            maxArea=Math.max(maxArea,currentArea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] h=new int[n];
        for (int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        Container_with_most_water k=new Container_with_most_water();
        System.out.println(k.maxArea(h));
        sc.close();
    }
}
