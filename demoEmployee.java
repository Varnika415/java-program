import java.util.Scanner;
class Employ{
    String name;
    double sal;
    Employ(String n,double s){
        name=n;
        sal=s;
    }
    void display(){
        System.out.println("Name: " + name + ",Salary: "+ sal);
    }
}
class Manager extends Employ{
    double bonus;
    Manager(String n,double s,double b){
        super(n,s);
        bonus=b;
    }
    void setSal(){
        sal+=bonus;
    }
}
public class demoEmployee {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        String nam=sc.nextLine();
        double sl=sc.nextDouble();
        double b=sc.nextDouble();
        Manager obj=new Manager(nam,sl,b);
        obj.setSal();
        obj.display();
        sc.close();
    }
}
