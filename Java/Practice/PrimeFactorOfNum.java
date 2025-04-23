package Practice;

//find factor of number 
//check factor is prime or not

public class PrimeFactorOfNum {
    public static void main(String[] args) {
        int num = 18;
        factor(num);
    }
    public static void factor(int num){
        for(int i = 2;i<num; i++){
            if(num % i== 0){
               //System.out.println(i);
                if(isPrime(i)){
                    System.out.println(i);
                }   
            }
        }
    }
    public static boolean isPrime(int num){
        for(int j =2;j<num;j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }
}