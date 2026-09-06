import java.util.Scanner;
class Patient{
    String pid;
    String name;
    int age;
    double temp;
    Patient(String id,String n,int a,double t){
        pid=id;
        name=n;
        age=a;
        temp=t;
    }
    void display(){
        if(temp>100.4){
            System.out.println("Fever");
        }
        else{
            System.out.println("Normal");
        }
    }
}
public class patientDemo {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        Patient obj=new Patient("P1234","Aman", 19, temp);
        obj.display();
        sc.close();
    }
}
