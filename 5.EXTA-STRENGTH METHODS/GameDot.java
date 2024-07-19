import java.io.*;
//This game has a logical error,which counts the same no of guesses multiple time,this will be improved in next MODULE.
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
    int[] locations;
    int NoHits=0;
    void SetLocation(int[] loc){
        locations=loc;
    }
    String CheckGuess(String guess){
        String result="Miss";
        int guessint=Integer.parseInt(guess);
        for(int cell:locations){ //int cells: //should initialse the iteratble!
            if(cell==guessint){
                NoHits++;
                result="Hit";
                break;
            }
        }
        if(NoHits==locations.length){
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
        int[] location={RandomNo,RandomNo+1,RandomNo+2};
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
