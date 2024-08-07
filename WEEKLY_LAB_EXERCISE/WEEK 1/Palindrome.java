import java.util.*;
class Palindrome{
        public static void main(String[] args){
        String p;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter string to check palindrome:");
        p=input.nextLine();
        Stack<String> s=new Stack<>();
        for (int i=0;i<p.length()/2;i++) {
            s.push(Character.toString(p.charAt(i)));
        }
        //System.out.print(s);
        boolean isPalindrome=true;
        for(int i=(p.length()+1/2);i<p.length();i++){
            //System.out.println(i+" "+s.peek());
            if(!s.pop().equals(Character.toString(p.charAt(i)))){
                continue;
            }
            else{
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
            System.out.print(p+" is a palindrome");
        else
            System.out.print(p+" is NOT a palindrome");
    }
}
