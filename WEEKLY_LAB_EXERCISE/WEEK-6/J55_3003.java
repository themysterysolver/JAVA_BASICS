import java.util.*;
public class J55_3003 {
    public static Boolean pangram(String s){
        Boolean[] check=new Boolean[26];
        //System.out.println(Arrays.toString(check));
        int count=0;
        for(char c:s.toLowerCase().toCharArray()) {
            if(check[(int)c-97]==null){
                check[(int)c-97]=true;
                count++;
            }
        }
        //System.out.println(count);
        //System.out.println(Arrays.toString(check));
        if(count!=26){
            System.out.print("The missing letters is(are):");
            for(int i=0;i<check.length;i++){
                if(check[i]==null){
                    System.out.print(" "+(char)(i+97));
                }
            }
            System.out.println();
        }
        return (count==26)?true:false;
    }
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER STR TO CHECK PANGRAM:");
        String our_string= input.nextLine();
        //String our_string="efghijklmonpqrstuvwxyz";
        Boolean flag=pangram(our_string);
        if(flag){
            System.out.println(our_string+"is a panagaram");
        }
        else{
            System.out.println(our_string+"is NOT a panagaram");
        }
    }
}
