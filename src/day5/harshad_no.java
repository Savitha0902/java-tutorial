package day5;
import java.util.*;
public class harshad_no {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=rs.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int pop=temp%10;
            sum+=pop;
            temp=temp/10;
        }
        if(num%sum==0){
            System.out.println("its harshad no");
        }
        else{
            System.out.println("its not a harshad no");
        }

    }
}
