package Practice;
import java.util.Scanner;
class PerfectSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check for perfect square");
        int num = sc.nextInt();
        boolean ans =isPerfectSquare(num);
        System.out.println(ans);
    }
    public static boolean isPerfectSquare(int num) {
        if(Math.sqrt(num)%1==0){
            return true;
        }
        return false;
    }
}