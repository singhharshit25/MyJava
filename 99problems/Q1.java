//WAP to read an int value form user and display it 

import java.util.Scanner;
class Q1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int value...");
        int value = sc.nextInt();
        System.out.println("The input int is: "+value);
    }
}
