import java.util.Scanner;

interface Payment{
    public void pay(double amount);
}
class creditCard implements Payment{
    public void pay(double amount){
        System.out.println("Payment of Rs."+amount+" by using Credit Card");
    }
}
class debitCard implements Payment{
    public void pay(double amount){
        System.out.println("Payment of Rs."+amount+" by using Debit Card");
    }
}
class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Payment of Rs."+amount+" by using UPI");
    }
}
public class paymentDd{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Payment paym;
        switch (choice) {
            case 1:
                paym=new creditCard();
                break;
            case 2:
                paym=new debitCard();
                break;
            case 3:
                paym=new UPI();
                break;
            default: System.out.println("Cannot pay");
                sc.close();
                return;
        }
        paym.pay(1000.09);
    }
}