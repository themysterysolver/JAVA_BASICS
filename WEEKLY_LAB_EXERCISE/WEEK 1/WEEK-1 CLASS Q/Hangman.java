import java.nio.file.Files; //nio-NEW I/O
import java.nio.file.Paths; //helps to get the txt file
import java.util.List;
import java.util.Random; // Generate a random integer between 0 (inclusive) and a specified upper bound (exclusive) ie) random.nextInt(100)-->0 to 99
import java.util.Scanner;
import java.io.IOException;
class Game{
    String unknown;
    Game(){
        try{
        List<String> word=Files.readAllLines(Paths.get("word.txt")); 
        Random r=new Random();
        unknown=word.get(r.nextInt(word.size()));
        System.out.print("THE WORD TO FIND IS:"+unknown);
        }
        catch(IOException e){
            System.out.println("oops,unable to load the game,try again!");
        }
    }
}
class Hangman{
    public static void main(String[] args){
        Game g=new Game();

    }
}