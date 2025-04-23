package Practice;
//Find Second largest Element in an Array 

public class SecondMax
{
	public static void main(String[] args) {
	    int[] arr={16,20,40,142,45};
	    int secondMax=0;
        int max = 0;
		System.out.println("Hello World");
        int temp=0;
		for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                 temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;   
                }   
            } 
		}
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != max) {
                secondMax = arr[i];
                break;
            }
        }
        System.out.println(secondMax);
	}
}