import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
public class QLL {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<10;i++){
            q.add(i);
        }
        System.out.println(q);
        System.out.println("Front:"+q.peek());
        System.out.println("pop():"+q.poll()+"\n"+q);//this returns null!!
        System.out.println("empty?:"+q.isEmpty());
        System.out.println("size:"+q.size());
        try {
            int removed = q.remove();//this throws an exception!!
        }
        catch(NoSuchElementException E){
            System.out.println(E.getMessage());
        }
    }
}
