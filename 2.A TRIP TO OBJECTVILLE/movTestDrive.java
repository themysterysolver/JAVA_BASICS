class Movie{
    String name;
    String genre;
    int rating;
    void print(){
        System.out.println("ABOUT MOVIE:\nMovie name:"+ name+"\nGenre:"+genre+"\nRating:"+rating);
    }
}
public class movTestDrive{
    public static void main(String[] args){
        Movie endgame=new Movie();
        endgame.name="AVENGERS_ENDGAME!!";
        endgame.genre="FICTION";
        endgame.rating=10;
        endgame.print();

        System.out.println("");

        Movie urname=new Movie();
        urname.name="Your name";
        urname.genre="Romance";
        urname.rating=9;
        urname.print();

    }
}