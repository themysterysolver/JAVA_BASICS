import java.util.*;
class animal{
    String scientific_name="";
    String family="Animalia";
    String name="";
    public void eat(){
        System.out.println("Eating.....");
    }
    void details(){
        System.out.println("FAMILY:"+family+" Name:"+name);
    }
    public void sound(){}

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
class dog extends animal{
    dog(){
        scientific_name="Canis lupus familiaris";
    }
    public void sound(){
        System.out.println("ruff!ruff!");
    }

}
class cat extends animal{
    cat(){
        scientific_name="felis catus";
    }
    public void sound(){
        System.out.println("meow!meow!!");
    }
}
class lion extends animal{
    lion(){
        scientific_name="panthera leo";
    }
    public void sound(){
        System.out.println("ROARS!!");
    }
}
public class heirarchy_3003 {
    public static void main(String[] args) {
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        dog a=new dog();
        a.theMethod();
        lion b=new lion();
        b.theMethod();
        cat c=new cat();
        c.theMethod();
    }
}
