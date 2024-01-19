public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before a "+ a);
        System.out.println("before b "+ b);
        // int total = a+b;
        // a = total -a;
        // b =total-b;
        int temp =a;
        a=b;
        b=temp;
        System.out.println("after a "+a);
        System.out.println("after b "+b);

    }
    
}
