package Practice;

//Find Smallest Element in an Array 

public class MinElement
{
	public static void main(String[] args) {
	    int[] arr={16,20,40,1,45};
	    int min=arr[0];
		System.out.println("Hello World");
		for(int i =0;i<arr.length;i++){
		    if(arr[i]<min){
		        min=arr[i];
		        
		    }
		}System.out.println(min);
	}
}