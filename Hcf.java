import java.util.*;
public class Hcf
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i < Math.max(a,b); i++)
            {
                if(a%i==0 && b%i==0){
                    hcf =i;
                }
            }  
            System.out.println(hcf);
    }

}
