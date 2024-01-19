public class FuncnAvg {
    public static float avg(int num1,int num2,int num3) {
        float sum= num1+num2+num3;
        float avg =sum/3;
        return avg;
    }
    public static void main(String[] args) {
        int num1=10;
        int num2=3;
        int num3=3;

        float avg = avg(num1,num2,num3);
        System.out.println(avg);
        
    }
    
}
