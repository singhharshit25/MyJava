package Practice;

import java.util.Scanner;

public class HarshadNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        Harshad(num);
    }
    public static void Harshad(int num) {
        
        if(num % digitSum(num)==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
    public static int digitSum(int num){
       int  sum = 0;
        if(num<0){num = num*(-1);}
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }

}
