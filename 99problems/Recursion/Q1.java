/*print number from 5 to 1 using Recursion
    for recrursion we must have:
    1)given -->n=5
    2) work --> print 5 to 1
    3)base case n=0(where the recursion terminates)
*/
public class Q1{

    public static void print(int n){
        //base case;
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);//kaam
        
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}