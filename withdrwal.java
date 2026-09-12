import java.util.*;
public class withdrwal {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        try{
            int balance=sc.nextInt();
            int amount=sc.nextInt();
            if(amount>balance){
                System.out.println("Insufficient balance");
            }
            else{
                System.out.println("Withdrwal successful. Remaining balance: " +
                (balance-amount));
                balance=balance-amount;
            }
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
