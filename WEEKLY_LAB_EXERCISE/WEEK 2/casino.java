import java.util.*;
class casino{
    public static void main(String[] args){
        int credits=1000;
        Random r=new Random();
        System.out.println("Rolling the dice..........");
        int a=1+r.nextInt(6);
        int b=1+r.nextInt(6);
        System.out.println(a+" "+b+" CREDITS:"+credits);
        int sum=a+b;
        while(true){
            //System.out.println("Hello");
            if(credits==0||credits>=2000){
                if(credits==0){
                     System.out.println("You went bankrupt!");
                }
                else{
                     System.out.println("You won!");
                }
                break;
            }
            if(sum==7 || sum==11){
                credits+=100;
            }
            else if(sum==2||sum==3||sum==12){
                credits-=100;
            }
            a=1+r.nextInt(6);
            b=1+r.nextInt(6);
            sum=a+b;
            System.out.println(a+" "+b+" CREDITS:"+credits);
            
        }
    }

}