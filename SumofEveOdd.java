import java.util.*;
public class SumofEveOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int odd=0;
        int eve = 0;
        int input = 10;
        int i=1;
    
        while(i<input){
            System.out.println("enter number:");
            int num= sc.nextInt();
            if(num%2==0){
             
            eve += num;
            i++;
        }
        else{
            
            odd += num;
            i++;
        }
    }
    System.out.println("odd "+odd + " Eve "+eve);
    }    
}
