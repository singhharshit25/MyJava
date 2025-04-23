package Array.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int [] arr={12,-345,2,6,7896};
        System.out.println(evendig(arr));
    }
    static int evendig(int arr[]){
        int output=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*(-1);
            }
            int count =0;
            while(arr[i]>0){
                arr[i]=arr[i]/10;
                count ++;
            }
            if(count%2==0){
                output++;
            }
        }
        return output;
    }
}
