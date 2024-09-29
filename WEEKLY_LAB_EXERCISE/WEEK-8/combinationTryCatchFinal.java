import javax.naming.AuthenticationNotSupportedException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class combinationTryCatchFinal {
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        try {
            System.out.println("TRY:try without catch");
        }
        finally {
            System.out.println("CATCH:try without catch\n");
        }
        try{
            throw  new IOException("TRY:with try-catch");
        }
        catch (IOException E){
            System.out.println(E.getMessage());
            System.out.println("CATCH:with try-catch\n");
        }
        try{
            throw  new IOException("TRY:with try-catch with finally");
        }
        catch (IOException E){
            System.out.println(E.getMessage());
            System.out.println("CATCH:with try-catch with finally");
        }
        finally {
            System.out.println("FINALLY:with try-catch with finally\n");
        }

        try{
            throw new IOException("TRY1:with try with multiple catch");
            //throw new ArithmeticException("TRY1:with try with multiple catch");
            //unreachable state
        }
        catch (IOException E){
            System.out.println(E.getMessage());
            System.out.println("CATCH1:with try with multiple catch");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("CATCH2:with try with multiple catch\n");
        }
        try{
            try{
                int a=5/0;
            }
            catch(ArithmeticException e){
                System.out.println("Catch Inner!");
            }
            finally {
                System.out.println("Inner finally!");
            }
            throw new NullPointerException();
        }
        catch(Exception b){
            System.out.println("Catch outter!!");
        }
        finally {
            System.out.println("outter catch!!\n");
        }

        try(BufferedReader a=new BufferedReader(new FileReader("hello.txt"))){
            System.out.println("File found!");
        }
        catch(IOException O){
            System.out.println("CATCH:file not found");
            System.out.println(O.getMessage());
            System.out.println();
        }




    }
}

