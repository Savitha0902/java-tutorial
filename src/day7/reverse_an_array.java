package day7;
import java.util.*;
public class reverse_an_array {
    public static void main(String[]args){
        int[] a=new int[5];
        int d=0;
        int[] num={1,2,3,4,5};
            for (int i = 0,j=-1; i < j; j--) {
                int first = num[i];
                int last=first;
                d = num[i];
                System.out.println(d);

            }
    }
}
