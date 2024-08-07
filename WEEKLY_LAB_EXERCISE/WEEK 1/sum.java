import java.util.Scanner;
class sum{
        public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=input.nextInt();
        System.out.print("Enter b:");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("a+b="+sum);
    }
}