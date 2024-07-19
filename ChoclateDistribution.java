package Arrays;
public class ChoclateDistribution {
    public static void distribution(int arr[],int m){
        if(arr.length == 0 || m==0){
            System.out.println("not a valid array");
        }
        for(int i = 0;i<arr.length;i++){
             for( int j =i;j<arr.length;j++){
                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
             }
             if(arr[i]==m){
               int prev = arr[i-1];
               int next = arr[i+1];
               int difference = next -prev;
               System.out.println("The difference is:"+difference);
             }
        }
       
    }
        
    public static void main(String args[]){
        int arr[] = {3,5,9,2,7};
        distribution(arr,3);
    }
}
