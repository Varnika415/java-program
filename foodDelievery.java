class ThrMethod extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread Do What: "+Thread.currentThread().getName());
            System.out.println("Task completed");
        }
    }
}
public class foodDelievery {
    public static void main(String arg[]){
        ThrMethod t1=new ThrMethod();
        ThrMethod t2=new ThrMethod();
        t1.setName("Cooks");
        t2.setName("Deliever");
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println("Showing error in running");
        }
        t2.start();
    }
}