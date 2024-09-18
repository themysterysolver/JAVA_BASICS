
class parent {
    void print() {
        System.out.println("print() with nothing passed as parameter!!");
    }
    void print(int a) {
        System.out.println("print() when parameter is passed!!");
    }
}
class child{
    void print(){
        System.out.println("print() override!!");
    }
    void print(int a){
        System.out.println("print(parameter) is overloaded in child!!");
    }
}

public class polymorphism_3003 {
    public  static  void  main(String[] args) {
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        child a=new child();
        a.print();
        a.print(1);
        parent b=new parent();
        b.print();
        b.print(1);
    }
}
