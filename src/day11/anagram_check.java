package day11;
import java.util.*;
public class anagramcheck {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
            String name1=rs.nextLine();
            String name2=rs.nextLine();
            int len1=name1.length();
            int len2=name2.length();
        if(len1!=len2) {
            System.out.println("not an anagram");
        }
                char[] s=name1.toCharArray();
                char[] v=name2.toCharArray();
                Arrays.sort(s);
                Arrays.sort(v);
                if(Arrays.equals(s,v)){
                    System.out.println("anagram");
                }
                else{
                    System.out.println("not an anagram");
                }
    }
}
