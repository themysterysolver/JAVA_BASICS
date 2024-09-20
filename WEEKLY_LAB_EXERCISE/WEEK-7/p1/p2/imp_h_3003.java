package p2;
import java.util.*;
public class animal{
    String scientific_name="";
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
public class dog extends animal{
    dog(){
        scientific_name="Canis lupus familiaris";
    }
    public void sound(){
        System.out.println("ruff!ruff!");
    }

}
public class cat extends animal{
    cat(){
        scientific_name="felis catus";
    }
    public void sound(){
        System.out.println("meow!meow!!");
    }
}
public class lion extends animal{
    lion(){
        scientific_name="panthera leo";
    }
    public void sound(){
        System.out.println("ROARS!!");
    }
}
