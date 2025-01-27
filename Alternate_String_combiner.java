import java.util.*;
public class Alternate_String_combiner {
    public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            String a=sc.next();
            String [] b=a.split(",");
            int A=b[0].length();
            int B=b[1].length();
            int c=Math.min(A,B);
            String n="";
            for (int i=0;i<c;i++){
                n+=b[0].charAt(i);
                n+=b[1].charAt(i);
            }
            if (A>B){
                for (int i=B;i<A;i++){
                    n+=b[0].charAt(i);
                }
            }
            else if (B>A){
                for (int i=A;i<B;i++){
                    n+=b[1].charAt(i);
                }
            }
            System.out.println(n);
        }
}
