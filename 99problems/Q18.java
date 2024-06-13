//Wap to read  char and display whether it is a digit or not

import java.util.*; 
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch>'0' && ch<='9'){
            System.out.println("Is is a digit");
        }
        else{
            System.out.println("It is not a digit");
        }
        

    }
  
}
