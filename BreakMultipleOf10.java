import java.util.*;
public class BreakMultipleOf10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = 0;
        // while(k==0){
        //     System.out.println("Enter Number: ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         k++;
        //         break;  
        //     }else{
        //         System.out.println(num);
                
        //     }
        // }    

        do{
            int num =sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }while(true);
    }
}
