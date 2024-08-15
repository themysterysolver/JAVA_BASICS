import java.util.*;
class Dayoftheweek{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("MONTH:");
        int m=input.nextInt();
        System.out.print("DAY:");
        int d=input.nextInt();
        System.out.print("YEAR:");
        int y=input.nextInt();
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;
        System.out.println(d0);
        HashMap<Integer,String> mapp=new HashMap<>();
        mapp.put(0,"Sunday");
        mapp.put(1,"Monday");
        mapp.put(2,"Tueday");
        mapp.put(3,"Wednesday");
        mapp.put(4,"Thursday");
        mapp.put(5,"Fridday");
        mapp.put(6,"Saturday");
        String f=mapp.get(d0);
        System.out.println("The day is "+f);
    }
}