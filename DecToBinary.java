public class DecToBinary {
    public static void main(String[] args) {
        int dec = 7;
        int pow = 0;
        int rem=0;
        int binary=0;
        
        do{
            rem =dec%2;
            binary = binary + (rem*(int)Math.pow(10, pow));
            pow++;
            dec= dec/2;
        }while(dec>0);
        System.out.println(binary);
    }
    
}
