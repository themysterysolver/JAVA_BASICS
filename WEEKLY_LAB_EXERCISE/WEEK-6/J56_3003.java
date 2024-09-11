class complex{
    private double real,imaginary;
    complex(){
        this.real=0;
        this.imaginary=0;
    }
    double getReal(){
        return this.real;
    }
    double getImaginary(){
        return this.imaginary;
    }
    void setReal(double real){
        this.real=real;
    }
    void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
    void display(){
        System.out.println("The complex no:"+getReal()+"+"+getImaginary()+"i");
    }
    public String toString(){
        if(imaginary>=0){
            return real+"+"+imaginary+"i";
        }
        else{
            return real+"-"+Math.abs(imaginary)+"i";
        }
    }
    static complex add(complex a,complex b){
        complex c=new complex();
        c.setReal(a.getReal()+b.getReal());
        c.setImaginary(a.getImaginary()+b.getImaginary());
        return c;
    }
    static complex sub(complex a,complex b){
        complex c=new complex();
        c.setReal(a.getReal()-b.getReal());
        c.setImaginary(a.getImaginary()-b.getImaginary());
        return c;
    }
}
public class J56_3003 {
    public static void main(String[] args){
        complex a=new complex();
        complex b=new complex();
        System.out.println("The complex no:"+a.getReal()+"+"+a.getImaginary()+"i");
        a.setReal(100);a.setImaginary(15);
        b.setReal(15);b.setImaginary(69);
        a.display();
        System.out.println("The complex no a:"+a);
        System.out.println("The complex no b:"+b);
        complex sum=complex.add(a,b);
        System.out.println("a+b:"+sum);
        complex sub=complex.sub(a,b);
        System.out.println("a-b:"+sub);

    }
}
