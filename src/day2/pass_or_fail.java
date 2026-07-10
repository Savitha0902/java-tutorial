package day2;
import java.util.*;
public class pass_or_fail {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("enter the mark:");
        int a = rs.nextInt();
        if (a > 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
