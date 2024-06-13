/*wap to read char and check the following:
a)uppercase alphabet
b)lowercase alphabet
c)digit 
d)special charater*/

import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char ch = sc.next().charAt(0);
        //uppercase lower case
    if(ch>=65 && ch<=90){
        System.out.println("Uppercase alphabet");
    }
    else if(ch>=97 && ch<=122){
        System.out.println("Lowercase alphabet");
    }
    //digit 
    if(ch>'0' && ch<='9'){
        System.out.println("Is is a digit");
    }
    
    //special charater 
    int ascii = ch;
    if(ascii>=0 && ascii<=47 || ascii >= 91 && ascii <= 96 || ascii >=123 && ascii <= 127){
        System.out.println("Special Character");
    }
    
    
    }
}
