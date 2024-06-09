//WAP to read two number and display sum without using + operator
import java.util.*;
class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1;i<=b;i++){
            a++;
        }
        System.out.println(a);
    }    
}
