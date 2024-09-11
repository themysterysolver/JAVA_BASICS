import java.util.*;
public class J53_3003 {
    public static String helper(String s){
        if(s.indexOf("not")<s.indexOf("bad")){
            String modified="";
            modified=s.substring(0,s.indexOf("not"))+"good"+s.substring(s.indexOf("bad")+3,s.length());
            return modified;
        }
        else{
            return s;
        }
    }
    public static  void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER STR TO CHECK EX_3:");
        String our_str= input.nextLine();
        /*String str="Food is not audfba bad!!!.";*/
        String new_str=helper(our_str);
        System.out.println(new_str);
    }
}
