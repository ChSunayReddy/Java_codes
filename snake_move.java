public class snake_move {
    public static void main(String[] args) {
        String[] s={"Right","Down"};
        int a=5;
        int n=0;
        int[][] arr=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=n++;
            }
            
        }
        for(int i=0;i<a;i++){
            for(int j:arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int p1=0;
        int p2=0;
        int pos=arr[p1][p2];
        for(String i:s){
            if(i.equals("Right")){
                p2++;
            }
            else if(i.equals("Left")){
                p2--;
            }
            else if(i.equals("Down")){
                p1++;
            }
            else if(i.equals("Up")){
                p1--;
            }
        }
        System.out.println(arr[p1][p2]);
        
    }
}
