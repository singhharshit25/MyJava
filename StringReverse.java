import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String s="";
        int temp = A.length();
        for(int i =temp-1;i>=0;i--){
           s=s.concat(Character.toString(A.charAt(i))); 
        }
        if(A.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



