import java.util.*;
public class exact_multiple {
    public static void main(String[] args){
            //write your code here
            int c,d;
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            c=Math.abs(a);
            d=Math.abs(b);
            
            if ((a==0) || (b==0)){
                System.out.println(3);
            }
            else if (c%d==0){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
}
