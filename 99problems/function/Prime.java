/**
 * Make a function to check if a number is prime or not.
 */
import java.util.*;
public class Prime {
    public static void check(int num){
        int flag =0;
        for(int i=2;i<num;i++){
         if(num%i==0){
            System.out.println("not Prime");
            flag =1;
            break;
         }
                }
                if(flag==0){
                    System.out.println("prime");
                 }
        
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
            check(num);
        
    }
    
}