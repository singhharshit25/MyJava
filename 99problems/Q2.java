//WAP to read a string value form user and display its individual cahracter

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int value...");
        String s = sc.nextLine();
        int n = s.length();
        for (int i = 0; i <= n; i++)
        {
            System.out.println(s.charAt(i));
        }

    }
}
