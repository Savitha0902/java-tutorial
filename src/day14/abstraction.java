package oops_day3;
abstract class animal{
    abstract public void makesound();
    void makingsound(){
        System.out.println("makesound");
    }
}
class dog extends animal{
    public void makesound(){
        System.out.println("bow bow");
    }
}
class cat extends animal{
    public void makesound(){
        System.out.println("meow meow");
    }
}
public class abstraction {
    public static void main(String[]args){
        animal dog=new dog();
        animal cat=new cat();
        dog.makesound();
        cat.makesound();
        cat.makingsound();

    }
}
