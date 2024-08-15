import java.util.Scanner;

public class modelAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bias = -0.5 ;
        int w1 = 1 , w2 = 1 ;

        System.out.print("Enter x1 : ");
        int x1 = scanner.nextInt();
        System.out.print("Enter x2 : ");
        int x2 = scanner.nextInt();

        double y =bias + (w1*x1) + (w2*x2);

        if( y > 0.5 ){
            System.out.println(1);
        }
        else if( y <= 0.5){
            System.out.println(0);
        }

    }
}
