import java.util.*;
class user{
    private String username;
    private String sMsg,rMsg;
    user(String s){
        username=s;
    }
    void setsMsg(String a){
        sMsg=a;
        System.out.println(username+" SENT: "+a);
    }
    void setrcvMsg(String b){
        rMsg=b;
        System.out.println(username+" RECIEVED: "+b);
    }
    String getMsg(){
        return sMsg;
    }
}
class Msg{
    public static void main(String[]  args){
        System.out.print("PRIMITIVE CHAT APPLICATION!");
        Scanner input=new Scanner(System.in);
        user a=new user("USER1");
        user b=new user("USER2");
        while(true){
            System.out.print("\nSEND MESSAGE FROM USER-1 TO  USER-2:");
            a.setsMsg(input.nextLine());
            b.setrcvMsg(a.getMsg());
            System.out.println("\nSEND MESSAGE FROM   USER-2 TO USER-1:");
            b.setsMsg(input.nextLine());
            a.setrcvMsg(b.getMsg());
            System.out.println("Press N to break!");
            char c=input.nextLine().charAt(0);
            if(c=='N'){
                System.out.println("-----------------------CHAT ENDS----------------------");
                break;
            }
        }
    }
}
