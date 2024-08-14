import java.util.*;
class conversation{ 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter bye! to exit chat!");
        while(true){
            System.out.print("Java:");
            String a=input.nextLine();
            if(a.equals("Bye"))break;
            System.out.print("Python:");
            String b=input.nextLine();
            if(b.equals("Bye"))break;
        }
    }    
}