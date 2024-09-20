package p1;
import p1.p2.*;
class hybrid_dog extends dog{
    hybrid_dog(){
        super();
        System.out.println(scientific_name);
        scientific_name="Canis lupus ";
        System.out.println(scientific_name);
    }
    public void sound(){
        System.out.println("dog's sound:");
        super.sound();
    }
}
class poly_3003{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003");
        animal abc=new animal();
        animal xyz=new dog();
        animal pqr=new cat();
        /*abc.sound();
        xyz.sound();
        pqr.sound();*/
        hybrid_dog diddy=new hybrid_dog();
        diddy.sound();
    }
}