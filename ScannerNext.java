import java.util.*;
public class ScannerNext {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       String input = sc.next();

        String inputLine = sc.nextLine();
        System.out.print(inputLine +" ");
        int integerr = sc.nextInt();
        float deciaml = sc.nextFloat();
        boolean bool = sc.nextBoolean();
        short shortt = sc.nextShort();
        double dob = sc.nextDouble();
        long l = sc.nextLong();


        System.out.println(input);
        
        System.out.println( " "+ deciaml);
        System.out.println(" "+ bool);
        System.out.println(" "+ shortt);
        System.out.println(" "+ dob);
        System.out.println(" "+ l);
        System.out.println(" "+ integerr);


        
    }
}
