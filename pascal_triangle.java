import java.util.*;
public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int value = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); 
            }
            System.out.println();
        }
    }
}
// class Solution {
//     public List<List<Integer>> generate(int n) {
//         //List<List<Integer>> arr = new ArrayList<List<Integer>>();
//         List<List<Integer>> triangle = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             List<Integer> row = new ArrayList<>();
//             row.add(1); 
//             for (int j = 1; j < i; j++) {
//                 row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
//             }
//             if (i > 0) {
//                 row.add(1);
//             }
//             triangle.add(row);
//         }
        
//         return triangle;
//         // List<Integer> ns=new ArrayList<Integer>();
//         // for(int i=0;i<=n;i++){
//         //     int nums=1;
//         //     for(int j=0;j<=n;j++){
//         //         ns.add(j,nums);
//         //         nums=nums*(i-j)/(j+1);
//         //     }
//         //     arr.add(ns);
//         // }
//         // return arr;
//     }
// }
        // for (int i=n;i>0;i--){
        //     for (int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=i;j<=n;j++){
        //         if((j==n) || (j==i)){

        //             System.out.print(1+" ");
        //         }
        //         else if ((j<k) || (j>i-1) ||(j==k-1)){
        //         System.out.print(num+1+" ");
        //         num++;
        //         }
        //         else{
        //             System.out.println(num);
        //         }
                
        //     }
        //     num=1;
        //     k++;
        //     System.out.println();
        // }
    
