import java.util.*;
public class collection {
    public static void main(String arg[]){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        System.out.println("Original: " + al);
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);
    }
}
