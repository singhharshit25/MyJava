public class EveOddFuncn {

    public static boolean isEven(int num) {
        
        if(num%2==0){
            return true;    
        }
        else{
            return false;
        }

        
    }
    public static void main(String[] args) {
        int a = 55;
        System.out.println(isEven(a));
        
    }
    
}
