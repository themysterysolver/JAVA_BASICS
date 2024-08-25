import java.util.*;
class magic3003{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("R.Prabhakara Arjun\n2022503003");
        System.out.print("Enter a odd number(ROWS*COLS,n(Rows)=n(cols)) to generate a magic square:");
        int n=input.nextInt();
        if (n%2==0){
            System.out.println("You just can't understand what I said right!\nRun the program again!!");
            return;
        }
        int[][] magicsq=genMagicSq(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%4d",magicsq[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] genMagicSq(int n){
        int[][] magicsq=new int[n][n];
        int num=1;
        int row=0;
        int col=n/2;
        while(num<=n*n){ //3-->9(1,2,3,4,5,6,7,8,9)
            magicsq[row][col]=num++;
            int newr=(row+n-1)%n;
            int newc=(col+1)%n;
            if(magicsq[newr][newc]!=0){
                row=(row+1)%n;
            }
            else{
                row=newr;
                col=newc;
            }

        }
        return magicsq;
    }

}