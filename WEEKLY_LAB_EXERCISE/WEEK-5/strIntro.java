import java.util.*; 
class strIntro{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        String s1="Java";
        String s2="Java";
        String s3=s2;
        String s4=new String("Java");
        String s5=new String("Java");
        String s6=new String("JaVa");
        String s7="Java Java va va";
        String s8="Abi😊!";
        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1.equals(s2):"+s1.equals(s2));
        System.out.println("s2==s3:"+(s2==s3));
        System.out.println("s1.equals(s3):"+s1.equals(s3));
        System.out.println("s1==s4:"+(s1==s4));
        System.out.println("s1.equals(s4):"+s1.equals(s4));
        System.out.println("s4==s5:"+(s4==s5));
        System.out.println("s5.equals(s4):"+s5.equals(s4));
        System.out.println("s1.equals(s6):"+s1.equals(s6));
        System.out.println("s1.equalsIgnoreCase(s6):"+s1.equalsIgnoreCase(s6));
        System.out.println("s1.compareTo(s6):"+s1.compareTo(s6));
        System.out.println("s1+s2:"+(s1+s2));
        System.out.println("s4+s5:"+(s4+s5));
        System.out.println("s1+s5:"+(s1+s5));
        System.out.println("s1.charAt(0):"+s1.charAt(0));
        System.out.println("s1.indexOf('a'):"+s1.indexOf('a'));
        System.out.println("s1.indexOf(\"av\"):"+s1.indexOf("av"));
        System.out.println("s7.lastIndexOf('a'):"+s7.lastIndexOf('a'));
        System.out.println("s7.lastIndexOf(\"av\"):"+s7.lastIndexOf("av"));
        System.out.println("s7.length():"+s7.length());
        System.out.println(s8+"s8.codePointCount(0,s8.length()):"+s8.codePointCount(0,s8.length()));
        System.out.println("s1.substring(3):"+s1.substring(3));
        System.out.println("s1.substring(3):"+s1.substring(1,3));
        System.out.println("s1.substring(3):"+s1.substring(0,s1.length()));
        System.out.println("s1.startsWith(\"Jav\"):"+s1.startsWith("Jav"));
        System.out.println("s1.endsWith(\"Jav\"):"+s1.endsWith("Jav"));
        System.out.println("s1.toLowerCase():"+s1.toLowerCase());
        System.out.println(s1);
        String s100=s1.toLowerCase();
        System.out.println(s100);
        System.out.println("s1.toUpperCase():"+s1.toUpperCase());
        System.out.println("\"       a-b-i     \":"+"       a-b-i     ".trim());
        String s99="Helooo hooo";
        //System.out.println("s99.replace('o',\"OoOo\"):"+s99.replace('o',"OoOo"));
        System.out.println("s99.replace('o',\"O\"):"+s99.replace('o','O'));
        System.out.println(s99);
        System.out.println("s99.replaceAll(\"o\",\"Ooo\"):"+s99.replaceAll("o","Ooo"));//takesboth as string as a parameter!
        System.out.println("s99.replaceFirst(\"o\",\"Ooo\"):"+s99.replaceFirst("o","Ooo"));
        System.out.println("s99.split(\"o\"):"+s99.split("o"));
        String s98="Helooo hoooO";
        System.out.println("Arrays.toString(s99.split(\"o\")):"+(Arrays.toString(s99.split("o"))));
        System.out.println("Arrays.toString(s98.split(\"o\")):"+(Arrays.toString(s98.split("o"))));
        System.out.println("Arrays.toString(s98.split(\"o\",4)):"+(Arrays.toString(s98.split("o",4))));
        System.out.println("Arrays.toString(s98.split(\"o\",3)):"+(Arrays.toString(s98.split("o",3))));//limit is atmost hence limit-1parts as split
        System.out.println("s1.toCharArray():"+(s1.toCharArray()));
        System.out.println("Array.toString(s1.toCharArrays()):"+Arrays.toString(s1.toCharArray()));
        System.out.println(s8+"s8.codePointAt(0):"+s8.codePointAt(0));
        System.out.println(s8+"s8.codePointAt(s8.length()-1):"+s8.codePointAt(s8.length()-1));
        System.out.println("s1.contains(s2):"+s1.contains(s2));
        System.out.println("String.join(\"-\",s1,s2,s3,s4,s5,s6):"+String.join("-",s1,s2,s3,s4,s5,s6));
    }
}