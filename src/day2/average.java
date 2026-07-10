package day2;
import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("enter the marks for subject1:");
        int a=rs.nextInt();
        System.out.println("enter the marks for subject2:");
        int b=rs.nextInt();
        System.out.println("enter the marks for subject3:");
        int c=rs.nextInt();
        System.out.println("enter the marks for subject4:");
        int d=rs.nextInt();
        System.out.println("enter the marks for subject5:");
        int e=rs.nextInt();
        int f=a+b+c+d+e;
        double total=f/5.0;
        System.out.println("average marks:" +total);


    }
}