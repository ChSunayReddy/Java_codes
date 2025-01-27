import java.util.*;
public class zigzag_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        if (n == 1 || n >= s.length()) System.out.println(s);;
        StringBuilder[] rows = new StringBuilder[Math.min(n, s.length())];
        for (int i = 0; i < rows.length; i++) rows[i] = new StringBuilder();
        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[curRow].append(c);
            if (curRow == 0 || curRow == n - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        System.out.println(result.toString());
    }
}
        // StringBuilder s=new StringBuilder();
        // if(n==1) System.out.println(a);
        // int add=0;
        // int inc=1;
        // for(int i=0;i<a.length();i++){
        //     s.insert(add,a.charAt(i));
        //     if(add==0) inc=1;
        //     else if(add==n-1) inc=-1;
        //     add+=inc;

        // }
        // System.out.println(s.toString());
    
