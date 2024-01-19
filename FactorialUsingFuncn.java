public class FactorialUsingFuncn {
    public static void fact(int num) {
        int facti=1;
        for(int i=1;i<=num;i++){
             facti = facti*i;
            
        }
        System.out.println(facti);
        
    }
         public static void main(String[] args) {
             fact(5);
        
    }
    
}
