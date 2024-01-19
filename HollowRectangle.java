import java.util.Scanner;

public class HollowRectangle {
    public static void HollowRectangle(int row,int col){

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        int row = sc.nextInt();
        System.out.println("Enter Col");
        int col = sc.nextInt();
        HollowRectangle(row,col);  
    }

}
