//WAP to read one char value form user and display it.
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an char value...");
        char c = sc.next().charAt(0);
        System.out.println("The entered value of char is "+ c);
       
    }
}