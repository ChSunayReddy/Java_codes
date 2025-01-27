public class Spiral {
    public static void main(String[] args) {
        int n=5;
        int[][] m=new int[n][n];
        
        int l=0,r=n-1,t=0,b=n-1,num=1;
        while(l<=r && t<=b){
        for (int i=l;i<=r;i++){
            m[t][i]=num++;
        }
        t++;
        for(int i=t;i<=b;i++){
            m[i][r]=num++;
        }
        r--;
        if(t<=b){
            for(int i=r;i>=l;i--){
                m[b][i]=num++;
            }
            b--;
        }
        if(l<=r){
            for(int i=b;i>=t;i--){
                m[i][l]=num++;
            }
            l++;
        }
    }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
