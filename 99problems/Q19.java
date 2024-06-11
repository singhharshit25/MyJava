//wap to read a char and display whether it is uppercase alphabet or not
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char ch = sc.next().charAt(0);
    if(ch>=65 && ch<=90){
        System.out.println("uppercase");
    }
    }
}
