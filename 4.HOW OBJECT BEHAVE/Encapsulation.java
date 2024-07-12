
class Dog{
    private int size=0;
    public int getSize(){
        return size;
    }
    public void setSize(int num){
        if(num>10){//sets boundary of minimum size!!
            size=num;
        }
        else{
            System.out.print("entered size is less than range!");
        }
    }
    void bark(int sizehh){ 
        if(sizehh<100 && sizehh>=50){
            System.out.println("Ruff!Ruff!");
        }
        else if(sizehh<50 && sizehh>30){
            System.out.println("woof!woof!");
        }
        if(sizehh<30){
            System.out.println("yipyip!yipyip!");
        }
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Dog a=new Dog();
        //a.size=45;//encapsulation.java:28: error: size has private access in Dog..this is what happens if executes!
        a.setSize(45);
        a.bark(a.getSize());

        Dog b=new Dog();
        b.setSize(70);
        b.bark(b.getSize());

        Dog c=new Dog();
        c.setSize(7);
        c.bark(c.getSize());

    }
}