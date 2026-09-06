import java.util.Scanner;
class Marks{
    String name;
    int marks[];
    int total=0;
    double percentage;
    Marks(String name){
        this.name=name;
        marks=new int[5];
    }
    void setMarks(){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            int m=sc.nextInt();
            marks[i]=m;
        }
    }
    double getPercent(){
        for(int i=0;i<5;i++){
            total+=marks[i];
        }
        percentage=total/5.0;
        return percentage;
    }
    void display(double percentage){
        if(percentage>=90){
            System.out.println("A+");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println("A");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("B");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("C");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}
public class Grade {
    public static void main(String arg[]){
        Marks obj=new Marks("Aastha");
        obj.setMarks();
        double p=obj.getPercent();
        obj.display(p);
    }
}
