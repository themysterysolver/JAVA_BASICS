
class DotCom{
    //setname(),ie)To create 3DotComs=Ships,name them!!
    String name;
    void setName(String nam){
        name=nam;
    }
    //setLocations()
    //checkGuess()
}
class GameHelper{
    //placedotcom(),getuserinput()-Helps to get user input also to set locations for those three ships=DotComs
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
            ArrayList<String> loc=helper.placedDotCom(3);
            Dcoms.setLocations(loc);
        }
        System.out.println("WELCOME TO SINK DOTCOM GAME!!");
        System.out.println("Sink the 3 ships named:"+one.name+","+twon.name+","three.name+" in 7*7 MATRIX CELL");
        System.out.println("Sink the ships in minimum no of guesses");
    }
    /*playingGame()-getUserInput() from helper then cherUserGuess*/
    /* checkUserGuess()-hit,miss,kill*/
    /*finishgame()*/
    public static void main(String[] args){
        //Main function call!!
        RealGameDot game=new RealGameDot();
        game.setupGame();
        game.playGame();
    }
}