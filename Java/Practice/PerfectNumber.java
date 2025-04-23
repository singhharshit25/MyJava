package Practice;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println(perfectNumber(num));
    }
    // public static void perfectNumber(int num) {
    //     if(num % isProperDivisor(num)==0){
    //         System.out.println("Harshad Number");
    //     }else{
    //         System.out.println("Not a Harshad Number");
    //     }
    // }

    public static boolean perfectNumber(int num) {
        int sum=0;
            for(int i = 1;i<=(int)num/2;i++){
                if(num%i==0){
                    sum = sum + i ;
                }
            }
            return sum == num;        
    }
}
