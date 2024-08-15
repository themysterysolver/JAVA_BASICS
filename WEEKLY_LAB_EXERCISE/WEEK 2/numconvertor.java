import java.util.*;
class one_s{
    String s1;
    HashMap<Integer,String> digit_1=new HashMap<>();
    one_s(){
        digit_1.put(0,"");
        digit_1.put(1,"One");
        digit_1.put(2,"Two");
        digit_1.put(3,"Three");
        digit_1.put(4,"Four");
        digit_1.put(5,"Five");
        digit_1.put(6,"Six");
        digit_1.put(7,"Seven");
        digit_1.put(8,"Eight");
        digit_1.put(9,"Nine");
    }
    void one(ArrayList<Integer> n){
        s1=digit_1.get(n.get(n.size()-1));
        if (n.size()==1){
            System.out.println("The one digit number ----> "+s1);
        }
    }
}
class two_s extends one_s{
    String s2;
    HashMap<Integer,String> digit_2=new HashMap<>();
    two_s(){
        digit_2.put(0,"");
        //for eleven to ninteen
        digit_2.put(2,"Twenty");
        digit_2.put(3,"Thirty");
        digit_2.put(4,"Fourty");
        digit_2.put(5,"Fifty");
        digit_2.put(6,"Sixty");
        digit_2.put(7,"Seventy");
        digit_2.put(8,"Eighty");
        digit_2.put(9,"Ninenty");
    }
    void two(ArrayList<Integer> n){
        one(n);
        s2=digit_2.get(n.get(n.size()-2));
        if( n.size()==2){
            System.out.println("The Two digit number -----> "+s2+" "+s1);
        }
    }
}
class three_s extends two_s{
    String s3;
    void three(ArrayList<Integer> n){
        two(n);
        s3=digit_1.get(n.get(n.size()-3));
        if(n.size()==3){
            System.out.println("The Three digit number ----> "+s3+" Hundred and "+s2+" "+s1);
        }
    }
}
class Helper{
    Helper(ArrayList<Integer> n){
        int s=n.size();
        System.out.println(s);
        three_s number=new three_s();
        if(s==0){
            System.out.println("Zero");
        }
        else if(s==1){
            number.one(n);
        }
        else if(s==2){
            number.two(n);
        }
        else if(s==3){
            number.three(n);
        }
    }
}
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
        Helper z=new Helper(n);
    }
}