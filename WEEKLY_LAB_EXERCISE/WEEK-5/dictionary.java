import java.util.*;
class dictionary{
    static String[][] dictionaryee = {
        {"Java", "Pure object-oriented programming language by James Gosling"},
        {"C++", "Object-oriented programming language by Bjarne Stroustrup"},
        {"Python", "High-level programming language by Guido van Rossum"},
        {"JavaScript", "High-level, interpreted scripting language primarily used in web development"},
        {"C", "General-purpose procedural programming language by Dennis Ritchie"},
        {"Ruby", "Dynamic, reflective, object-oriented language used for web applications"},
        {"Swift", "Powerful and intuitive programming language for iOS and macOS apps"},
        {"Go", "Open-source programming language that makes it easy to build simple, reliable software"},
        {"Rust", "Systems programming language focused on safety and concurrency"},
        {"PHP", "Server-side scripting language primarily used for web development"}
    };
    public static String getDef(String lang){
        for(int i=0;i<dictionaryee.length;i++){
            if(dictionaryee[i][0].equalsIgnoreCase(lang)){
                return dictionaryee[i][0]+"-->"+dictionaryee[i][1];
            }
        }
        return "LANG NOT FOUND!";
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        System.out.print("ENTER THE LANG TO SEARCHED:");
        //String s1="java";
        String s1=input.nextLine();
        String def=getDef(s1);
        System.out.println(def);
    }
}