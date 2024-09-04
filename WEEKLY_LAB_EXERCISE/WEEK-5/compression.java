import java.util.*; 
class strIntro{
    public static void main(String[] args){
        System.out.println("R.Prabhakara Arjun\n2022503003\n");
        String s1="aabbcccdddaabbc";
        String finale="";
        for(int i=0;i<s1.length();i++){
            finale=finale+s1.charAt(i);
            int count=1;
            for(int j=i+1;j<s1.length();j++){
                if(j==s1.length()){
                    i=j;
                    finale=finale+String.valueOf(count);
                    break;
                }
                if(s1.charAt(i)==s1.charAt(j) ){
                    count++;
                }
                else{
                    i=j;
                    finale=finale+String.valueOf(count);
                    break;
                }
            }
        }
        System.out.println(finale);
    }
}