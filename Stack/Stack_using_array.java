
import java.util.*;

// Stack implementation using array
// Stack class 
public class Stack_using_array{

    int arr[];
    int top;
    int size;

    Stack_using_array(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    // Checks whether stack is empty or not
    boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    // Checks whether stack is full or not
    boolean isFull(){
        if(top==size-1)
            return true;
        else
            return false;
    }

    // Push
    void push(int data){
        if(isFull())
            System.out.println("Stack is full");
        else
            arr[++top]=data;
    }

    // Pop
    void pop(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else
             System.out.println("Popped element is : "+arr[top--]);
    }

    // Peek
    void peek(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Peek element : "+ arr[top]);
    }

    // Display
    void display(){
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
        Stack_using_array s1=new Stack_using_array(n);
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