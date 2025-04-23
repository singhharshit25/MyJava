package Array.BinarySearch;
public class FirstAndLastOfInfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30,33};
        int target = 33;
       System.out.println(ans(arr,target));
    }
    public static int ans(int arr[],int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart  = end +1;
            end = end +(end- start +1)*2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }
    public static int search(int arr[],int target,int start,int end) {
            while(start<=end){
               int mid =(start+end)/2;
                if(target>arr[mid]){
                   start= mid+1;
               }
               else if(target<arr[mid]){
                   end= mid-1;
               }else{
                return mid;
               }
            }
            return 1;
    }
}
