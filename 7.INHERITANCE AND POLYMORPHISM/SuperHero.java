class Supps{
    String suit,tights,specialPower;
    void putOnSuit(){}
}
class friedMan extends Supps{
    friedMan(){
        suit="fried dress";
    }
}
class BlackPanther extends Supps{
    BlackPanther(){
        suit="Black panther vibraniusm suit";
    }
}
class SuperHero{
    public static void main(String[] args){
        System.out.println(new friedMan().suit+"\n"+new BlackPanther().suit+"\n"+new Supps().suit);
    }
}