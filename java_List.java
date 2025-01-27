import java.util.*;
public class java_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            l.add(a);
        }
        int s=sc.nextInt();
        for (int i=0;i<s;i++){
            sc.nextLine();
            String fun=sc.nextLine().trim();
            if (fun.equals("Insert")){
                int ind=sc.nextInt();
                int num=sc.nextInt();
                l.add(ind,num);
            }
            if(fun.equals("Delete")){
                int ind=sc.nextInt();
                l.remove(ind);
            }
        }
        for (int i:l){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
