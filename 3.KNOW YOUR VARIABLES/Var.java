class Dog{
    String name="";
    String breed="";
    char sex;
    void display(){
        System.out.println("NAME:"+name+" BREED:"+breed+" SEX:"+sex);
    }
}
class Prim{ //8-Primitives!! Be Careful!Bear shouldn't Ingest Large Furry Dogs!-Boolean char Byte short Int Long float double 
    int x=10; //32bits
    char c='c';//16bit
    byte y=10;//8bit
    short z=10;//16bit
    long w=10;//32bit
    double d=1234.12;//64bit
    float f=1342.234f;//f is a must,else considered as double by default.//32bit
}
class Arr{
    int[] x= new int[10];//x is an array varaible
    void display(){
        int i=0;
        while(i<x.length){
            System.out.print(" "+x[i]);
            i=i+1;
        }
    }
}
public class Var{
    public static void main(String[] args){
        //Dog.display(); //non-static method display() cannot be referenced from a static context
        Dog jimmy; //creating a object reference varaible named jimmmy!!
        jimmy=new Dog();//creating a object in garbage collection heap,assigning it to object reference variable jimmy!!
        jimmy.name="jimmy";
        jimmy.breed="german shepard";
        jimmy.sex='M';
        jimmy.display();

        Dog a=new Dog();
        a.name="aaapa";
        a.breed="Husky";
        a.sex='F';
        a.display();

        Dog b=a;
        b.display();
        b.name="haapa";
        b.breed="Siberian Husky";
        b.sex='M';
        b.display();

        a.display();

        Arr y=new Arr();
        int i=0;
        while(i<y.x.length){
            y.x[i]=i;
            i=i+1;
        }
        y.display();
        Dog[] dogs;
        dogs=new Dog[4];
        dogs[0]=jimmy;
        dogs[1]=a;
        dogs[2]=b;
        dogs[3]=new Dog();
        dogs[3].name="luffy";
        dogs[3].breed="beagle";
        dogs[3].sex='F';
        i=0;
        System.out.println("");
        while(i<dogs.length){
            System.out.print(i+":");
            dogs[i].display();
            i++;
        }
    }
} 