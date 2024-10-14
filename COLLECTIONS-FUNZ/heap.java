import java.util.*;
class heap{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();//implememnts min-heap
        pq.add(1);//add element
        pq.add(2);
        pq.add(-1);
        pq.add(-2);
        if(!pq.isEmpty()){//checks if empty
            System.out.println("Topmost element:"+pq.peek());//peeks
        }
        System.out.println("Smallest element is popped:"+pq.poll());//pops
        System.out.println("Size of pq:"+pq.size());//get size
        System.out.println("BEFORE pq:"+pq);
        pq.clear();//clear pq
        System.out.println("AFTER pq:"+pq);
    }
}