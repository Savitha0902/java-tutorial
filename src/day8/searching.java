package day8;
import java.util.*;
public class searching {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        int n=rs.nextInt();
        int[] arr=new int[n];
        int target=rs.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=rs.nextInt();
        }
        System.out.println (search(arr,target));
    }
    public static int search(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


}
