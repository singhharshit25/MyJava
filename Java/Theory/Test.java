package Theory;
public class Test{   
    public static void main(String[] args) {
    System.out.println(Main.i);
        Main.display();
        check ob = new check();
    }
}
class Main{
    Main(){
        System.out.println("Main constructor called ");
    }
    static int i =10;
    static void display(){
        System.out.println("inside main");
    }
}   
class check extends Main{
} 
 

