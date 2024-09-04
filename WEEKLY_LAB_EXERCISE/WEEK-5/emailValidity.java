import java.util.*;
class emailValidity{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003");
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER STRING1:");
        Boolean[] boo={false,false,false,false,false,false,false};
        //String s1="Arjun_1-sfdfds910@hamil.com";
        String s1=input.nextLine();
        System.out.println(Arrays.toString(boo));
        if(s1.length()>=25){
            boo[boo.length-1]=true;
        }
        if(s1.contains("_")){
            boo[boo.length-2]=true;
        }
        if(s1.contains("-")){
            boo[boo.length-3]=true;
        }
        if (s1.lastIndexOf('@')==s1.indexOf('@')) {
            boo[boo.length - 4] = true;
        }
        if(s1.endsWith(".com")||s1.endsWith(".in")||s1.endsWith(".edu")){
            boo[boo.length-5]=true;
        }
        if(s1.matches(".*\\d.*")){
            boo[0]=true;
        }
        if(s1.matches(".*[a-zA-Z].*")){
            boo[1]=true;
        }
        System.out.println(Arrays.toString(boo));
        String[] messages = {
            "The string must contain at least one number.",
            "The string must contain at least one alphabet.",
            "The string must end with .com, .in, or .edu.",
            "The string must contain exactly one '@' symbol.",
            "The string must contain a '-' character.",
            "The string must contain an '_' character.",
            "The string must be at least 25 characters long."
        };
        int i = 0;
        Boolean flag=true;
        while (i < boo.length) {
            if (!boo[i]) {
                System.out.println("Constraint failed: " + messages[i]);
                flag=false;
            }
            i++;
        }
        if(flag){
            String[] a=s1.split("@");
            System.out.println("The username is "+a[0]+"\nThe doamin name is "+a[1]);
        }
        else{
            System.out.println("RUN THE PROGRAM AGAIN!!");
        }

    }
}