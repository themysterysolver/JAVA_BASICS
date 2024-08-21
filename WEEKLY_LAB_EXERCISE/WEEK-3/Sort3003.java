import java.util.*;
class Sort3003{
    static void line(ArrayList<Integer> l){
        String a="-";
        for(int i=0;i<l.size();i++){
            System.out.print(a.repeat(6));
        }
        System.out.println();
    }
    static void printl(ArrayList<Integer> l){
        System.out.print("|");
        for(int i:l){
            System.out.printf(" %3d |",i);
        }
        System.out.println();
    }
    static void printc(ArrayList<Integer> l){
        System.out.print("|");
        for(int i:l){
            System.out.printf(" %3c |",i);
        }
        System.out.println();
    }
    static void printi(ArrayList<Integer> l,int n){
        System.out.print("|");
        for(int i=0;i<n;i++){
            System.out.printf(" %3d |",i);
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003");
        System.out.print("Enter a number:");
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int n=input.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            if(r.nextBoolean()){
                l.add(65+r.nextInt(26));
            }
            else{
                l.add(97+r.nextInt(26));
            }
        }
        //System.out.println(l);
        Collections.sort(l);
        //System.out.println(l);
        line(l);
        printi(l,n);
        line(l);
        printl(l);
        line(l);
        printc(l);
        line(l);
    }
}