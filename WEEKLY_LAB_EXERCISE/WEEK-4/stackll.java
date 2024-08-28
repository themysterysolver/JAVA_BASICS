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
    Node head;
    Node top;             //not static bruhhh!(then all ll will have common head!)
    void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
            head=top;
        }
        else{
            top.next=newNode;
            top=newNode;
        }
        display();
    }
    /*-----------------------------------------------INSERTION-END-----------------------------------------------------------------*/ 
    void pop(){
        if(head==null) {
            System.out.println("Stack is empty");
            return;
        }
        if(head.next==null){
            head=null;
            top=null;
        }
        else{
            Node current=head;
            Node prev=current;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            display();
        }
    }
    
    /* ----------------------------------------------DELETION-END--------------------------------------------------------------------*/
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"|");
            current=current.next;
        }
        System.out.printf("Null\n");
    }
    /*---------------------------------------------------DISPLAY------------------------------------------------------------------------ */
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The top of the stack is "+top.data);
        }
    }
}
class stackll{
    public static void main(String[] args){
        LinkedList stack=new LinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(1);
        stack.peek();
        stack.push(2);
        stack.peek();
        stack.push(5);
        stack.peek();

    }
}