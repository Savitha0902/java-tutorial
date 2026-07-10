package day2;
import java.util.*;
public class vote {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = rs.nextInt();
        if (age >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }
}
