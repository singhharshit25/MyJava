import java.util.*;

public class LargestOf3 {

    public static void main(String[] args) {
        System.out.print("Enter First number: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        System.out.print("Enter Second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter Third number: ");
        float num3 = sc.nextFloat();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + "is Largest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + "is Largest");
        }
        else{

            System.out.println(num3 + "is Largest");
            
        }
    }
    
}
