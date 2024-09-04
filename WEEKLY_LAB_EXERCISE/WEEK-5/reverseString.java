import java.util.*;
class reverseString{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter input string!!");
        String s2=input.nextLine();
        String s1="Hello world";
        String rev="";
        for(char c:s2.toCharArray()){
            rev=c+rev;
        }
        System.out.println("STRING:"+s2+"\nREVERSED STRING:"+rev);
    }
}