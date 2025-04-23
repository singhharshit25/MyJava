package Practice;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        abundant(num);
    }
    public static void abundant(int num) {
        
        if(num<divisor(num)){
            System.out.println("Abundant Number");
        }else{
            System.out.println("Not a Abundant Number");
        }
    }
    public static int divisor(int num){
       int sum=0;
        if(num<0){num = num*(-1);}
        for(int i =1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        return sum;
    }
}
