package day5;
import java.util.*;
public class automorphic_number {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=rs.nextInt();
        int org=num;
        int square=num*num;
        int digits=0;
        while(org>0){
            digits++;
            org=org/10;
        }
        int power=1;
        for(int i=1;i<=digits;i++){
            power=power*10;
        }
        if(square%power==num){
            System.out.println("automorphic number");
        }
        else{
            System.out.println("not automorphic no");
        }

    }

}
