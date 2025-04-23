package Practice;

public class FactorOfNum {
 public static void main(String[] args) {
    int num = 10;
    factor(num);
 }  
 public static void factor(int num){
    for(int i = 1;i<num; i++){
        if(num % i== 0){
           System.out.print(i+", ");
        }
    }
} 
}
