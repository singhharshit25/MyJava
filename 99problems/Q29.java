
//wap to read month and year and display number of days for that month
import java.util.*;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter Month no.: ");
        int month = sc.nextInt();
        
        if (month % 2 != 0) {
            System.out.println("Number of days in entered month is 31");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
                System.out.println("it's a leap year so 29 days in " + month+" month");
            } else {
                System.out.println("28 days in " + month);
            }
        }
        else{
            System.out.println("Number of days in entered month is 30");
        }

    }
}
