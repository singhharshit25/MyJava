import java.util.*;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Income: ");
        float income = sc.nextFloat();
        float tax;
        
        if (income < 5000){

            tax = 0;
            
        }
        else if(5000>income && income<10000){
            tax = (float)income *0.2f;
        }
        else{
            tax =(float)income*0.3f;
        }
        
        System.out.print("Income after Tax: " +" "+ ( income - tax));
    }
    
}
