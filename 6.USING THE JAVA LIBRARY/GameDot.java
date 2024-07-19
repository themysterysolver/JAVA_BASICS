import java.io.*;
import java.util.ArrayList;
public class GameHelper{
    public String getUserInput(String prompt){
        String inputLine=null;
        System.out.print(prompt+" ");
        try{
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if(inputLine.length()==0) return null;
        }
        catch(IOException e){
            System.out.println("IOexception: "+e);
        }
        return inputLine;
    }
}
class SimpleDotCom{
    ArrayList<Integer> locations;
    //int NoHits=0;
    void SetLocation(ArrayList<Integer> loc){
        locations=loc;
    }
    String CheckGuess(String guess){
        String result="Miss";
        int guessint=Integer.parseInt(guess);
        int index=locations.indexOf(guessint);
        if(index>=0){
            //NoHits++;
            locations.remove(index);
            result="Hit";
        }
        if(locations.isEmpty()){
                result="Kill";
        }
        return result;
    }
}
class GameDot{
    public static void main(String[] args){
        int NoOfGuesse=0;
        SimpleDotCom dot=new SimpleDotCom();
        GameHelper helper=new GameHelper();
        int RandomNo=(int)(Math.random()*5);
        ArrayList<Integer> location=new ArrayList<>();
        location.add(RandomNo);
        location.add(RandomNo+1);
        location.add(RandomNo+2);
        dot.SetLocation(location);
        Boolean isAlive=true;
        while(isAlive){
            String guess=helper.getUserInput("Enter your guess:");
            NoOfGuesse++;
            String result=dot.CheckGuess(guess);
            System.out.println(result);
            if(result.equals("Kill")){
                System.out.println("It took these many no of guesses:"+NoOfGuesse+"\n GAME OVER!!");
                break;
            }
        }
    }
}
