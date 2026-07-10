package day2;
import java.util.*;
public class logical  {
    public static void main(String[] args){
        Scanner rs =new Scanner(System.in);
        System.out.println("enter a no:");
        int a=rs.nextInt();
        System.out.println("enter a no:");
        int b=rs.nextInt();
       boolean c=((a>5)&&(b<10));
        System.out.println(c);
        System.out.println((a>5)||(b>10));
        System.out.println(!(a>5));

    }
}
