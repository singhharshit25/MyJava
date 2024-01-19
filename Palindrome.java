import java.util.*;
public class Palindrome {

    //Count number of digit in number

    public static int NoOfDigit(int num) {

        int count=0;
        do{
            if(num%10!=0){
                count++;
            }
        num=num/10;
        }while(num>0);
        return count;
    }

//reverse of number 

    public static int reverse(int num) {
        int power = NoOfDigit(num)-1; //bcoz count ki jo value rhegi vo usse ek km power hogi bcoz 10^0 se first place suru hota hai
        int ld =0;
        int reverse =0;
        do{
            ld = num%10;
            reverse = reverse +(ld*(int)Math.pow(10,power));
            power--;
            num=num/10;
        } while(num>0);

        return reverse;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number to reverse: ");
        int num=sc.nextInt();
        System.out.println("Reverse of number "+ num +" is " +reverse(num));
        

        if (num==reverse(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
}
    
}
