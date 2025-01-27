import java.util.*;
class Main{
    public static void main(String[] args){
        //write your code here
        int a,b,c,d,e,C,D;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a%10;
        d=b%10;
        C=Math.abs(c);
        D=Math.abs(d);
        System.out.println(C+D);
    }
}