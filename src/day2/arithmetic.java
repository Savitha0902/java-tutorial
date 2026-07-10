package day2;
import java.util.*;
public class arithmetic {
    public static void main (String[] args){
        Scanner rs =new Scanner(System.in);
        System.out.println("enter a no:");
        int a=rs.nextInt();
        System.out.println("enter a no:");
        int b= rs.nextInt();
        int c=a+b;
        System.out.println("result:" +c);
        c=a-b;
        System.out.println("result:" +c);
        c=a*b;
        System.out.println("result:" +c);
        c=a%b;
        System.out.println("result:" +c);
        c=a/b;
        System.out.println("result:" +c);
        c=++a;
        System.out.println("result:" +c);
        c=b+=3;
        System.out.println("result:" +c);
    }
}
