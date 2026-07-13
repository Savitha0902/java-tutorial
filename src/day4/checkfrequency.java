package day4;
import java.util.*;
public class checkfrequency {
    public  static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int key=sc.nextInt();
        int count=0;
        while(num!=0){
            int pop=num%10;
            if(pop==key){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
