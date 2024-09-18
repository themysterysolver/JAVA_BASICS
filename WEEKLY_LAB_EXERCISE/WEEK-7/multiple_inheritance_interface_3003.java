import java.util.Scanner;

interface animal1{
    String scientific_name="";
    String family="Animalia";
    String name="";
    public void eat();

    void details();
    void details(Boolean a);
    public void sound();
}
interface plant {
    String scientific_name="";
    String family="plantae";
    String mode_of_nutritent="";
}
class organisms implements plant,animal1 {//if implements it should redfine all the methods!!!
    public void eat(){
        System.out.println("Eating.....");
    }
    public void details(){}
    public void details(Boolean a){//should be public

    }
    public void sound(){}

}

public class multiple_inheritance_interface_3003 {
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        System.out.println("This sucessfully implements multiple inheritance!!");
    }
}
