class calArea{
    int calculateA(int width,int height){
        return width*height;
    }
}
public class Area{
    public static void main(String[] args){
        calArea ar=new calArea();
        int a=ar.calculateA(7,12);
        System.out.println("7+12="+a);
        short c=12;
        ar.calculateA(c,15); //this is legal!!!
        //ar.calculateA(2);
    }
}