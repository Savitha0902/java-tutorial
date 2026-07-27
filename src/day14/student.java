package oops_day3;
import java.util.Scanner;
class Stu{
    int id;
    String name;
    int marks;
    Stu(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
   boolean isPass() {
            return marks>=50;
    }
    void display(){
        System.out.println("id:" +id);
        System.out.println("name:"+name);
        System.out.println("marks:"+marks);
    }

}
public class student {
    public static void main(String[] args){
        Scanner rs=new Scanner(System.in);
        Stu[]arr=new Stu[5];
      for(int i=0;i<5;i++) {
          System.out.println("enter details of the student"+(i+1));
          System.out.println("id:");
          int id=rs.nextInt();
          System.out.println("name:");
          String name=rs.next();
          System.out.println("marks");
          int marks=rs.nextInt();
          arr[i]=new Stu(id,name,marks);

      }
        for(int i=0;i<5;i++) {
            if (arr[i].isPass()) {
                arr[i].display();
            }
        }
      }

}
