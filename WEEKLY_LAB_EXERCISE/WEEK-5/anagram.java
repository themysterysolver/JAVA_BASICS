import java.util.*;
class anagram{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        /*String s1="abi is beautiful";
        String s2="beautiful is abi arjun";*/
        //I AM LORD VLODEMORT-------->TOM MARVOLO RIDDLE
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER STRING1:");
        String s1=input.nextLine();
        System.out.print("ENTER STRING2:");
        String s2=input.nextLine();
        char[] a=s1.replace(" ","").toCharArray();
        char[] b=s2.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b));
        if(Arrays.toString(a).length()!=Arrays.toString(b).length()){
            System.out.println("Not an anagram");
        }
        else if(Arrays.toString(a).equals(Arrays.toString(b))){
            System.out.println("Is a anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}