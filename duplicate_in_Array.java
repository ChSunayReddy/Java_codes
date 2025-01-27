import java.util.*;
public class duplicate_in_Array {
    public static ArrayList<Integer> duplicates(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> l=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr){
            if(!set.add(i)){
                l.add(i);
            }
        }
        if(l.isEmpty()) l.add(-1);
        ArrayList<Integer> L = new ArrayList<>(l);
        
        Collections.sort(L);
        return L;
    
        // public static ArrayList<Integer> duplicates(int[] arr) {
        //     ArrayList<Integer> l=new ArrayList<>();
        //     boolean found=false;
        //     for (int i=0;i<arr.length;i++){
        //         for (int j=0;j<arr.length;j++){
        //             if(i!=j && i<j){
        //             if(arr[i]==arr[j]){
        //                 l.add(arr[i]);
        //                 found=true;
        //                 break;
        //             }
        //             }
        //         }
                
                
        //     }
        //     if(found==false) l.add(-1);
        //     return l;
            // code here
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            ArrayList<Integer> p=duplicates(a);
            for (int i=0;i<p.size();i++){
                System.out.println(p.get(i));
            }
        }
    }

