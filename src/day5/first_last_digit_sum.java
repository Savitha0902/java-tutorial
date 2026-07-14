package day5;
import java.util.*;
public class first_last_digit_sum {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=rs.nextInt();
        int sum=0;
        int pop=num%10;
        sum=pop;
        while(num>=10){
            num=num/10;
        }
        num=sum+num;
        System.out.println(num);
    }

}
