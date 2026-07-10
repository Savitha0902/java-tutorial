package day2;
import java.util.*;
public class loan_approval {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("enter the amount:");
        int a =rs.nextInt();
        System.out.println("enter the cibil score:");
        int b =rs.nextInt();
        boolean c=((a>1000000)&&(b>750));
        System.out.println(c);
    }
}
