package day5;
import java.util.*;
public class remove_zeros_in_the_digit {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=rs.nextInt();
        int result=0;
        while(num!=0){
            int pop=num%10;
            if(pop!=0){
                result=result*10+pop;
            }
            num=num/10;
        }
        int final_result=0;
        while(result>0){
            final_result=final_result*10+(result%10);
            result=result/10;

        }
        System.out.println(final_result);
    }
}
