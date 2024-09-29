class myCustomException extends Exception{
    myCustomException(){
        super("DEFAULT SAME CUSTOM MESSAGE");
    }
}
class checker{
    void method(int num){
        int result=num/0;
        System.out.println("Result"+result);
    }
    void method(String msg) throws myCustomException{
        throw new myCustomException();
    }
}
public class methodOverloadingCheckedUnchecked {
    public static void main(String[] args) {
        checker check=new checker();
        System.out.println("2022503003\nR.Prabhakara Arjun\n");
        try{
            check.method(5);
        }catch(Exception e){
            System.out.println("UNCHECKED EXCEPTION:"+e.getMessage());
        }
        try{
            check.method("Abi!!");
        } catch (myCustomException e) {
            System.out.println("CHECKED EXCEPTION:"+e.getMessage());
        }
    }
}
