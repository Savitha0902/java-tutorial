package day6;
import java.util.*;
public class floyds_triangle {
    public static void main(String[]args) {
        Scanner rs=new Scanner(System.in);
        int num = 1;
        int n=rs.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", num++);
            }
            System.out.println();
        }
    }
}
