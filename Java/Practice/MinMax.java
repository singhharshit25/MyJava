package Practice;
//Find Smallest and Max Element in an Array 

public class MinMax
{
	public static void main(String[] args) {
	    int[] arr={16,20,40,1,45};
	    int min=arr[0];
        int max =0;
		System.out.println("Hello World");
		for(int i =0;i<arr.length;i++){
		    if(arr[i]<min){
		        min=arr[i];		        
		    }
            else if(arr[i]>max){
                max=arr[i];
            }
		}System.out.println("Min: "+min);
        System.out.println("Max: "+max);
	}
}