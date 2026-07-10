package day2;
import java.util.*;
public class if_number_positive {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int a=rs.nextInt();
        if(a>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}