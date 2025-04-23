package Practice;
//number which squre ends with the number itself eg 5^2 =25, 6^2=36 etc  
import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        automorphic(num);
    }
    public static void automorphic(int num) {
        
        if((int)Math.pow(num,2)% (int)Math.pow(10, isDigit(num))==num){
            System.out.println("Gottcha");
        }else{
            System.out.println("Nottcha");
        }
    }
    public static int isDigit(int num){
       int  count = 0;
        if(num<0){num = num*(-1);}
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    
}
