package day5;
import java.util.*;
public class isAmstrongno {
    public static void main(String[] args){
        Scanner rs =new Scanner(System.in);
        int num=rs.nextInt();
        int org=num;
        int sum=0;
        while(num!=0){
            int pop=num%10;
            sum+=pop*pop*pop;
            num=num/10;
        }
        if(org==sum){
            System.out.println("it is amstrong no");
        }
        else{
            System.out.println("its not a amstrong no");
        }

    }
}
