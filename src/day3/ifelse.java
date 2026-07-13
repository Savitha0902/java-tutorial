package day3;
/*
import java.util.*;
public class ifelse{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=input.nextInt();
        if(a>0) {
            System.out.println("the number is positive");
        }
        else{
            System.out.println("the  number is negative");
        }

    }
}
*/
import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = input.nextInt();
        if (a%5 == 0) {
            System.out.println("The given number is divisible by 5");
        }
        else {
            System.out.println("The given number is not divisible by 5");
        }
    }
}

/*
import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = input.nextInt();
        if (a > 50) {
            System.out.println("pass");
        } else{
        System.out.println("Fail");
    }
    }
}*/
/*import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = input.nextInt();
        if (a > 18) {
            System.out.println("eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }
}*/