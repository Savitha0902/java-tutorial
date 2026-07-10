package day2;
import java.util.*;

public class conversion {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("enter temp:");
        int a = rs.nextInt();
        int c = ((a * 9 / 5) + 32);
        System.out.println("result:" + c);

    }
}

