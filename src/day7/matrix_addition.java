package day7;
import java.util.*;
public class matrix_addition {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int[][] a = {{1,2,3},{1,2,4},{1,4,3}};
        int[][] b = {{4,2,1},{5,1,2},{2,1,1}};
        int[][]c=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}

