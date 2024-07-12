//everything in java is pass by value!!
//pass-by-copy!!
class Dog{
    int size=0;
    void bark(int sizehh){ //this is a parameter
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
class Addition{
    int sum=0;
    void setSum(int a,int b){ //setters
        sum=a+b;
    }
    int getSum(){ //getters
        return sum;
    }
}
public class StateAndBehaviour{
    public static void main(String[] args){
        Dog a=new Dog();
        a.size=45;
        a.bark(a.size);

        Dog b=new Dog();
        b.size=70;
        b.bark(b.size);

        Addition i=new Addition();
        int h=100;
        int j=200;
        i.setSum(h,j);
        System.out.println(h+"+"+j+"="+i.getSum());

    }
}