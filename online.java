class Product{
    String pid;
    String name;
    double p;
    double quantity;
    Product(double price,double q,String st,String n){
        p=price;
        quantity=q;
        pid=st;
        name=st;
    }
    void display(){
        double bill=p*quantity;
        if(bill>5000){
            bill=bill-0.1*bill;
            System.out.println(bill);
        }
        else{
            System.out.println(bill);
        }
    }
}
public class online {
    public static void main(String arg[]){
        Product obj=new Product(100, 5, "Aman", "P108");
        obj.display();
    }
}
