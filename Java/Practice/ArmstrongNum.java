package Practice;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        boolean result = isArmstrong(num)==num;
        System.out.println(result);
    }
    public static int digit(int num){
        int count =0;
        while(num>0){
            num= num/10;
            count++;
        }
        return count;
    }
    public static int isArmstrong(int num) {
        
        int sum = 0;
        int digit = digit(num); 
        int temp = num;//153
        while(num >0){
            int mul = 1;
            while(digit>0){;
                mul = mul* num%10;
                digit--;
            }
            sum = sum + mul;
            num = num/10;
            digit = digit(temp);
        }
        System.out.println(sum);
        return sum;
    }
}
