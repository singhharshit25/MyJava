/*Write Array.BubbleSort.Practiceray of integers an
d sorts it in ascending order using the Bubble Sort algorithm.*/

package Array.BubbleSort.Practice;
import java.util.Scanner;
public class First {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int input = sc.nextInt();
        int arr[]= new int[input];
        System.out.println("Enter Elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given Array");
        for(int i: arr){
            System.out.print(i+" ");
        }
        int temp;
        for(int i =0;i<arr.length;i++){
            int flag = 0;
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
                
            }
            if(flag==0){break;}
        }
        System.out.println();
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
