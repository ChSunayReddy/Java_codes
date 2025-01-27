import java.util.*;
public class Even_or_Odd {
    public static void main(String[] args){
            //write your code here
            int a,b,c,d,e,count=0;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            e=sc.nextInt();
            String f=sc.next();
            int[] arr={a,b,c,d,e};
            if (f.equals("even")){
                for (int i:arr){
                    if (i%2==0) count++;
                }
            }
            else if (f.equals("odd")){
                for (int i:arr){
                    if (i%2!=0) count++;
                }
            }
            System.out.println(count);
        }
}
