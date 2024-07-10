public class random_length{
    public static void main (String[] args){
        String[] s1={"a","b","i"};//String[] s1={'a','b','i'}; NO SINGLE QUOTES IT SEEMS!
        String[] s2={"a","r","j","u","n"};
        int l1=s1.length;
        int l2=s2.length;
        System.out.println(s1+" is of length"+l1+"\n"+s2+"is of length"+l2);
        int i=0;
        while(i<10){
            System.out.println(Math.random());
            System.out.println(Math.random()*l1+" "+Math.random()*l2);
            System.out.println((int)(Math.random()*l1)+" "+(int)(Math.random()*l2));
            i=i+1;
        }
    }
}