//wap to read a char and display its uppercase charater
import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase alphabet ");
        char ch= sc.next().charAt(0);
        int ascii = ch - 32;
        System.out.println("Uppercase for Lowercase alphabet: "+ch + " is " + (char)ascii);


    }
}
