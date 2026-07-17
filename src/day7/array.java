package day7;
import java.util.*;
public class array {
    public static void main(String[]args) {
        Scanner rs = new Scanner(System.in);
        /*int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int a = rs.nextInt();
            arr[i] = a;

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        for(int num:arr){
        System.out.println(num);
    }*/
        /*char[] ch=new char[5];
        for(int i=0;i<5;i++){
            char a=rs.next().charAt (0);
            ch[i]=a;
        }
        for( char letter:ch){
            System.out.println(letter);
        }*/
        String[] a=new String[5];
        for(int i=0;i<5;i++){
            String b=rs.next();
            a[i]=b;
        }
        for(String name:a){
            System.out.println(name);
        }
        int length=a.length;
        System.out.println(length);
    }
}
