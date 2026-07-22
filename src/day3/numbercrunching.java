package day3;
import java.util.*;
public class numbercrunching {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int reverse=0;
            while(a!=0) {
                int pop = a % 10;
                reverse = reverse * 10 + pop;
                a /= 10;
            }
            System.out.println(reverse);
        }
    }
