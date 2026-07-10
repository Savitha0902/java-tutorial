
package day2;
import java.util.*;
public class assignment {
    public static void main(String[] args){
        Scanner rs=new Scanner(System.in);
        System.out.println("enter your salary per day:");
        int a=rs.nextInt();
        int c=a*30;
        System.out.println("Salary per month:" +c);
        c=a*365;
        System.out.println("Salary per year:" +c);


    }

}
