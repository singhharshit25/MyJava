// odd even using ternary operator
import java.util.*;
public class OddEve{
    public static void main(String[] args){
        System.out.println("Even Odd Using Ternary ");
        System.out.println("Enter number to check: ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int result = 0;
      //Normal If else condition
        if(num%2==0)
            System.out.println("10");
        else
            System.out.println("20");

      // condition check using ternary operator
        result = num%2==0 ? 10  : 20; 
        System.out.println("Ternary: "+result);
    }
    
}
