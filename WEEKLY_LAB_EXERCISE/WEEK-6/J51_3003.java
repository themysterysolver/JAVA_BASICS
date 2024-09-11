import java.util.*;
public class J51_3003{
    public static void main(String[] args) {
        /*String str=new String("Can you write a whole paragraph without the letter a? Your sentences will sound wrong.\n" +
                "Everyone will notice something weird. You will use uncommon words.");
        String substr=new String("you");*/
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER PARAGRAPH:");
        String str= input.nextLine();
        System.out.print("\nENTER KEY:");
        String substr= input.nextLine();
        int count=0;
        String check="";
        for(int i=0;i<str.length();i++){
            if(check.toLowerCase().contains(substr.toLowerCase())){
                count++;
                check="";
            }
            check=check+str.charAt(i);
        }
        check="";
        System.out.println(substr+" FOUND:"+count);
    }
}