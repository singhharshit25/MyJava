package Array.LinearSearch;

public class RichestCutomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
       System.out.println( wealth(accounts));
    }

    public static int wealth(int accounts[][]){
        int max = 0;
        for(int i = 0;i<accounts.length;i++){
            int sum=0;
            for(int j =0;j<accounts[i].length;j++){
                sum = sum+accounts[i][j];
            }
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }
}   
