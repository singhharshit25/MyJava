//wap to read a char and display whether it is lowercase alphabet or not
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char ch = sc.next().charAt(0);
    if(ch>=97 && ch<=122){
        System.out.println("Lowerercase");
    }
    }
}
