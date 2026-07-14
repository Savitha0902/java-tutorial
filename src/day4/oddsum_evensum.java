package day4;
import java.util.*;
public class oddsum_evensum {
    public static void main(String[] args){
        Scanner rs =new Scanner(System.in);
        int n=rs.nextInt();
        int sum=0;
        int evensum=0;
        int oddsum=0;
        while(n!=0){
            int pop=n%10;
            if(pop%2==0){
                evensum+=pop;
            }
            else{
                oddsum+=pop;
            }
            sum+=pop;
            n=n/10;
        }
        System.out.println("the sum is:"+sum);
        System.out.println(("odd sum:" +oddsum));
        System.out.println("evensum:"+evensum);

    }
}
