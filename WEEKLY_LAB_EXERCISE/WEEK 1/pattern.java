import java.util.*;
class Display{
    void p1(String s){  //void NOT Void
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println();
    }
    //  '-' Left-align the character.,use width with format specifier and  concat!
    void p2(String s){
        int pt=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.printf("%"+(pt+j)+"c",s.charAt(j));
            }
            pt--;
            System.out.println();
        }
        System.out.println();
    }

    
}
class pattern{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enetr input:");
        String s=input.nextLine();
        System.out.println("The input is "+s);
        Display d=new Display();
        d.p1(s);
        d.p2(s);
    }
}