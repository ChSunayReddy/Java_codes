import java.util.HashSet;

class max_num_2554{
    public static int maxCount(int[] banned, int n, int maxSum) {
        int c=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i:banned) s.add(i);

        int ms=0;
        for(int i=1;i<=n;i++){
            if(!s.contains(i) ){
                ms+=i;
               if(ms<=maxSum){
                c++;
               }
            }
        }
        return c;
    }
    public static int sum(int arr[]){
        int m=0;
        for(int i:arr){
            m+=i;
        }
        return m;
    }
    public static void main(String[] args) {
        int[] b={1,6,5};
        int n=5;
        int m=6;
        System.out.println(maxCount(b, n, m));
    }
}