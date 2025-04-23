package Practice;

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        
        friendly(num1,num2);
    }
    public static void friendly(int num1,int num2) {
        
        if(divisorSum(num1)==num2 && divisorSum(num2)==num1 ){
            System.out.println("Friendly Pair Number");
        }else{
            System.out.println("Not a Friendly Pair Number");
        }
    }
    public static int divisorSum(int num){
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
