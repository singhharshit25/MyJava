public class FunctionOverloadDataType {
    
    public static int sum(int a,int b) {
        return a+b;
    }
    public static float sum(float a,float b) {
        return a+b;
        
    }
    public static void main(String[] args) {
        
        System.out.println(sum(5,2));
        System.out.println(sum(5.0f,2.0f));
    }
    
}
