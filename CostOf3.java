import java.util.*;

public class CostOf3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost fo Pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the Cost of Pen");
        float pen = sc.nextFloat();
        System.out.println("eraser");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;
        float total = bill + ((bill*18)/100);

        System.out.println("Total bill     " + total);
        


    }
    
}
