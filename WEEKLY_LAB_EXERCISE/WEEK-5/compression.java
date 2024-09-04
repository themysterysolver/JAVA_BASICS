import java.util.*; 
class strIntro{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        //String s1="aabbcccdddaabbccccc";
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE STRIGN TO BE COMPRESSED:");
        String s1=input.nextLine();
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
        if(finale.length()>s1.length()){
            System.out.println(s1);
        }
        else{
            System.out.println(finale);
        }
        

    }
}