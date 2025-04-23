package Practice;

public class NthOfFibonacci{
    public static void main(String[] args) {
        int n = 10;
        int first =0;
        int second =1;
        System.out.print(first+ "," + second+",");
        fibonacci(n, first, second);
        
    }
    public static void fibonacci(int n, int first, int second) {
        int sum = first + second;
        while(n>1){
            sum =first +second;
            first = second;
            second =sum;
            if(n==2){
                System.out.println("\nHere is the Nth term: "+ sum);
            }
            //System.out.print(sum+",");
            n--;
        }
    }
}