import java.util.*;

public class PrimeUsingFunction {

    public static boolean isPrime(int num) {
        boolean isPrime =true;
       
        // for(int i=2;i<num;i++){
        //     if(num%i==0){
        //         isPrime =false;
        //         break;
        //     }
        // }

        //optimized approach for prime 
        
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));


        
    }
}
