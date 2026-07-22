package day10;
import java.util.*;
public class reverseString {
    public static void main(String[]args){
        String name="hello world";
        char[] ch=name.toCharArray();
        int start=0;int end =ch.length-1;
        while(start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String str=new String(ch);
        System.out.println(str);
    }
}
