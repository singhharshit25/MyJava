//Wap to read  char and display whether it is a special symbol or not
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("It's ascii value is "+ascii);
        if(ascii>=0 && ascii<=47 || ascii >= 91 && ascii <= 96 || ascii >=123 && ascii <= 127){
            System.out.println("Special Character");
        }
        else{
            System.out.println("not a special character");
        }
    }
}
