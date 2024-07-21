//super(keyword) is used to continue the method rather than overriding!
//public memebers are inherited and private memebers are not inherited!
class Game{
    void Printehh(){
        System.out.println("1.HELLOHH!!");
    }
}
private class Gameh extends Game{
    void Printehh(){
        super.Printehh();
        System.out.println("2.HELLOHH!!");
    }
}
class Gameh2 extends Gameh{
    void Printehh(){
        super.Printehh();
        System.out.println("3.HELLOHH!!");
    }
}
class supp{
    public static void main(String[] args){
        Gameh a=new Gameh();
        a.Printehh();
        Gameh2 b=new Gameh2();
        a.Printehh();
    }
}