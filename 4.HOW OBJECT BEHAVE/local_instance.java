//local varaible must be initialised!
class wow{
    String name;
    void display(){
        String name1;
        System.out.println(name);
        //System.out.println(name1);  error: variable name1 might not have been initialized
    }
}
class local_instance{
    public static void main(String[] args){
        wow a=new wow();
        a.display();
    }
}