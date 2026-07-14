package day5;
import java.util.*;
public class largest_digit {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int num=rs.nextInt();
        int maxvalue=0;
        while(num!=0){
            int pop=num%10;
            if(pop>maxvalue){
                maxvalue=pop;
            }
            num=num/10;
        }
        System.out.println("the largest digit in the given no is:" +maxvalue);

    }
}
