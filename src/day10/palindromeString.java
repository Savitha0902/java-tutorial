package day10;
import java.util.*;
public class palindromeString {
    public static void main(String[]args){
        String name="ava";
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
        System.out.println(name.equals(str)?"yes":"no");
    }
}
