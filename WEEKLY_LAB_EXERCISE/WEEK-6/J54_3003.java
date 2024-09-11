import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J54_3003 {
    public static HashMap<Character,Integer> frequency(String s){
        HashMap<Character,Integer> hasher=new HashMap<>();
        for(char c:s.toCharArray()){
            if(hasher.containsKey(c)){
                hasher.put(c,hasher.get(c)+1);
            }
            else{
                hasher.put(c,1);
            }
        }
        return hasher;
    }
    public static void display(HashMap<Character,Integer> f){
        System.out.print("The key value pairs are:");
        for(Map.Entry<Character,Integer> entry:f.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }

    }
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        System.out.println("FREQUENCY CHECKER:\n------------------\n");
        //String our_str="hello abi!";
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER STR TO CHECK FREQUENCY:");
        String our_str= input.nextLine();
        HashMap<Character,Integer> freq=frequency(our_str);
        display(freq);
        //System.out.println(freq);
    }
}
