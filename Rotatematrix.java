package Arrays;
import java.util.Scanner;

public class Rotatematrix {
    static void printarr(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void TransposeInPlace(int [][] arr,int row, int col){
        for(int i = 0;i<row;i++){
            for(int j =i;j<col;j++){
             int temp = arr[i][j];
             arr[i][j] = arr[j][i];
             arr[j][i] = temp;
        }
        }
        }
        static void reverseArr(int [] arr){
        int i = 0 , j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        }
    static void rotate(int [][]arr,int n){
           //transpose
           TransposeInPlace(arr,n,n);
           //reverse the array 
           for(int i =0;i<n;i++){
            reverseArr(arr[i]);
           }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols:");
      int r = sc.nextInt();
      int c = sc.nextInt();
      int arr[][] = new int[r][c];
      int totalElements = r*c;
      System.out.println("Enter total: "+totalElements);
      for(int i =0;i<r;i++){
        for(int j =0;j<c;j++){
            arr[i][j] = sc.nextInt();
        }
      }
      System.out.println("Input matrix is: ");
      printarr(arr);
      rotate(arr,r);
      System.out.println("Rotated matrix is: ");
      printarr(arr);
      sc.close();
    }
}
