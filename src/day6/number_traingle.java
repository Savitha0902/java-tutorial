package day6;
import java.util.*;
public class number_traingle {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
