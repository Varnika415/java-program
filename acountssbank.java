class BankAccount{
    int balance=10000;
    public synchronized void withdrawal(int amount,String name){
        System.out.println("Customer try to withdrawl Rs."+amount +" by customer "+name );
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawal Successful");
        }
    }
}
class Customers extends Thread{
    BankAccount acc;
    String custname;
    int amt;
    Customers(String name,int amount,BankAccount c){
        custname=name;
        amt=amount;
        acc=c;
    }
    public void run(){
        acc.withdrawal(amt,custname);
    }
}
public class acountssbank{
    public static void main(String arg[]){
        BankAccount account=new BankAccount();
        Customers c1=new Customers("aman",5000,account);
        Customers c2=new Customers("ayush",7000,account);
        c1.start();
        c2.start();
    }
}