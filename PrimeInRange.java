import java.util.*;

public class PrimeInRange {

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        
        if(num==2){
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void PrimeRange(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        PrimeRange(range);

    }
}
