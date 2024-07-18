//Q3. Print the sum of first n natural numbers.
public class Q3 {
    public static void sum(int n,int sum){
         //base
         if(n==0){
            System.out.println(sum);
            return;
         }
         sum= sum +n;
         sum(n-1,sum);
        
      
    }

    public static void main(String[] args) {
        int n = 5;
        int sum =0;
        sum(n,sum);
        
    }

}
