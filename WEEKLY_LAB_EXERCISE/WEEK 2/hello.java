import java.util.*;
class hello{
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Hello!Good morning!");
        }
        else{
            System.out.printf("Hello,%s,Good Morning!",args[0]);
        }
    }
}