//wap to read char and display whether it is a vowel or consonant

import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);
        if(ch=='a'|| ch == 'e'|| ch =='i'|| ch == 'o'|| ch =='u'|| ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}
