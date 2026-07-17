package day7;
import java.util.*;
public class average {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int sum=0;
        int[]a=new int[10];
        for(int i=0;i<10;i++){
            int b=rs.nextInt();
            a[i]=b;
        }
        int length=a.length;
        for(int num:a){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
