package day8;
import java.util.*;
public class search_element_in_2d {
    public static void main(String[]args){
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        if(search(a,target)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

    }
    public static boolean search(int[][]a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(target==a[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
