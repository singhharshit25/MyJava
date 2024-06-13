//wap to read a char and display its lowercase charater
import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a upper alphabet ");
        char ch= sc.next().charAt(0);
        int ascii = ch + 32;
        System.out.println("Lowercase for Uppercase alphabet: "+ch + " is " + (char)ascii);


    }
}
