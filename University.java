import java.util.Scanner;
class Stu{
    String name;
    String cname[];
    int cc;
    Scanner sc;
    Stu(String nam,Scanner s){
        name=nam;
        cname=new String[5];
        cc=0;
        sc=s;
    }
    void registerCourses(){
        if(cc>=5){
            
            System.out.println("Course cannot be registered");
        }
        else{
            String c=sc.nextLine();
            cname[cc++]=c;
            System.out.println("Course registered successfully");
        }
    }
    void displayCourse(){
        for(int i=0;i<cc;i++){
            System.out.println(cname[i]);
        }
    }
}
public class University {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Stu obj=new Stu(name,sc);
        obj.registerCourses();
        obj.registerCourses();
        obj.registerCourses();
        obj.registerCourses();
        obj.registerCourses();
        obj.displayCourse();
        obj.registerCourses();
        sc.close();
    }
}
