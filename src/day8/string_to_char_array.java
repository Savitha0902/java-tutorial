package day8;
import java.util.*;
public class string_to_char_array {
    public static void main(String[] args) {
        String name = "hello guys";
        char[] ch = name.toCharArray();
        char target = 's';
        if (search(ch,target)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
    public static boolean search(char[] ch, char target) {
        for (char num : ch) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
