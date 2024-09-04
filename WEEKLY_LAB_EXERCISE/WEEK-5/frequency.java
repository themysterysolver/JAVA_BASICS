import java.util.*; 
class frequency{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter input string!!");
        String s2=input.nextLine();
        //String s1="Hello world";
        int[] arrFreq=new int[26];
        //System.out.println(Arrays.toString(arrFreq));
        for(char c:s2.toLowerCase().toCharArray()){
            if(c>='a' && c<='z'){
                int index=c-'a';
                arrFreq[index]++;
            }
        }
        char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.print("\n[");
        for(char c:alpha){
            System.out.print(c+", ");
        }
        System.out.print("]\n");
        System.out.print(Arrays.toString(arrFreq));
    }
}