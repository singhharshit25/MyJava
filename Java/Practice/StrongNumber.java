package Practice;

import java.util.Scanner;

/*A strong number is a positive integer where the sum of the 
factorials of its digits equals the number itself. For instance, 145 is a 
strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145. */
        //pass num into method to take each digit 
        //call factorial method on that digit inside digit()
        //sum that factorial 
        //if sum = num --> strong number
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int result =digit(num);
        System.out.println(num +" is Strong Number: "+( result==num));
    }
    public static int factorial(int digit) {        
        int fact=1;
        for(int i =1;i<=digit;i++){
            fact = fact*i;
        }
        return fact;
    } 
    public static int digit(int num) {
        int sum = 0;
        while(num>0){
           int dig = num %10;
           sum = sum + factorial(dig);
           num = num/10;
        }
        return sum;
    }   
}
