package Practice;

public class Fibonacci {
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
                System.out.print(sum+",");
                n--;
            }
        }
} 
