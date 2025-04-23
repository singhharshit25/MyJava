package Practice;

//reverse of Element in an Array 

public class ReverseArray
{
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5};
	    int[] newarr= new int [arr.length];
	    for(int i =arr.length-1,j=0;i>=0;i--,j++){
            newarr[j] =arr[i];
        
	   }
	   for(int i: newarr){
	       System.out.print(i+" ");
	   }	}
}
