package day7;
import java.util.*;
public class odd_or_even_sum_of_digits {
    public static void main(String[]args) {
        Scanner rs = new Scanner(System.in);
        int[] a = {12, 22, 12, 4, 50, 7000};
        int oddsum = 0;
        int evensum = 0;

        for (int value:a) {
            int sum=0;
            int org = value;
            while (value != 0) {
                int pop = value % 10;
                sum+=pop;
                value = value / 10;
            }
            if (sum % 2 == 0) {
                evensum += org;

            } else if (sum % 2 != 0) {
                oddsum += org;
            }
        }

        System.out.println("oddsum:"+oddsum);
        System.out.println("evensum:"+evensum);
    }
}

