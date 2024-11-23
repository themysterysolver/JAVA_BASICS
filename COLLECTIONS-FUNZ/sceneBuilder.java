public class sceneBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();//Initial capacity of 16!
        StringBuilder sb1=new StringBuilder(50);
        StringBuilder sb2=new StringBuilder("Hello love!");
        sb2.append("ab*!");//append
        System.out.println(sb2);
        sb2.insert(5," my");//insert at specific index
        System.out.println(sb2);
        sb.append("_malayalam");//append
        System.out.println(sb);
        sb.reverse();//reverse string
        System.out.println(sb);
        sb2.replace(0,5,"Hi");//replace(start,end,"str")
        System.out.println(sb2);
        sb2.delete(11,14);
        System.out.println(sb2);
        sb.setCharAt(sb.length()-1,'$');//set char at particular index
        System.out.println(sb);
        System.out.println(sb.length());//length
        String substring=sb.substring(0,3);//substring
        System.out.println(substring);
    }
}
