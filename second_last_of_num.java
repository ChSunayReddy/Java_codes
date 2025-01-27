import java.util.*;
public class second_last_of_num {
        public static void main(String[] args){
            //write your code here
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            String b=Integer.toString(a);
            for (int i=0;i<b.length();i++){
                if (b.length()==1){
                    System.out.println(-1);
                }
                else if (i==(b.length())-2){
                    System.out.println(b.charAt(i));
                }
                else{
                    continue;
                }
            }
        
        }
}
