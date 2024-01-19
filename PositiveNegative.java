import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number"); 
    int num = sc.nextInt();

    if(num>=1){
        System.out.println("Positve");
    }
    else if(num<0){
        System.out.println("Negative");
    }
    else{
        System.out.println("0 is neighter positive nor negative");
    }
    }
    
}
