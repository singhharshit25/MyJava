import java.util.*;
public class Largestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        float a = sc.nextInt();
        System.out.println("Enter 2nd number");
        float b = sc.nextInt();

        if(a>b){
            System.out.println(a +" Greater than "+ b);
        }
        else if(b>a){
            System.out.println(b + " Greater than "+ a);
        } 
        else{
            System.out.println(a + " and " +  b + "are equal");
            
        }
        
    }
    
}
