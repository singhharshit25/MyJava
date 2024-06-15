//wap to read a number and display sum of first N natural number
import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first "+n+" natural number: "+sum);
    }

}
