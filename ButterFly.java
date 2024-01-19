public class ButterFly {
    public static void main(String[] args) {
        int n=4;
        //half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted half pyramid
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }

}
