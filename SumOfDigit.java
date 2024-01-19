public class SumOfDigit {
    public static void main(String[] args) {
        int num =101010;
        int ld = 0;
        int sum = 0;

        while(num>0){
            ld=num%10;
            sum  += ld; 
            num /= 10;
        }
        System.out.println(sum);
    }
    
}
