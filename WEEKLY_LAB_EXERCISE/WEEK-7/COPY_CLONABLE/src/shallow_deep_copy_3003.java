
import java.lang.*;
class dog implements Cloneable{
    String name="";
    String breed="";
    User user_thing=new User();
    dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    void displayDetails() {
        System.out.println("Name of the " + name + ".Breed is " + breed + ".THe owner " + user_thing.name + ".His number is " + user_thing.number);
    }
    /*
    protected void finalize() throws Throwable {
        try {
            System.out.println("Object is being finalized.");
        } finally {
            // Ensure the base class finalize is also called
            super.finalize();
        }
    }*/
}
class User implements Cloneable{
    String name;
    int number;
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class shallow_deep_copy_3003 {
    public  static  void main(String[] args){
        System.out.println("R.Prabahakara Arjun\n2022503003\n");
        try {
            dog d1 = new dog("Jimmy","great dan" );
            dog d2 = (dog) d1.clone();
            d1.displayDetails();
            d2.displayDetails();
            System.out.println("comparing obj and clone:"+(d1==d2)+".comapring obj user and clone:"+(d1.user_thing==d2.user_thing));
            d2.name="Wippy";d2.breed="german sheepard";
            d1.displayDetails();
            d2.displayDetails();
            System.out.println("comparing obj and clone:"+(d1==d2)+".comapring obj user and clone:"+(d1.user_thing==d2.user_thing));
            System.out.println("SHALLOW COPY:\ncomparing obj and clone:"+(d1==d2)+".comapring obj user and clone:"+(d1.user_thing==d2.user_thing));
            d2.user_thing=(User) d2.user_thing.clone();
            System.out.println("DEEP COPY:\ncomparing obj and clone:"+(d1==d2)+".comapring obj user and clone:"+(d1.user_thing==d2.user_thing));
            d1=null;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.gc();
        System.out.println("garbage collection failed!!!");

    }
}
