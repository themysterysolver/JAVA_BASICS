import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;             //not static bruhhh!(then all ll will have common head!)
    void insertBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        display();
    }
    void insertEnd(int data){
        Node newNode=new Node(data);
        Node current=head;
        Node prev=current;
        while(current!=null){ //stopping at previous!
            prev=current;
            current=current.next;
        }
        prev.next=newNode;
        display();
    }
    //1->2->3->4->5->6
    void insertPos(int pos,int data){
        int count=pos-1;
        if (pos==1){
            insertBeg(data);
        }
        else{
            Node newNode=new Node(data);
            Node current=head;
            while(count!=1){
                current=current.next;
                count--;
            }
            Node temp=current.next;
            current.next=newNode;
            newNode.next=temp;
        }
        display();

    }
    void insertAfterSpecific(int target,int data){
        Node current=head;
        Node newNode=new Node(data);
        Boolean flag=false;
        while(current!=null){
            if(target==current.data){
                flag=true;
                break;
            }
            current=current.next;
        }
        if(flag){
            Node temp=current.next;
            current.next=newNode;
            newNode.next=temp;
            display();
        }
        else{
            System.out.println(target+" data is NOT found!");
        }
    }
    void insertBeforeSpecific(int target,int data){
        Node current=head;
        Node newNode=new Node(data);
        if(current.data==target){
            insertBeg(data);
            return;
        }
        Boolean flag=false;
        while(current!=null){
            if(target==current.next.data){
                flag=true;
                break;
            }
            current=current.next;
        }
        if(flag){
            Node temp=current.next;
            current.next=newNode;
            newNode.next=temp;
            display();
        }
        else{
            System.out.println(target+" data is NOT found!");
        }
    }
    /*-----------------------------------------------INSERTION-END-----------------------------------------------------------------*/ 
    void delBeg(){
        head=head.next;
        display();
    }
    void delEnd(){
        Node current=head;
        Node prev=current;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
        display();
    }
    void delPos(int pos){
        int count=pos-1;
        if (pos==1){
            delBeg();
        }
        else{
            Node current=head;
            while(count!=1){
                current=current.next;
                count--;
            }
            current.next=current.next.next;
        }
        display();
    }
    void delVal(int target){
        Node current=head;
        if(current.data==target){
            delBeg();
            return;
        }
        Boolean flag=false;
        while(current!=null){
            if(target==current.next.data){
                flag=true;
                break;
            }
            current=current.next;
        }
        if(flag){
            current.next=current.next.next;
            display();
        }
        else{
            System.out.println(target+" data is NOT found!");
        }
    }
    
    /* ----------------------------------------------DELETION-END--------------------------------------------------------------------*/
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.printf("Null\n");
    }
    /*---------------------------------------------------DISPLAY------------------------------------------------------------------------ */
    void reverse(){
        if(head.next==null){
            return;
        }
        else{
            Node current=head;
            Node prev=null;
            Node nexti=null;
            while(current!=null){
                nexti=current.next;
                current.next=prev;
                prev=current;
                current=nexti;
            }
            head=prev;
        }
        display();
    }
    /*-----------------------------------------------------------REVERSE--------------------------------------------------------------- */
    void count(){
        Node current=head;
        int count=0;
        if(head.next==null){
            System.out.println("NO OF NODES:1");
            return;
        }
        while(current!=null){
            count++;
            current=current.next;
        }
        System.out.println("NO OF NODES:"+count);
    }
    /*-----------------------------------------------------------COUNT--------------------------------------------------------------- */
    void frequency(){
        HashMap<Integer,Integer> mapi=new HashMap<>();
        Node current=head;
        while(current!=null){
            if(mapi.containsKey(current.data)){
                mapi.put(current.data,mapi.get(current.data)+1);
            }
            else{
                mapi.put(current.data,1);
            }
            current=current.next;
        }
        System.out.println(mapi);
    } 
    /*-----------------------------------------------------------FREQUENCY--------------------------------------------------------------- */
    void concat(Node peak){
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=peak;
        display();
    }
    /*-------------------------------------------------------CONCATENATION-------------------------------------------------------------------------- */
    void sort(){
        display();
        ArrayList<Integer> arr=new ArrayList<>();
        Node current=head;
        while(current!=null){
            arr.add(current.data);
            current=current.next;
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        current=head;
        int i=0;
        while(current!=null){
            current.data=arr.get(i++);
            current=current.next;
        }
        display();
    }
    /*----------------------------------------------SORT-----------------------------------------------------------------------------------------*/
    void remDuplicate(){
        display();
        HashMap<Integer,Integer> mapi=new HashMap<>();
        Node current=head;
        while(current!=null){
            if(mapi.containsKey(current.data)){
                mapi.put(current.data,mapi.get(current.data)+1);
            }
            else{
                mapi.put(current.data,1);
            }
            current=current.next;
        }
        System.out.println(mapi);
        Boolean isDupi=false;
        for(int value:mapi.values()){
            if(value>=2){
                isDupi=true;
            }
        }
        if(!isDupi){
            System.out.println("No duplicates FOUND!!");
        }
        else{
           for(int key:mapi.keySet()){
                if(mapi.get(key)>1){
                    int temp=mapi.get(key);
                    while(temp!=0){
                        delVal(key);
                        temp--;
                    }
                }
        } 
        }
        display();
    }
    /*-------------------------------------------REMOVE DUPLICATES------------------------------------------------------------------------------- */
}
class ll{
    public static void main(String[] args){
        LinkedList link=new LinkedList();
        link.insertBeg(5);
        link.insertBeg(4);
        link.insertBeg(3);
        link.insertBeg(2);
        link.insertEnd(6);
        link.insertEnd(7);
        link.insertPos(2,100);
        link.insertPos(3,300);
        link.insertAfterSpecific(3,123);
        link.insertAfterSpecific(10,123);
        link.insertBeforeSpecific(3,6969);
        link.insertBeforeSpecific(2,1004);
        link.count();
        link.delBeg();
        link.delBeg();
        link.delEnd();
        link.delEnd();
        link.delEnd();
        link.delPos(1);
        link.delPos(3);
        link.delPos(2);
        link.delVal(123);
        link.insertEnd(6);
        link.insertEnd(7);
        link.reverse();
        link.count();
        link.frequency();
        LinkedList link1=new LinkedList();
        link1.insertBeg(1);
        link1.insertBeg(1);
        link1.insertBeg(2);
        link1.insertBeg(3);
        link1.insertBeg(4);
        link1.concat(link.head);
        link.sort();
        link.insertPos(2,100);
        link.insertPos(2,100);
        link.insertPos(2,100);
        link.insertPos(3,300);
        link.insertPos(3,300);
        link.insertPos(3,300);
        link.insertPos(3,300);
        link.insertEnd(10);
        link.insertEnd(10);
        link.insertEnd(10);
        link.insertEnd(10);
        link.insertEnd(10);
        link.remDuplicate();
    }
}