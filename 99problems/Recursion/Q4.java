/*Q4. Print factorial of a number n.
given n = 5;
*/
public class Q4 {
    public static void factorial(int n,int fact){
        //base
        if(n==0){
            System.out.println(fact);
            return;
        }

        fact=fact*n;
        factorial(n-1,fact);
    }
    public static void main(String[] args) {
        int n= 5;
        int fact = 1;
        factorial(n, fact);

    }
    
}
