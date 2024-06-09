//WAP a program to read a number and display whether the number is positive or negative
import java.util.*;
class Q11 {
    public static void main(String[] args) {
        System.out.println("enter a number: ");    
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();

        if(num<0){
            System.out.println("The given number is negative");
        }
        else{
            System.out.println("The given number is Positive");
        }
    }
}
