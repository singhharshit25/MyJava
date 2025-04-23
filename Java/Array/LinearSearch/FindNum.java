package Array.LinearSearch;

public class FindNum {
    public static void main(String[] args) {
        int n[]={18,5,14,16,23};
        int target = 16;
        linearSearch(n, target);
        System.out.print(linearSearch(n, target));
    }

    static int linearSearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index = 0; index<arr.length;index++){
            if(arr[index]==target){
                return target;
            }
        }
        return -1;
    }
}
