import java.util.*;

public class SumofFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i<=n){
            sum = sum+ i;
            i++;
        }
        System.out.println(sum);
    }
    
}
