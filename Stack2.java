
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

public class Stack2{

    Node top;
    Stack2(){
        top=null;
    }

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

    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is : "+top.data);
            top=top.next;
        }
    }

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

    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peek element : "+top.data);
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack2 s2=new Stack2();
        int c,data;
        System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Help\n6.Exit");
        while(true){
            System.out.print("Enter choice : ");
            c=sc.nextInt();
            switch(c){
                case 1 :    System.out.print("Enter element : ");
                            data=sc.nextInt();
                            s2.push(data);
                            break;
                case 2 :    s2.pop();break;
                case 3 :    s2.display();break;
                case 4 :    s2.peek();break;
                case 5 :    System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Help\n6.Exit");break;
                case 6 :    System.exit(0);
            }
        }
    }
}