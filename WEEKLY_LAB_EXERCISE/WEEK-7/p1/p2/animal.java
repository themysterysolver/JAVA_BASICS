package p1.p2;
import java.util.*;
public class animal{
    public String scientific_name="";
    String family="Animalia";
    String name="";
    public void eat(){
        System.out.println("Eating.....");
    }
    void details(){
        System.out.println("FAMILY:"+family+" Name:"+name);
    }
    public void sound(){
        System.out.println("drow........");
    }

    void details(Boolean a){
        if(a){
            System.out.println("FAMILY:"+family+" Name:"+name+" Scientific_name:"+scientific_name);
        }
    }
    void theMethod(){
        details();
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER NAME FOR THE ANIMAL:"+scientific_name+"\nENTER NAME OF UR ANIMAL:");
        name=input.nextLine();
        details();
        details(true);
        System.out.println("-----------------------------------------------");
    }
}