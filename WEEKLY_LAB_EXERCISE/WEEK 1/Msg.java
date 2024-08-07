import java.util.*;
class user{
    String username;
    private static  int count=0;
    Stack<String> sentBox;
    Stack<String> inBox;
    public user(){
        Scanner input=new Scanner(System.in);
        System.out.print("you are user:"+count+"\nEnter your username:");
        username=input.nextLine();
        this.sentBox=new Stack<>();
        this.inBox=new Stack<>();
        count++;
    }
    void historySentBox(){
        for(int i=0;i<sentBox.size();i++){
            System.out.println(i+"Sent to:"+sentBox.get(i));
        }
    }
    void historyinBox(){
        for(int i=0;i<sentBox.size();i++){
            System.out.println(i+"Recieved from:"+sentBox.get(i));
        }
    }
    
}
class Msg{
    public static void main(String[]  args){
        user a=new user();
        user b=new user();
    }
}
