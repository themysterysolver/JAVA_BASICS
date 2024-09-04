import java.util.*;
class productVersionComparison{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.println("x.x.x(kindly enter number in this format!)");
        System.out.print("ENTER STRING1:");
        String s1=input.nextLine();
        System.out.print("ENTER STRING2:");
        String s2=input.nextLine();
        //String s1="12.13.14";
        //String s2="12.13.14";
        String[] a=s1.split("\\.");
        String[] b=s2.split("\\.");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(a.length!=b.length){
            System.out.println("No comparisons can be mad bruh!!");
            return;
        }
        for(int i=0;i<a.length;i++){
            if(Integer.parseInt(a[i])>Integer.parseInt(b[i])){
                System.out.println(s1+" is greater!");
                return;
            }
            else if(Integer.parseInt(a[i])<Integer.parseInt(b[i])){
                System.out.println(s2+" is greater!");
                return;
            }
        }
        System.out.println(s1+" is equal to "+s2);
    }
}