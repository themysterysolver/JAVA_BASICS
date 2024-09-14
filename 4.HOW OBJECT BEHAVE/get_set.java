//convention to use getters() and setter()
//instance varaible as private and methods public
class human{
    public String name;
    private int height;
    int getHt(){
        return height;
    }
    void setHt(int x){
        height=x;
    }
    void getName(){
        System.out.println(name);
    }

}
class get_set{
    public static void main(String[] args){
        human a=new human();
        a.name="hello";
        a.getName();
        //a.height=10; //height has private access in human
        System.out.println(a.getHt());
        a.setHt(100);
        System.out.println(a.getHt());
    }
}