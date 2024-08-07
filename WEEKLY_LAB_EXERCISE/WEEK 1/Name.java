import java.util.Scanner;
class Name{
    public static void main(String[] args){
        String n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        n=input.nextLine();
        for(int i=0;i<n.length();i++){
            System.out.println("charachter at"+i+":"+n.charAt(i));
        }
        System.out.println("String of length:"+n.length());
    }
}