package day8;
import java.util.*;
public class bubble_sorting {
    public static void main(String[]args){
        int []arr={1,5,4,2,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }
            }
            for(int num:arr){
                System.out.println(num);
            }
        }

    }
}