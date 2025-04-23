package Array.LinearSearch;

public class PrintElemtStr {
    public static void main(String[] args) {
        String name = "kunal";
        char ch = 'm';
        System.out.println(search(name, ch));

    }
    static char search(String str, char target){
        if(str.length()==0)
        {
            return '0';
        }
        for(char i: str.toCharArray()){
            if(i==target){
                return i;
            }
        }
        return '0';
    }
}
