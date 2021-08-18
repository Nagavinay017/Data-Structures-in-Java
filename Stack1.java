
import java.util.*;

// Stack implementation using array
// Stack class 
public class Stack1{

    int arr[];
    int top;
    int size;

    Stack1(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    // Checks whether stack is empty or not
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    // Checks whether stack is full or not
    public boolean isFull(){
        if(top==size-1)
            return true;
        else
            return false;
    }

    // Push
    public void push(int data){
        if(isFull())
            System.out.println("Stack is full");
        else
            arr[++top]=data;
    }

    // Pop
    public void pop(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else
             System.out.println("Popped element is : "+arr[top--]);
    }

    // Peek
    public void peek(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Peek element : "+ arr[top]);
    }

    // Display
    public void display(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }

    // Main function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the Stack : ");
        int n=sc.nextInt();
        Stack1 s1=new Stack1(n);
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
            }
        }
    }
}