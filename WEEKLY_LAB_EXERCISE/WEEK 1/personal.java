import java.util.Scanner;
class info{
    private String mobileno;
    private String name;
    private double cgpa;
    void display(){
        System.out.println("mobileno:"+mobileno+"\nname:"+name+"\ncgpa:"+cgpa);
    }
    void getInfo(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter mobileno:");
        mobileno=input.nextLine();
        System.out.print("\nenter name:");
        name=input.nextLine();
        System.out.print("\nenter cgpa:");
        cgpa=input.nextDouble();
        display();
    }
}
class personal{
    public static void main(String[] args){
        info student1=new info();
        student1.getInfo();
    }
}