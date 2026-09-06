import java.util.Scanner;
class ATM{
    int pin;
    double balance;
    ATM(double m,int pp){
        pin=pp;
        balance=m;
    }
    void deposit(int m){
        balance+=m;
    }
    void withdraw(double m){
        balance-=m;
    }
    void checkPin(){
        Scanner sc=new Scanner(System.in);
        int p= sc.nextInt();
        System.out.println("Enter pin: "+p);
        int attempt=1;
        while(attempt<3){
            if(p==pin){
                System.out.println("Correct pin");
                break;
            }
            System.out.print("Enter pin: ");
            p=sc.nextInt();
            attempt++;
        }
        if(attempt>=3){
            System.out.println("Try after some time");
        }
        sc.close();
    }
}
public class atmDemo {
    public static void main(){
        Scanner s=new Scanner(System.in);
        int pins=s.nextInt();
        double bal=s.nextDouble();
        ATM obj=new ATM(bal,pins);
        obj.deposit(1000);
        obj.withdraw(500);
        obj.checkPin();
        s.close();
    }
}
