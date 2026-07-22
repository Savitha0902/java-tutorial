package day10;
import java.util.*;
public class Stringoperations {
    public static void main(String[] args) {
        /*StringBuilder name = new StringBuilder("hello");
        StringBuilder name1 = new StringBuilder("helloi");
        System.out.println(name==name1);
        String name2 = name.toString();
        String name3 = name1.toString();
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));
        System.out.println(name2.compareTo(name3));*/
        String name="hello World";
        System.out.println(name.replace('o','x'));
        System.out.println(name.replaceAll("hello World" ,"hiii rax"));
        //contains
        String rs="the quick fox";
        System.out.println(rs.contains("fox"));
        //split
        String rss="hello World java";
        String[]arr=rss.split(" ");
        for(String num:arr){
            System.out.println(num);
        }
        String sar="apple,banana,kiwi";
        String[]arr1=sar.split(",");
        for(String value:arr1){
            System.out.println(value);
        }
        //append&instert
        StringBuilder namee=new StringBuilder("hello");
        namee.append("world");
        namee.insert(2,"oo");
        namee.insert(5,100);
        //replace
        namee.replace(0,5,"savi");
        System.out.println(namee);

    }
}
