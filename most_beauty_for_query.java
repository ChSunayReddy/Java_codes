
import java.util.Arrays;

public class most_beauty_for_query {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,2},{2,4},{5,6},{3,5}};
        int[] query={1,2,3,4,5,6};
        int n=query.length;
        int[] re=new int[n];
        int[][] queryindex=new int[n][2];
        for(int i=0;i<n;i++){
            queryindex[i][0]=query[i];
            queryindex[i][1]=i;
        }
        Arrays.sort(queryindex, (a, b)->a[0]-b[0]);
        Arrays.sort(arr, (a, b)->a[0]-b[0]);
        int maxbeauty=0;
        int itemindex=0;
        for(int i=0;i<n;i++){
            // int currIndex=queryindex[i][1];
            int currprice=queryindex[i][0];
            while(itemindex<arr.length && currprice>=arr[itemindex][0]){
                maxbeauty=Math.max(maxbeauty,arr[itemindex][1]);
                itemindex++;
            }
            re[i]=maxbeauty;
        }
        // for(int i=0;i<arr.length;i++){
        //     for(int j:arr[i]){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(int i:re){
            System.out.print(i+" ");
        }
    }
}
