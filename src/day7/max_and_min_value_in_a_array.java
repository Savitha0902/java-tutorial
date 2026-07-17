package day7;
import java.util.*;
public class max_and_min_value_in_a_array {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int[] num=new int[5];
        /*for(int i=0;i<5;i++){
            int a=rs.nextInt();
            num[i]=a;
        }
        int max=num[0];
        int min=num[0];
        for(int value:num){
            if(value>max){
                max=value;
            }
           else if(value<min){
                    min=value;
            }
        }*/
        int[] a={1,2,3,4,5};
        int max=a[0];
        int min=a[0];
        for(int value:a)
        System.out.println(max);
        System.out.println(min);
    }
}
