import java.nio.file.Files; //nio-NEW I/O
import java.nio.file.Paths; //helps to get the txt file
import java.util.List;//interface
import java.util.Random; // Generate a random integer between 0 (inclusive) and a specified upper bound (exclusive) ie) random.nextInt(100)-->0 to 99
import java.util.Scanner;
import java.io.IOException;
import java.util.Map;//interface!
import java.util.ArrayList;
import java.util.HashMap;
class Game{
    String unknown;
    int count=0;
    Game(){
        try{
        List<String> word=Files.readAllLines(Paths.get("word.txt")); 
        Random r=new Random();
        unknown=word.get(r.nextInt(word.size()));
        System.out.println("THE WORD TO FIND IS:"+unknown);
        }
        catch(IOException e){
            System.out.println("oops,unable to load the game,try again!");
        }
        //Creating hash(key value pair)!
        createHash();
    }
    void createHash(){
        Map<Character,List<Integer>> indexMap=new HashMap<>();
        for(int i=0;i<unknown.length();i++){
            char c=unknown.charAt(i);
            if(Character.isLetter(c)){
                count++;
            }
            indexMap.putIfAbsent(c,new ArrayList<>());
            indexMap.get(c).add(i);
        }
        for(Map.Entry<Character,List<Integer>> n : indexMap.entrySet()){
            System.out.println(n.getKey()+":"+n.getValue());
        }

    }
    void displayKEY(){
        System.out.println("THE WORD TO FIND IS:"+unknown);
    }
}
class Hangman{
    public static void main(String[] args){
        Game g=new Game();
        g.displayKEY();
    }
}