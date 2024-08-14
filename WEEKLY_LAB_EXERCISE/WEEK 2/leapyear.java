import java.util.*;
class leapyear{
    static Boolean checkleap(int a){
        if((a%4==0 && a%100!=0) || a%400==0){
                System.out.println(a+" is a leap year!!");
                return true;
        }
        else{
            System.out.println(a+" is a NOT leap year!!");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER A YEAR:");
        int a=input.nextInt();
        while(a<=1000){
            System.out.print("CONSTRAINT VIOLATED!TRY AGAIN!!");
            a=input.nextInt();
        }
        checkleap(a);
        while(true){
            if(checkleap(++a)){
                break;
            }
        }
    }
}