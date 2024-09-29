import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class differentTypesOfException {
    static void  checkAge(int a){
        if(a<18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }
    }
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Integer[] arr=new Integer[5];
        try{
            int a=arr[5];
            System.out.println();
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
            Object[] x=new String[3];
            x[0]=1;
        }
        catch(ArrayStoreException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
           Object a="hello";
           Integer b=(Integer)a;
        }
        catch(ClassCastException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
            checkAge(15);
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
            ArrayList<Integer> arr1=new ArrayList<>();
            arr1.add(1);
            System.out.println(arr1.get(2));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
            String[] arr2=new String[-5];
        }
        catch(NegativeArraySizeException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
           String b=(null);
           b.toUpperCase();
        }
        catch(NullPointerException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
            String her="abi!!";
            her.charAt(10);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
        try{
            List<String> unmodifieable= List.of("A","B");
            System.out.println(unmodifieable);
            unmodifieable.add("c");
        }
        catch(UnsupportedOperationException e){
            System.out.println("Exception:"+e.getClass().getName());
            System.out.println("Exception message:"+e.getMessage());
            System.out.println();
        }
    }
}

