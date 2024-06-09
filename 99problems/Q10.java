//WAP to convert fahrenheit to celcius
import java.util.*;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        float f = sc.nextFloat();
        float c = 0f;
        
        c = ((f-32)*5)/9;
        System.out.println(f+"f into celcius "+c+"c");

    }
}
