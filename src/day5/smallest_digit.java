package day5;
import java.util.*;
public class smallest_digit {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int num = rs.nextInt();
        int minvalue=9;
        while(num!=0){
            int pop=num%10;
            if(pop<minvalue) {
                minvalue = pop;
            }
            num=num/10;
        }
        System.out.println("the smallest digit in the given no:" +minvalue);
    }
}
