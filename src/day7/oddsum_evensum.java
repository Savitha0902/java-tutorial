package day7;
import java.util.*;
public class oddsum_evensum {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int[] a=new int[5];
        int[] b={1,3,2,4,5};
        int odd=0;
        int even=0;
        int value=0;
        for(int i=0;i<5;i++){
            value=b[i];
            if(value%2==0){
                even+=value;
            }
            else if(value%2!=0){
                odd+=value;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
