
import java.util.*;

// Node of a Stack
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

// Stack implementation using linked list
// Stack class 
public class Stack_using_linkedlist{

    Node top;
    Stack_using_linkedlist(){
        top=null;
    }

    // Push
    void push(int data){
        Node temp=new Node(data);
        if(top==null){
            top=temp;
        }
        else{
            temp.next=top;
            top=temp;
        }
    }

    // Pop
    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is : "+top.data);
            top=top.next;
        }
    }

    // Display
    void display(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            Node ptr=top;
            while(ptr!=null){
                System.out.println(ptr.data);
                ptr=ptr.next;
            }
        }
    }

    // Peek
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peek element : "+top.data);
        }
    }

    // Main function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack_using_linkedlist s1=new Stack_using_linkedlist();
        int c,data;
        System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Help\n6.Exit");
        while(true){
            System.out.print("Enter choice : ");
            c=sc.nextInt();
            switch(c){
                case 1 :    System.out.print("Enter element : ");
                            data=sc.nextInt();
                            s1.push(data);
                            break;
                case 2 :    s1.pop();break;
                case 3 :    s1.display();break;
                case 4 :    s1.peek();break;
                case 5 :    System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Help\n6.Exit");break;
                case 6 :    System.exit(0);
                default :   System.out.println("Entered wrong choice");
            }
        }
    }
}