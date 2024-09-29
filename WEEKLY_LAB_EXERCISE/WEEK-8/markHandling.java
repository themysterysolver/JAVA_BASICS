class invalidMarkException extends Exception{
    public invalidMarkException(String message){
        super(message);
    }
}
class Student{
    int marks;
    void setMark(int mark) throws invalidMarkException{
        if(mark<0 || mark>100){
            throw new invalidMarkException("The mark you tried to set is out of bound()");
        }
        marks=mark;
    }
    int getMark(){
        return marks;
    }
}
public class markHandling {
    public static void main(String[] args){
        System.out.println("2022503003\nR.Prabhakara Arjun\n");
        Student s=new Student();
        try {
            s.setMark(101);
        }catch(invalidMarkException e){
            System.out.println(e.getMessage());
        }
        System.out.println("s.setMark(101):"+s.getMark());
        s.getMark();
        try {
            s.setMark(55);
        }catch(invalidMarkException e){
            System.out.println(e.getMessage());
        }
        System.out.println("s.setMark(55):"+s.getMark());
    }
}
