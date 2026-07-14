package day5;
import java.util.*;
public class is_strong_no {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int num = rs.nextInt();
        if(isStrong(num)) {
            System.out.println("its strong no");
        }
        else{
            System.out.println("its not a strong no");
        }
    }
    public static boolean isStrong(int n){
        int sum=0;
        int temp=n;
        while(n!=0){
            int pop=n%10;
            sum+=fact(pop);
            n=n/10;
        }
        return sum==temp;

    }
    public static int fact(int no){
        int fact=1;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        return fact;
    }
}
