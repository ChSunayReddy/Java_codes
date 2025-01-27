import java.util.*;
public class min_steps_string_beauty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        int d=f.length();
        int cnt=0;
        if(d%2!=0) System.out.println(-1);
        else {
            for(int i=0;i<d-1;i+=2){
                if(f.charAt(i)!=f.charAt(i+1)) cnt++;
        }
        
        System.out.println(cnt);
        }
        sc.close();
    }
}
