package oops_day2;
class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void setstudent(int id,String name){
        this.id=id;
        this.name=name;
    }
     int geta(){
         return this.id;
    }
    String getb(){
        return this.name;
    }
    void display(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }
}
class mentor extends Student{
    int mentorid;
    String mentorname;
    mentor(int id,String name,int mentorid,String mentorname){
        super(id,name);
        this.mentorid=mentorid;
        this.mentorname=mentorname;
    }
    void setmentor(int mentorid,String mentorname){
        this.mentorid=mentorid;
        this.mentorname=mentorname;
    }
    int getc(){
        return this.mentorid;
    }
    String getd(){
        return this.mentorname;
    }
    void dis(){
        System.out.println("mentorid:"+mentorid);
        System.out.println("mentorname:"+mentorname);
    }
}
class hod extends mentor{
    int hodid;
    String hodname;
    hod(int id,String name,int mentorid,String mentorname,int hodid,String hodname){
        super(id,name,mentorid,mentorname);
        this.hodid=hodid;
        this.hodname=hodname;
    }
    void sethod(int hodid,String hodname){
        this.hodid=hodid;
        this.hodname=hodname;
    }
    int gete(){
        return this.hodid;
    }
    String getf(){
        return this.hodname;
    }
    void show(){
        System.out.println("hodid:"+hodid);
        System.out.println("hodname:"+hodname);
    }

}
public class student_management {
    public static void main(String[]args){
        hod obj2=new hod(100,"savi",96,"raji",70,"jack");
        obj2.display();
        obj2.dis();
        obj2.show();
    }
}
