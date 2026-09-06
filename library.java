class Book{
    String id;
    String title;
    String author;
    boolean av;
    Book(String bid,String t,String a){
        id=bid;
        title=t;
        author=a;
        av=true;
    }
    void issueBook(){
        if(av){
            av=false;
            System.out.println("Book issued");
        }
        else{
            System.out.println("Not issued");
        }
    }
    void returnBook(){
        if(!av){
            System.out.println("Book returned successfully");
            av=true;
        }
        else{
            System.out.println("Not returned");
        }
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + id);
    }
}
public class library {
    public static void main(){
        Book b=new Book("BF123","A Mysterious World","Ruskin Bond");
        b.display();
        b.issueBook();
        b.returnBook();
    }
}
