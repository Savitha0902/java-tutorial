package day2;
import java.util.*;
public class bitwise {
    public static void main(String[]args){
        Scanner rs =new Scanner(System.in);
        int a=rs.nextInt();
        int b=rs.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b);
        System.out.println(a>>b);
    }
}
