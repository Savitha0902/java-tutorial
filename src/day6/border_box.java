package day6;
import java.util.*;
public class border_box {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int num = rs.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if( i==1||j==1||i==num||j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println();


        }

    }
}
