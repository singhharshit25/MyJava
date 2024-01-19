import java.util.*;

public class ContinueSkip10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        do{
            
            int num = sc.nextInt();
            
            if(num%10==0){
                continue;
                
            }
            System.out.println(num);
        }while(true);
    }
    
}
