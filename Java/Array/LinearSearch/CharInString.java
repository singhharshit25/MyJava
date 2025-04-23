package Array.LinearSearch;

public class CharInString {
    public static void main(String[] args) {
        String name = "kunal";
        char ch= 'u';
       System.out.println(search(name, ch));
        }  

    static boolean search(String str, char target){
        if(str.length()==0)
        {
            return false;
        }
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
