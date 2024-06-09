//WAP to read one char value form user and display its individual cahracter

import java.util.Scanner;
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String value...");
        String s = sc.nextLine();
        System.out.println("The entered value of string is \""+ s+"\"");
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            System.out.println(s.charAt(i));
        }

    }
}
