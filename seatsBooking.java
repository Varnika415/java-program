class BookSeats{
    int av=5;
    public synchronized void book(int seat,String name){
        System.out.println("Booking "+ seat+" seats by "+ name);
        if(av>=seat){
            System.out.println("Booking successful of " + name);
            av=av-seat;
        }
        else{
            System.out.println("Cannot have seat in threate");
        }
    }
}
class custom extends Thread{
    BookSeats s;
    int ns;
    String cname;
    custom(String n,int st,BookSeats bs){
        s=bs;
        ns=st;
        cname=n;
    }
    public void run(){
        s.book(ns,cname);
    }
}
public class seatsBooking {
    public static void main(String arg[]){
        BookSeats s1=new BookSeats();
        custom c1=new custom("arun",3,s1);
        custom c2=new custom("shiv",2,s1);
        custom c3=new custom("swati",4,s1);
        c1.start();
        c2.start();
        c3.start();
    }
}