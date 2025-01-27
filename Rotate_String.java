import java.util.*;
public class Rotate_String {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String goal=sc.nextLine();
    if(s.length()!=goal.length())
    System.out.println(false);
    String st=s+s;
    if(st.contains(goal)) System.out.println(true);
    else System.out.println(false);
//     String[] a=s.split("");
//     StringBuilder d=new StringBuilder();
//     Stack<String> l=new Stack<>();
//     Stack<String> tems=new Stack<>();
//     int c=0;
//     for (int t = 0; t < a.length; t++) {
//         d.setLength(0);
//         for (int i = 0; i < a.length; i++) {
//             if (i < t) {
//                 l.push(a[i]);
//             } else {
//                 d.append(a[i]);
//             }
//         }
//         while (!l.isEmpty()) {
//             tems.push(l.pop());
//         }
//         while (!tems.isEmpty()) {
//             d.append(tems.pop());
//         }
//         if (goal.equals(d.toString())) {
//             c = 1;  
//             break;
//         }
//     }

//     System.out.println(c == 1);
sc.close();    
}
    
}
