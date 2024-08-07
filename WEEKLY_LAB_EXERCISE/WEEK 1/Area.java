import java.util.*;
class Square{
    private int s1,s2;
    public void setSquare(){  
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter side:");
        s1=input.nextInt();
        s2=s1;
    }
    public void setSquare(int a,int b){
        s1=a;
        s2=b;
    }
    public void findArea(){
        int ar=s1*s2;
        System.out.print("\nArea:"+ar);
    }
    public void findPerimeter(){
        int pm=2*(s1+s2);
        System.out.print("\nPerimeter:"+pm);
    }
}
class Rectangle extends Square{
    public void setRectangle(){  
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter length:");
        int a=input.nextInt();
        System.out.print("\nEnter breadth:");
        int b=input.nextInt();
        setSquare(a,b);
    }
}
class Triangle{
    private int s1,s2,s3;
    public Triangle(){
        s1=0;
        s2=0;
        s3=0;
    }
    public Triangle(int s1,int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    void getSides(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter side-1:");
        s1=input.nextInt();
        System.out.print("Enter side-2:");
        s2=input.nextInt();
        System.out.print("Enter side-3:");
        s3=input.nextInt();
    }
    void viewSides(){
        System.out.print("side-1:"+s1+"\nside-2:"+s2+"\nside-3:"+s3);
    }
    void findArea(){
        float s=(float)(s1+s2+s3)/2;
        float ar=(float)Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.print("\nArea:"+ar);
    }
    void findPerimeter(){
        int pm=s1+s2+s3;
        System.out.print("\nPerimeter:"+pm);

    }

}
class Area{
    public static void main(String[] args){
        Triangle tr=new Triangle();
        tr.getSides();
        tr.viewSides();
        tr.findArea();
        tr.findPerimeter();
        Square sq=new Square();
        sq.setSquare();
        sq.findArea();
        sq.findPerimeter();
        Rectangle rc=new Rectangle();
        rc.setRectangle();
        rc.findArea();
        rc.findPerimeter();

        
    }
}