import java.util.*;
public class String_compression_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder l=new StringBuilder();
        char w=s.charAt(0);
        int c=1;
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i)==w && c<9) 
            {
                c++;
            }
            else{
                l.append(c).append(w);
                w=s.charAt(i);
                c=1;
            }
        }
        l.append(c).append(w);
        System.out.println(l.toString());
    }

    //     String[] a=s.split("");
    //     StringBuilder l=new StringBuilder();
    //     String w=a[0];
    //     int c=1;
    //     for (int i = 1; i < a.length; i++){
    //         if(a[i].equals(w) && c<9) 
    //         {
    //             c++;
    //         }
    //         else{
    //             l.append(c).append(w);
    //             w=a[i];
    //             c=1;
    //         }
    //     }
    //     l.append(c).append(w);
    //     System.out.println(l.toString());
    // }
}
