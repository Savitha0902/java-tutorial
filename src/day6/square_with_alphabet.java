package day6;
import java.util.*;
public class square_with_alphabet {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        char letter='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }


    }
}
