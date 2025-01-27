import java.util.*;
public class combine_String {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            String a=sc.next();
            String b=sc.next();
            if (a.length()<=b.length()){
            System.out.println(a+b+a);
            }
            else if (a.length()>b.length()){
                System.out.println(b+a+b);
                }
        }
}
