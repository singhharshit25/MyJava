import java.util.*;

public class EveOdd {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Number Buddy: ");
    float num = sc.nextFloat();

    if(num%2==0){
        
        System.out.println(num + " Number is Even");

    }
    else{
        System.out.println(num + " Number is Odd");
    }
}    
}
