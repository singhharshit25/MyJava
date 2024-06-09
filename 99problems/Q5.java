//WAP to read two numbers and swap them using third variable.
import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an two number...");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;
        System.out.println("Numbers before swapping\nnum1 = "+num1+"\nnum2 = "+num2);
        temp = num1 + num2;
        num1 = temp-num1;
        num2 = temp-num2;
        System.out.println("Numbers after swapping:\nnum1 = "+ num1 + "\nnum2 = "+num2);
       
    }
}
