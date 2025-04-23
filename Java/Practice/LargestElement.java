//Find Largest element in an array

package Practice;

public class LargestElement
{
	public static void main(String[] args) {
	    int[] arr={16,20,40,45};
	    int max=0;
		System.out.println("Hello World");
		for(int i =0;i<arr.length;i++){
		    if(arr[i]>max){
		        max=arr[i];
		        
		    }
		}System.out.println(max);
	}
}