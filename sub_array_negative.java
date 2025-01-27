import java.util.*;
public class sub_array_negative {
    public static int sum(List<Integer> arr){
        int c=0;
        for (int i=0;i<arr.size();i++){
            c+=arr.get(i);
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                ArrayList<Integer> l=new ArrayList<>();
                for (int k=i;k<j;k++){
                    l.add(a[k]);
                }
                if (sum(l)<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    sc.close();
    }
    
}
