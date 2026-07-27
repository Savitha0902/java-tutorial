package day11;
import java.util.*;
public class longest_Word_in_aString {
    public static void main(String[]args){
       String name="the dog is playing with its toys";
        String []words=name.split(" ");
        String longword=words[0];
        for(String arr:words){
            if(arr.length()>longword.length()){
                longword=arr;
            }
        }
        System.out.println(longword);


    }
}
