import java.util.*;
public class Inverted_Half_Pyramid {

    public static void Inverted_Half_Pyramid(int row,int col) {
       
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=(row-i)+1; j++) {
                System.out.print(j);
               // j--;
            }
            //col -= 1;
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row: ");
        int row = sc.nextInt();
        System.out.print("Col: ");
        int col = sc.nextInt();
        Inverted_Half_Pyramid(row,col);
        
    }

}
