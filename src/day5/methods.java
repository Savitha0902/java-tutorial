package day5;
import java.util.*;
public class methods {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int a=rs.nextInt();
        int b=rs.nextInt();
        add4();
       // System.out.println(c);

    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static void add2(int a,int b){
        System.out.println(a+b);
    }
    public static int add3() {
        return 1;
    }
    public static void add4(){
        System.out.println("hello");
    }
}
