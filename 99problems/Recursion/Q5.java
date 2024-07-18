//Q5. Print the fibonacci sequence till nth term.

public class Q5 {

    public static void fibonacci(int a, int b, int n){
        if(n==0){
            
            return;
        }
        // int c = a+b;//0+1=1 --> c=1....b+c
        // a=b;
        // b=c;
        // System.out.print(c);
        System.out.print(a);
        fibonacci(b, a+b, n-1);
        
    }

    public static void main(String[] args) {
        int a=0;
        int b = 1;
        int n=6;
        fibonacci(a,b,n);
    }
    
}
