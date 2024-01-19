public class Pattern6 {
    public static void main(String[] args) {
System.out.println("Character Pattern");
        char ch = 'A';
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }

    }
}
     