package day6;
import java.util.*;
public class binary_triangle {
    public static void main(String[]args){
        int num=5;
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                int add=i+j;
                if(add%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
    }
    }
}
