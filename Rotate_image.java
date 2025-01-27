public class Rotate_image {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               // matrix[i][j]=matrix[n-j-1][i];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
               // matrix[i][j]=matrix[n-j-1][i];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
        for(int[] i:matrix){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] m={{1,2,3},{4,5,6},{7,8,9}};
        rotate(m);
    }
}