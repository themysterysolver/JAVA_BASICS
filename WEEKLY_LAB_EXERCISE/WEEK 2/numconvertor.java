import java.util.*;
class numconvertor{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 3 digit number from 0 to 999:");
        int num=input.nextInt();
        while(num>999 || num<0){
            System.out.print("Enter a VALID 3 digit number from 0 to 999:");
            num=input.nextInt();
        }
        ArrayList<Integer> n=new ArrayList<>();
        int a;
        while(num!=0){
            a=num%10;
            n.add(0,a);
            num=num/10;
        }
        System.out.println(n);
    }
}