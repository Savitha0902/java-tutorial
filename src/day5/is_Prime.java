package day5;
import java.util.*;
public class is_Prime {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=rs.nextInt();
        boolean isPrime=true;
        if(num<=1) {
            isPrime = false;

        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }
        }

        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("false");
        }
    }
}
