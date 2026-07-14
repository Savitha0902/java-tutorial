package day5;
import java.util.*;
public class spy_no {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=rs.nextInt();
        int sum=0;
        int product=1;
        int temp=num;
        while(temp!=0){
            int pop=temp%10;
            sum+=pop;
            temp=temp/10;
        }
        while(num!=0){
            int last=num%10;
            product*=last;
            num=num/10;
        }
        if(sum==product){
            System.out.println("Its a spy no");
        }
        else{
            System.out.println("its not a spy no");
        }
    }
}
