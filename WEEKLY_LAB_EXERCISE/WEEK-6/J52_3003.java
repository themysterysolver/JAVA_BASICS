import java.util.*;
public class J52_3003 {
    public static String reverse(String s){
        String rev="";
        for(char c:s.toCharArray()){
            rev=c+rev;
        }
        return rev;
    }
    public static void main(String[] args){
        /*String our_str="abiba";
        String rev=reverse(our_str);
        System.out.println(our_str+"--->"+rev);*/
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER STR TO CHECK PALINDROME:");
        String our_str= input.nextLine();
        String rev=reverse(our_str);
        if(rev.equals(our_str)){
            System.out.println(our_str+" is a palindrome\n"+our_str+":"+true);
        }
        else{
            System.out.println(our_str+" is NOT a palindrome\n"+our_str+":"+false);
        }
    }
}
