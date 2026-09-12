import java.util.*;
public class Exam{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        try{
            if(n==0){
                throw new ArithmeticException();
            }
            for(int i=0;i<n;i++){
                int mark=sc.nextInt();
                if(mark<0 || mark>100){
                    throw new Exception("Marks must be between 0 and 100");
                    
                }
                sum+=mark;
                double av=sum/n;
                System.out.println("Average marks: " + av);
            }
        }
        catch(ArithmeticException a){
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}