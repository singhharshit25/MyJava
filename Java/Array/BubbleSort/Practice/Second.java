package Array.BubbleSort.Practice;
/*Implement Bubble Sort with an optimization to stop early if the array is already sorted.

Input:
A single line of n integers.

Output:
The number of passes made and the sorted array. */
public class Second {
    public static void main(String[] args) {
            int []arr ={1, 12, 7, 4, 5 };
            int temp;
            int count =0;
            for(int i =0;i<arr.length;i++){
                int flag =0;
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        flag =1;
                    }
                    
                }
                count++;
                if(flag==0){
                    break;
                }
                
            }
            System.out.println("passing: "+count);
            for(int i : arr){
                System.out.print(i+" ");
            }
    }
}
