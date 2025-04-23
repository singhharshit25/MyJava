package Practice;

public class printArray {
    public static void main(String[] args) {
        int a[] ={10,20,30};
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("using for each");
        for (int i:a){
            System.out.println(i);
        }
        System.out.println("2D array");
        //2D array
        int[][] b={{10,20},{40,50,60}};
        for(int i = 0;i<b.length;i++){
            for(int j=0;j<=b[i].length-1;j++){
                System.out.print(b[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("3D array");
        //3D array
        int[][][] c={{{10,20},{30}},{{40,50,60},{70,80,90}}};
        for(int i = 0;i<c.length;i++){
            for(int j=0;j<=c[i].length-1;j++){
                for(int k =0;k<c[i][j].length;k++){
                    System.out.print(c[i][j][k]+" ");
                }
            }
        }

    }
}
