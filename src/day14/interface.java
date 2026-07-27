package oops_day3;
interface A{
    void a();
}
interface B{
    void b();
}
class C implements A{
    public void a(){
        System.out.println("aa");
    }
    public void b(){
        System.out.println("bb");
    }
}
public class Interface {
    public static void main(String[]args){
        A obj=new C();
        obj.a();

    }
}
