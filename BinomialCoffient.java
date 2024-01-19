import java.util.*;


public class BinomialCoffient {
   
    //factorial code
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //BinomialCoffient

    public static int BinomialCoffient(int n, int r, int nr) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(nr);

        int bc = fact_n / (fact_r * fact_nr);

        return bc;
    }

    //Main Function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int nr = n-r;
        int output = BinomialCoffient(n, r, nr);

        System.out.println("Binomial Coffiecient: "+output);
        

    }

}
