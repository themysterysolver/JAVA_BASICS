
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
}
class dog extends animal{
    dog(){
        scientific_name="Canis lupus familiaris";
    }
    public void sound(){
        System.out.println("ruff!ruff!");
    }

}
public class single_inheritance_3003 {
    public static void main(String[] args) {
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        dog a=new dog();
        a.details();
        a.name="Jimmy";
        a.sound();
        a.details();
        a.eat();
    }
}
