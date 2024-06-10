//Wap to read two numbers and display the maximum
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two number:");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     if(num1>num2){
        System.out.println("num1 "+num1+ " is maximum");
     }   
     else{
        System.out.println("num2 "+num2+" is maximum");
     }
    }
}
