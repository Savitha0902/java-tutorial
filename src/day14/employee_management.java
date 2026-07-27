package oops_day3;
abstract class employee{
    protected String name;
    protected int id;
    protected int salary;
    employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    abstract  void bonus();
}
class manager extends employee{
      manager(String name, int id, int salary){
         super(name,id,salary);
    }
    public void bonus(){
        System.out.println(salary+salary*0.10);
    }
}
class developer extends employee{
    developer(String name, int id, int salary){
        super(name,id,salary);
    }
    public void bonus(){
        System.out.println(salary+salary*0.05);
    }
}
class intern extends employee{
    intern(String name, int id, int salary){
        super(name,id,salary);
    }
     public void bonus(){
        System.out.println(salary);
    }
}
public class emloyee_management {
    public static void main(String[]args){
        employee a=new manager("savi",2,50000);
        employee b=new developer("raji",3,45000);
        employee c=new intern("sarvesh",4,25000);
        a.bonus();
        b.bonus();
        c.bonus();
    }
}
