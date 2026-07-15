package day6;
import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int num = rs.nextInt();
        for(int i=1;i<=num;i++){

            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }


            System.out.println();
        }

    }
}
