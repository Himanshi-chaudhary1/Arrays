package Arrays;
import java.util.Scanner;

public class TransposeofMatrx {
    static void printMatrix(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int [][] matrix,int row, int col){
        int ans [][]=new int[row][col];
        for(int i = 0;i<col;i++){
            for(int j =i;j<row;j++){
            ans[i][j] = matrix[j][i];
        }
        }
        return ans;
        }
    static void TransposeInPlace(int [][] matrix,int row, int col){
    for(int i = 0;i<row;i++){
        for(int j =i;j<col;j++){
         int temp = matrix[i][j];
         matrix[i][j] = matrix[j][i];
         matrix[j][i] = temp;
    }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix [][] = new int[row][col];
        int total = row*col;
        System.out.println("Enter total elements "+total);
        for(int i = 0; i<row;i++){
            for(int j = 0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);
        System.out.println("Transpose of matrix: ");
        TransposeInPlace(matrix,row,col);
        printMatrix(matrix);  
        sc.close();
    }
}
