public class ReverseGivenNo {
    public static void main(String[] args) {
        int num = 456123;
        int remainder = 0;
        int reverse = 0;
        while (num>0) {
            remainder =num%10;
            reverse = (reverse*10)+remainder;
            num = num/10;
        }
        num= reverse;
        System.out.println(num);
       

        
    }
    
}
