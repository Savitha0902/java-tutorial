package day7;
import java.util.*;
public class second_largest_element {
    public static void main(String[]args){
        int[][] num={{1,2,3},{4,5,6}};
        int large=0;
        int second=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                int value=num[i][j];
                if(value>large){
                    second=large;
                    large=value;
                }
                else if(value<large&&value!=large){
                    second=value;

                }

            }
        }
        System.out.println(second);
    }
}
