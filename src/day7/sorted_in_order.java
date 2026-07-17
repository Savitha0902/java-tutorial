package day7;
import java.util.*;
public class sorted_in_order {
    public static void main(String[]args){
        int[]a={1,2,3,4,8,6,7,8};
        boolean d=true;
        for(int i=0;i<a.length-1;i++ ){
            int b=a[i];
            int c=a[i+1];
            if(b<c){
                 d=true;
            }
            else{
                d=false;
                break;
            }
        }
        if(d){
            System.out.println("sorted");

        }
        else{
            System.out.println("Not sorted");
        }

    }
}
