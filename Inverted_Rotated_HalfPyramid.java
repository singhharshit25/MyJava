public class Inverted_Rotated_HalfPyramid {

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j < n + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid(4);

    }
}
