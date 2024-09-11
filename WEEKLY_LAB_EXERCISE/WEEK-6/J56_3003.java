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
    complex add(complex b){
        complex c=new complex();
        c.setReal(this.getReal()+b.getReal());
        c.setImaginary(this.getImaginary()+b.getImaginary());
        return c;
    }
    complex sub(complex b){
        complex c=new complex();
        c.setReal(this.getReal()-b.getReal());
        c.setImaginary(this.getImaginary()-b.getImaginary());
        return c;
    }
    complex multiplication(complex b){
        complex c=new complex();
        c.setReal(this.getReal()*b.getReal()-this.getImaginary()*b.getImaginary());
        c.setImaginary(this.getReal()*b.getImaginary()+b.getReal()*this.getImaginary());
        return c;
    }
    Boolean equals(complex c){
        return this.getReal()==c.getReal() && this.getImaginary()==c.getImaginary();
    }
    complex divide(complex b){
        complex c=new complex();
        c.setReal((this.getReal()*b.getReal()+this.getImaginary()*b.getImaginary())/(b.getReal()*b.getReal()+b.getImaginary()*b.getImaginary()));
        c.setImaginary((this.getReal()*b.getImaginary()-b.getReal()*this.getImaginary())/(b.getReal()*b.getReal()+b.getImaginary()*b.getImaginary()));
        return c;
    }
}
public class J56_3003 {
    public static void main(String[] args){
        complex a=new complex();
        complex b=new complex();
        System.out.println("The complex no:"+a.getReal()+"+"+a.getImaginary()+"i");
        a.setReal(10);a.setImaginary(15);
        b.setReal(10);b.setImaginary(15);
        a.display();
        System.out.println("The complex no a:"+a);
        System.out.println("The complex no b:"+b);
        complex sum=a.add(b);
        System.out.println("complex no addition(a+b):"+sum);
        complex sub=a.sub(b);
        System.out.println("complex no difference(a-b):"+sub);
        complex mul=a.multiplication(b);
        System.out.println("Complex no multiplication(a*b):"+mul);
        complex quo=a.divide(b);
        System.out.println("Complex no quotient(a/b):"+quo);
        Boolean isEqual=a.equals(b);
        System.out.println("a.equals(b):"+isEqual); 
    }
}
