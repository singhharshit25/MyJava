//WAP to read two numbers and swap them without using third variable.
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an two number...");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
    
        System.out.println("Numbers before swapping\nnum1 = "+num1+"\nnum2 = "+num2);
        num1 = num1 + num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Numbers after swapping:\nnum1 = "+ num1 + "\nnum2 = "+num2);
       
    }
}