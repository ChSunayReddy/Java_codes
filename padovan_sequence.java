import java.util.*;
public class padovan_sequence {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int[] b=new int[a+1];
            for (int i=0;i<a+1;i++){
                if (i<3){
                    b[i]=1;
                }
                else {
                    b[i]=b[i-2]+b[i-3];
            }
            
        }
        for (int i:b){
            System.out.print(i+" ");
        }
        }
}
