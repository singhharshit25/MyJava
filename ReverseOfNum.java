public class ReverseOfNum {
    public static void main(String[] args) {
        int num = 456789;
        int digit = 0;
        while (num>0) {
            digit =num%10;
            System.out.print(digit);
            num = num/10;
        }
       

        
    }
    
}
