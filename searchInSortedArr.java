package Arrays;
public class searchInSortedArr {
    static int searchElement(int arr[],int target){
        int n = arr.length-1;
        int low = arr[0];
        int high = arr[n];
        int mid = (high+low)/2;
        if(target < mid){
            for(int i=0;i<mid;i++){
                if(target == arr[i]){
                    System.out.println(i);
                 }
            }
        }
           for(int j=mid;j<=n;j++){
            if(target == arr[j]){
               System.out.println(j);
            }
           }
           return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target = 3;
        searchElement(arr, target);
    }
}
