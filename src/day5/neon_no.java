package day5;
import java.util.*;
public class neon_no {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int num = rs.nextInt();
        int square=num*num;
        int sum=0;
        while(square!=0){
            int pop=square%10;
            sum+=pop;
            square=square/10;
        }
        if(sum==num){
            System.out.println("its a neon no");
        }
        else{
            System.out.println("its not a neon no");
        }

    }
}
