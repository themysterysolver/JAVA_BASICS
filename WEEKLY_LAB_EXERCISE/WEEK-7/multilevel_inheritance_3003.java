class Kingdom{
    String Kname="ANIMALIA";
}
class Phylum extends Kingdom{
    String Pname="CHORDATA";
}
class Classs extends Phylum{
    String Cname="MAMMALIA";
}
class Order extends Classs{
    String Oname="CARNIVORA";
}
class Family extends Order{
    String Fname="FELIDAE";
}
class Genus extends Family{
    String Gname;
    public void setGname(String n){
        Gname=n;
    }
}
class Species extends Genus{
    String Sname;
    public void setSname(String n){
        Sname=n;
    }
    void Printehh(){
        System.out.println(Kname+" "+Pname+" "+Cname+" "+Oname+" "+Gname+" "+Sname);
    }
}
class multilevel_inheritance_3003{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Species Cat=new Species();
        Cat.setGname("Felis");
        Cat.setSname("Catus");
        Cat.Printehh();

        Species Lion=new Species();
        Lion.setGname("Panthera");
        Lion.setSname("leo");
        Lion.Printehh();
    }
}