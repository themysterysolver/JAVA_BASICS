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
        }
        display();
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
class stackll {
    public static void main(String[] args) {
        System.out.println("R.Prabhakara Arjun\n2022503003");
        LinkedList stack = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value;
        System.out.println("\nMenu:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Exit");

        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}