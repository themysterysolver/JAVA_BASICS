class myCustomException2 extends Exception{
    myCustomException2(){
        super("Ha Ha Ha....This is a default message!");
    }
}
class baseClass{
 void unChecked(){
     throw new IndexOutOfBoundsException("base class index out of bound!");
 }
 void checked() throws myCustomException,myCustomException2{
     throw new myCustomException();
 }
}
class dervidedClass extends baseClass{
    void unChecked(){
        throw new ArithmeticException("derived class arithmetic exception");
    }
    void checked() throws myCustomException2{
        throw new myCustomException2();
    }
}
public class overrideCheckedUnchecked {
    public static void main(String[] args) {
        System.out.println("2022503003\nR.Prabhakara Arjun\n");
        baseClass derive = new dervidedClass();
        try {
            derive.unChecked();
        }catch (Exception e){
            System.out.println("This is a unchecked exception from derived class:"+e.getMessage());
        }
        try {
            derive.checked();
        }
        catch(Exception e){
            System.out.println("This is a checked exception from derived class:"+e.getMessage());
        }
        baseClass base=new baseClass();
        try {
            base.unChecked();
        }catch (Exception e){
            System.out.println("This is a unchecked exception from base class:"+e.getMessage());
        }
        try {
            base.checked();
        }
        catch(Exception e){
            System.out.println("This is a checked exception from base class:"+e.getMessage());
        }
    }
}
