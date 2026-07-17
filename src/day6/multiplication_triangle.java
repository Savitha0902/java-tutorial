package day6;
import java.util.*;
public class multiplication_triangle {
    public static void main(String[]args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}

