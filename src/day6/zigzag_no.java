package day6;
import java.util.*;
public class zigzag_no {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.printf("%4d",num);
                num=num+5-j;
            }
            System.out.println();
        }
    }
}
