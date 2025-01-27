import java.util.*;
class sand_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int count=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
                
            }
            for (int j=i;j<n;j++){
                System.out.print(num+" ");
                if (num==0) {
                    num=9;
                    count++;
                }
                else if (num>=9) {
                    num=0;
                    count++;
                }
                else if (num <9 ){
                    num++;
                    count++;
                }

            }
            System.out.println();
        }
        int nums=num;
        int c=0;
        for(int i=n-1;i>0;i--){
            for (int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                if (n>=4){
                System.out.print(nums+" ");
                if (nums==0 && c<count-10){
                    nums=9;
                    c++;
                }
                else if(nums==9 && c<count-10){
                    nums=0;
                    c++;
                }
                else if (c>=count-10 && nums>0 && nums<=9){
                    nums--;
                }
                
                }
                else{
                    System.out.print(nums-2+" ");
                    nums--;
                }
            }
            System.out.println();
        }
    }
}