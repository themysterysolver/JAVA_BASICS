import java.util.*;
class stringExtraction{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter input string!!");
        String s2=input.nextLine();
        //String s1="123abc456";
        String str="";
        for(char c:s2.toCharArray()){
            if(Character.isDigit(c)){
                str=str+c;
            }
        }
        System.out.println(str);
    }
}