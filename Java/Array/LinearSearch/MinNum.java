package Array.LinearSearch;

public class MinNum {
    public static void main(String[] args) {
        int[] arr={18,1,-22,-7,14};
        System.out.println(findMin(arr));
    }
    static int findMin(int arr[]){
        int temp=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
