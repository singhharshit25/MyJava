package Practice;

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Enter Power: ");
        int pow = sc.nextInt();
        int ans = power(num,pow);
        System.out.println(ans);
    }
    public static int power(int num, int pow) {
        int mul=1;
        while(pow>0){
            mul = mul *num;
            pow--; 
        }
        return mul;
    }
}
