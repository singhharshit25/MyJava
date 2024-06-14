
//wap to read 1-7 and display corresponding weekdays
import java.util.*;

public class Q28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numberfrom 1 to 7:");
        int num = sc.nextInt();
        switch(num){
            case 1: {System.out.println("Monday");
                    break;}
            case 2: {System.out.println("Tuesday");
                     break;}
            case 3: {System.out.println("Wednesday");
                      break;
                    }
            case 4:{ System.out.println("Thrusday");
                        break;}
             case 5: {System.out.println("Friday");
                     break;} 
            case 6: {System.out.println("Saturday");
                     break;}
            case 7: {System.out.println("Sunday"); 
                    break;}
            default: System.out.println("Please enter a valid number");

        }
    }
}
