package day4;
import java.util.Random;
import java.util.Scanner;
public class guess_the_no {
    public static void main(String[]args){
        Scanner rs=new Scanner(System.in);
        Random rand=new Random();
        int key=rand.nextInt(100);
        int guess;
        do{
            System.out.println("enter the value of your guess:");
            guess =rs.nextInt();
            if(guess>key){
                System.out.println("guess is too high");
            }
            else if(guess<key){
                System.out.println("guess is too low");
            }
        }
        while(key!=guess);
        System.out.println("you guessed it");
    }
}
