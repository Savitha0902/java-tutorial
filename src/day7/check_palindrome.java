package day7;
import java.util.*;
public class check_palindrome {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int[]a={1,2,3,1};
        boolean palindrome=true;
        for(int i=0;i<a.length/2;i++){
            if(a[i]!=a[a.length-1-i]){
                palindrome=false;
                break;
            }
        }
        if(palindrome){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("its not palindrome");
        }


    }
}
