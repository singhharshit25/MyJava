package Practice;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        isArmstrong(start, end);
    }

    public static int digit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void isArmstrong(int num, int end) {
        int sum = 1;
        for (int i = num; i < end; i++) {
            int temp = i;
            int digit = digit(temp);
            while (digit > 0) {
                sum = sum * temp;
                temp = temp / 10;
                digit--;
            }
            if(sum==i){System.out.println(sum);}
            sum = 1;
        }

    }

}
