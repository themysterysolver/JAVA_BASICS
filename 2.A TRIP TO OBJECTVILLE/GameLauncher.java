class Player{
    int guess=0;
    String name="";
    boolean isRight=false;

    void StartGuess(){
        guess=(int)(Math.random()*10);
        System.out.println(name+" is guessing: "+guess);
    }
}
class GuessGame{
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();
    public GuessGame() { //constructor will learn it later!
        p1.name = "Player 1";
        p2.name = "Player 2";
        p3.name = "Player 3";
    }
    public void Startgame(){
        int target=(int)(Math.random()*10);
        System.out.println("Target number is: " + target); 
        while(true){
            p1.StartGuess();
            p2.StartGuess();
            p3.StartGuess();
            if (p1.guess==target){
                p1.isRight=true;
                System.out.println("we have a winner!");
            }
            if (p2.guess==target){
                p2.isRight=true;
            }
            if (p3.guess==target){
                p3.isRight=true;
            }
            if(p1.isRight||p3.isRight||p3.isRight){
                System.out.println("we have a winner!");
                System.out.println("player1 got it Right?"+p1.isRight);
                System.out.println("player2 got it Right?"+p2.isRight);
                System.out.println("player3 got it Right?"+p3.isRight);
                break;
            }
            else{
                System.out.println("Try again u all!!");
            }
        }
    }
}
public class GameLauncher{
    public static void main(String[] args){
        GuessGame game=new GuessGame();
        game.Startgame();
    }
}