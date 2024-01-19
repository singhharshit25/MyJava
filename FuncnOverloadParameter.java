public class FuncnOverloadParameter {

    //sum function
    public static int sum(int a , int b) {
        return a+b;   
    }
    //sum function overloaded
    public static int sum(int a , int b , int c) {
        System.out.println("Overloaded function called");
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=5,b=6,c=7;
        
        int sum1=sum(a,b);
        System.out.println(sum1);
        int sum2=sum(a,b,c);
        System.out.println(sum2);
        
    }
    
}
