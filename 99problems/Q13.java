//Wap to read a number and display wheather the number is even or odd
import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
