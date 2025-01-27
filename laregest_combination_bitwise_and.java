
public class laregest_combination_bitwise_and {
    public static void main(String[] args) {
        int[] candidates={16,17,71,62,12,24,14};
        int ans=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int j:candidates){
                if((j & (1<<i))!=0) c++;
            }
            ans=Math.max(ans, c);
        }
        System.out.println(ans);
        // for(int i=0;i<a.length;i++){
        //     List<Integer> l=new ArrayList<>();
        //     l.add(a[i]);
        //     for(int j=i+1;j<a.length;j++){
        //         l.add(a[j]);
        //         System.out.println(l);
        //     }
            
        // }
    }
}
