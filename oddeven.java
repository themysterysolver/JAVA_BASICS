public class oddeven{
    public static void main(String[] args){
        int x=10;
        if(x%2==0){
            System.out.println(x+" is even");
        }
        else{
            System.out.println(x+" is odd");
        }
        int y=x+10;
        while(x<y){
            x=x+1;
            System.out.print(x+" ");
        }
    }
}