import java.util.*; 
class strIntro{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        String s1="aabbcccdddaabbccccc";
        String finale="";
        int i=0;
        while(i<s1.length()){
            char curchar=s1.charAt(i);
            int count=0;
            while(i<s1.length() && s1.charAt(i)==curchar){
                count++;
                i++;
            }
            finale+=curchar;
            finale+=count;
        }
        System.out.println(finale);
    }
}