import java.util.ArrayList;
import java.util.Scanner;

class sumavg{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no of elements:");
        int n=input.nextInt();
        ArrayList<Integer> L=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            System.out.print("\narray["+i+"]:");
            int b=input.nextInt();
            L.add(b);
        }
        System.out.println(L);
        int sum=0;
        for(int i:L){
            sum+=i;
        }
        System.out.println("SUM:"+sum);
        Double avg=(double)sum/(double)L.size();
        System.out.println("AVG:"+avg);

        
    }
}