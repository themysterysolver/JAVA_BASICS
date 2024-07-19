import java.io.*;
import java.util.*;

public class GameHelper {
    //placedotcom(),getuserinput()-Helps to get user input also to set locations for those three ships=DotComs
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize=49;
    private int [] grid =new int [gridSize];
    private int comCount = 0;

    public String getUserInput (String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader (
            new InputStreamReader(System.in));
            inputLine=is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch (IOException e){
            System.out.println("IOException: "+e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphacells=new ArrayList<String>();
        String[] alphacoords = new String [comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;
        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1){
            incr=gridLength;
        }
        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            //System.out.print("try" location);
            int x = 0;
            success = true;
            while (success && x < comSize){
                if (grid [location] == 0) {
                    coords [x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        success=false;
                    }
                    if (x>0 && (location % gridLength == 0)) {
                        success=false;
                    }
                }
                else{
                    // System.out.print("used " + location); //
                    success=false;
                }
            }
        }

        int x = 0;
        int row= 0;
        int column = 0;
        // System.out.println("\n");
        while (x < comSize) {
            grid[coords [x]] = 1;
            row= (int) (coords[x] / gridLength);
            column =coords [x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphacells.add(temp.concat (Integer.toString(row)));
            x++;
        }
            // System.out.print("coord "+x+"=" + alphaCelis
            // System.out.println("\n");
        return alphacells;
    }
}
class DotCom{
    //setname(),ie)To create 3DotComs=Ships!!
    private String name;
    private ArrayList<String> locationCells;
    public void setName(String nam){
        name=nam;
    }
    public String getName(){
        return name;
    }
    //setLocations()
    public void setLocations(ArrayList<String> loc){
        locationCells=loc;
    }
    //checkGuess()
    public String checkGuess(String str){
        String result="Miss";
        int index=locationCells.indexOf(str);
        if(index>=0){
            locationCells.remove(index);
            System.out.println("Nysh!!U Hit:"+name+":(");
            result="Hit";
        }
        if(locationCells.isEmpty()){
            result="Kill";
            System.out.println("Nysh!!U sunk:"+name+":(");
        }
        return result;    
    }
    
}

class RealGameDot{
    //dotComsList-create arraylist to hod three DotCom object
    private ArrayList<DotCom> dotComList=new ArrayList<DotCom>();
    private int NoOfGuesse=0;
    private GameHelper helper=new GameHelper();
    /*setupgame()-then each DotCom object(iteratively for elemnts in list) 
    should hold the location of those DotComs with help of placeDotCom()*/
    void setupGame(){
        DotCom one=new DotCom();
        DotCom two=new DotCom();
        DotCom three=new DotCom();
        one.setName("google.com");
        two.setName("youtube.com");
        three.setName("wow.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        for(DotCom Dcoms:dotComList){
            ArrayList<String> loc=helper.placeDotCom(3);
            Dcoms.setLocations(loc);
        }
        System.out.println("WELCOME TO SINK DOTCOM GAME!!");
        System.out.println("Sink the 3 ships named:"+one.getName()+","+two.getName()+","+three.getName()+" in 7*7 MATRIX CELL");
        System.out.println("Sink the ships in minimum no of guesses");
    }
    /*playingGame()-getUserInput() from helper then cherUserGuess*/
    private void playGame(){
        while(!dotComList.isEmpty()){
            String userguess=helper.getUserInput("Enter the guess in [A-Z][0-6] format:");
            checkUserGuess(userguess);
        }
        finishGame();
    }
    /* checkUserGuess()-hit,miss,kill*/
    private void checkUserGuess(String userguess){
        NoOfGuesse++;
        String result="Miss";

        for(DotCom Dcoms:dotComList){
            result=Dcoms.checkGuess(userguess);
            if(result.equals("Hit")){
                break;
            }
            else if(result.equals("Kill")){
                dotComList.remove(Dcoms);
                break;
            }
            System.out.println("U "+result+"ed "+Dcoms.getName());
        }
    }
    /*finishgame()*/
    private void finishGame(){
        System.out.println("All Dotcom are dead!");
        if(NoOfGuesse<=18){
            System.out.println("It took you: "+NoOfGuesse+" guesses");
        }
        else{
            System.out.println("Took you long enough: "+NoOfGuesse+" guesses");
        }
    }

    public static void main(String[] args){
        //Main function call!!
        RealGameDot game=new RealGameDot();
        game.setupGame();
        game.playGame();
    }
}