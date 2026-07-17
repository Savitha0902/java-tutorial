package day7;
import java.util.*;
public class even_or_odd_length_sum {
    public static void main(String[]args) {
        Scanner rs = new Scanner(System.in);
        int[] a = {1, 2, 12, 4, 50, 7000};
        int oddsum = 0;
        int evensum = 0;
        for (int value:a) {
            int digits = 0;
            int org = value;
            while (value != 0) {
                int pop = value % 10;
                digits++;
                value = value / 10;
            }
            if (digits % 2 == 0) {
                evensum += org;

            } else if (digits % 2 != 0) {
                oddsum += org;
            }
        }

        System.out.println(oddsum);
        System.out.println(evensum);
    }
}



