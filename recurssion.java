// public class recurssion {
//     public static void md(int n){
//         if (n>0){
//             md(n-1);
//             System.out.println(n);
//             md(n-1);
//         }
//     }
//     public static void main(String[] args){
//         md(3);
//     }
// }
public class recurssion {
    public static void md(int n){
        if (n>0){
            System.out.println(n);
            md(n-1);
        }
    }
    public static void main(String[] args){
        md(3);
    }
}
