package day4;
import java.util.*;
public class checkifanumbercontainszero {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value:");
        int num=input.nextInt();
        while (num!=0){
            int pop=num%10;
            if(pop==0){
                System.out.println("My number contains zero");
                break;
            }
            num=num/10;
        }
    }
}
