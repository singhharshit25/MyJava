package Array.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "kunal";
        char ch = 'a';
        System.out.println(search(name, ch,1,4));

    }
    static int search(String str, char target,int start, int end){
        if(str.length()==0)
        {
            return -1;
        }
        for(int i = start;i<=end;i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
