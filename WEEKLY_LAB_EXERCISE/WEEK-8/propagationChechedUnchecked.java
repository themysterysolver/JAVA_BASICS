class myException extends Exception{
    myException(String msg){
        super(msg);
    }
}
public class propagationChechedUnchecked {
    static void checkedException() throws myException{
        throw new myException("This is my custom exception");
    }
    static void uncheckedException(){
        int result=10/0;
        System.out.println("Result"+result);
    }
    public static void main(String[] args) {
        System.out.println("2022503003\nR.Prabhakara Arjun\n");
        try{
            uncheckedException();
        }catch(Exception e){
            System.out.println("Unchecked exception:"+e.getMessage());
        }
        try{
            checkedException();
        }
        catch(Exception e){
            System.out.println("Checked exception:"+e.getMessage());
        }
    }
}
