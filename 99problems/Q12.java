//wap to read age of a person and display whether he/she is eligible for voting or not.
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }
    }
}
