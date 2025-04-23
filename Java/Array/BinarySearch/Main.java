package Array.BinarySearch;


public class Main
{
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,7,8,10,11,12,15,20,23,30,33};
		int target = 15;
		int start = 0;
		int end =1;
		while(target>arr[end]){
            int newstart = end +1;
            end = end + (end-start+1)*2;
            start = newstart;
		}
		int ans = infinite(arr,target,start,end);
		System.out.print(ans);
	}
	public static int infinite(int arr[],int target, int start, int end){
	    int mid =0;
	    while(start<=end){
	        mid = start+(end-start)/2;
	        if(arr[mid]>target){
	            end = mid-1;
	        }else if(arr[mid]<target){
	            start=mid+1;
	        }else if(arr[mid]==target){
	            return mid;
	        }
	    }return mid;
	}
	
}
