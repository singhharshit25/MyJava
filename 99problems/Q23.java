/*wap to read three subjects marks of a student perform the following :
    a)Display the total marks scored
    b)display the average of marks 
    c)display the grade and remarks as per the following crieteria 
*/
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage: ");
        float percent =  sc.nextFloat();
        if(percent>=80 && percent<=100){
            System.out.println("Grade: A\nRemarks: Excellent");
        }
        else if(percent>=70 && percent<80){
            System.out.println("Grade: B\nRemarks: Very Good");
        }
        else if(percent>=60 && percent<70){
            System.out.println("Grade: C\nRemarks: Good");
        }
        else if(percent>=50 && percent<60){
            System.out.println("Grade: D\nRemarks: Satisfacotry");
        }
        else if(percent<50){
            System.out.println("Grade: E\nRemarks: Failure");
        }


    }
}
