import java.util.*;
public class booking{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        try{
            int age=sc.nextInt();
            int av=sc.nextInt();
            int bs=sc.nextInt();
            if(age<=0){
                System.out.println("Age must be greater than zero");
            }
            else if(bs<=0){
                System.out.println("Invalid number of seats");
            }
            else if(bs>av){
                System.out.println("Seats exceed available seats");
            }
        }
        catch(Exception e){
            System.out.println("Enter number");
        }
        System.out.println("Out of bboking site");
    }
}